package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.entity.Student;

public class ReadStudent {

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
			Student student=new Student("john","dev","john.dev@gmail.com");
			
			//begin the transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student);
			
			//commit the transaction
			session.getTransaction().commit();
			
			//getting student by student id

			//creating the session
			session=factory.getCurrentSession();
			
			//begin the transaction
			session.beginTransaction();
			
			//reading the student by primary key id
			Student student2 = session.get(Student.class,student.getId());
			
			System.out.println(student2);
			
			//commit the transaction
			session.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
