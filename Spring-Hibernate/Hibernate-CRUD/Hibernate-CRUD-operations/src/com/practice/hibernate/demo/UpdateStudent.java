package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
	
		//create the session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create the session
		Session  session=factory.getCurrentSession();
		
		try {
			Long studentId=1l;
			
			//begin the transaction
			session.beginTransaction();
			
			Student student = session.get(Student.class,studentId);
			
			//updating lastname of student id=1
			student.setLastName("lead");
		
			
			//commit the transaction
			session.getTransaction().commit();
			
			
			//bulk updating email address
			session=factory.getCurrentSession();
			
			//begin the transaction
			session.beginTransaction();
			
			//update query
			session.createQuery("update Student s set s.email='default@gmail.com'").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
