package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {
	
	public static void main(String[] args) {
	//create the session factory
			SessionFactory factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(StudentDetail.class)
					.addAnnotatedClass(Course.class)
					.buildSessionFactory();
			
			//create the session
			Session  session=factory.getCurrentSession();
			
			try {		
					
				//begin the transaction
				session.beginTransaction();
				
				//getting the course from db by course id
				int courseId=1;
				Course course=session.get(Course.class,courseId);
				
			   //delete the course
				session.delete(course);
		
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
