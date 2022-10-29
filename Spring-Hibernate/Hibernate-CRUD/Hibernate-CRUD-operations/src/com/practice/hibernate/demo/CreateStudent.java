package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
	
		//create the session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create the session
		Session  session=factory.getCurrentSession();
		
		try {
			
			//create the student object
			Student student=new Student("admin","t","admin.t@gmail.com");
			
			//begin the transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student);
			
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
