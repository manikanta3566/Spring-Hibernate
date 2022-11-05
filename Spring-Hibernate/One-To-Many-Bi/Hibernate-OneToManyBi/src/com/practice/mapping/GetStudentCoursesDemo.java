package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetStudentCoursesDemo {
	
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
				
				//getting the student from db by student id
				int studentId=1;
				Student student=session.get(Student.class,studentId);
				
				System.out.println(student);
				
				System.out.println("--------------------------");
				
				System.out.println(student.getCourses());
		
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
