package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CreateCourseStudentDemo {
	
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
				//creating the course
				Course course=new Course("java full stack");
				
				//save the course
				session.save(course);
				
				//creating the students
				Student student1=new Student("john");
				Student student2=new Student("tom");
				
				//adding courses to the student
				student1.addCourse(course);
				student2.addCourse(course);
				
				//saving the student
				session.save(student1);
				session.save(student2);
				
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
