package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseDemo {
	
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
				
				//adding courses to student
				Course course1=new Course("python full stack");
				course1.setStudent(student);
				Course course2=new Course("microservices");	 
				course2.setStudent(student);
				student.setCourses(List.of(course1,course2));
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
