package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AddCoursesToStudentDemo {
	
	public static void main(String[] args) {
	//create the session factory
			SessionFactory factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Course.class)
					.buildSessionFactory();
			
			//create the session
			Session  session=factory.getCurrentSession();
			
			try {		
					
				//begin the transaction
				session.beginTransaction();
				
				//getting the student by id
				int studentId=2;
				Student student=session.get(Student.class, studentId);
				
				//creating the courses
				Course course1=new Course("python full stack");
				Course course2=new Course("andriod development");
				
				//adding student to the courses
				course1.addStudents(student);
				course2.addStudents(student);
				
				//save the course
				session.save(course1);
				session.save(course2);
				
				
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
