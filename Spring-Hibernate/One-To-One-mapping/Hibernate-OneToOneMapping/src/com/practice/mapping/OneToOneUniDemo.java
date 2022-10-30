package com.practice.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniDemo {

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
			
			//create the objects
		/*	Instructor instructor=new Instructor("javacode","javacode@gmail.com");
			
			InstructorDetail instructorDetail=new InstructorDetail("javacodeyoutube","coding");
			
			instructor.setInstructorDetail(instructorDetail); 
			
			*/
            Instructor instructor=new Instructor("techie","techie@gmail.com");
			
			InstructorDetail instructorDetail=new InstructorDetail("techie","reading books");
			
			instructor.setInstructorDetail(instructorDetail); 
			
			
			
			//begin the transaction
			session.beginTransaction();
			
			//save the object to db
			session.save(instructor);
			
			//getting the instructor object by id
//			int id=1;
//			Instructor instructor = session.get(Instructor.class,id);
			
			//deleting the object from db
//			session.delete(instructor);
			
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

	
}
