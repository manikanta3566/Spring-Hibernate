package com.practice.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDemo {

public static void main(String[] args) {
		
		//create the session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		//create the session
		Session  session=factory.getCurrentSession();
		
		try {
			
			//begin the transaction
			session.beginTransaction();
		
			
			//getting the instructor object by id
			int id=3;
			InstructorDetail instructorDetail = session.get(InstructorDetail.class,id);
			
			System.out.println(instructorDetail);
			
			System.out.println(instructorDetail.getInstructor());
			
			//breaking the link of bidirectional
			instructorDetail.getInstructor().setInstructorDetail(null);
			
			//deleting the object
			session.delete(instructorDetail);
			
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
