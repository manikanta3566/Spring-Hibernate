package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.entity.Student;

public class DeleteStudent {

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
			
		    //getting the student whose id=1 for deleting
			Student student=session.get(Student.class,studentId);
			
			//deleting the student
			session.delete(student);
			
			//deleting the student using createquery method
			session.createQuery("delete Student s where s.id='2'").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
