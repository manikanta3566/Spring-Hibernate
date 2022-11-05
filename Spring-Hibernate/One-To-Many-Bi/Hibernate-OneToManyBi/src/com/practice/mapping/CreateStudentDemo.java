package com.practice.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
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
			
			//creating the objects 
			Student student1=new Student("john");
			
			StudentDetail studentDetail=new StudentDetail("coding");
			student1.setStudentDetail(studentDetail);
			
			
			//begin the transaction
			session.beginTransaction();
			
			//save the object to db
	
//			Course course1=new Course();
//			course1.setCourseName("python full stack");
//			course1.setStudent(student1);
//			Course course2=new Course();
//			course2.setCourseName("microservices");
//			course2.setStudent(student1);
//		    Course course3=new Course();
//		    course3.setCourseName("react js");
//		    course3.setStudent(student1);
//		    session.save(course1);
//		    session.save(course2);
//		    session.save(course3);
		    
//			student1.setCourses(List.of(course1,course3));
		    session.save(student1);
	
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
