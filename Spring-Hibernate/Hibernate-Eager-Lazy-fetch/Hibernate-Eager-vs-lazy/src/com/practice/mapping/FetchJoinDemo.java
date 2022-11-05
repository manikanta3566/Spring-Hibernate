package com.practice.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {
	
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
				int studentId=2;
				Query<Student> query=session.createQuery("select s from Student s "
						+ "JOIN FETCH s.courses "
						+ "where s.id=:studentId",Student.class);
				query.setParameter("studentId", studentId);
				Student student=query.getSingleResult();
				
				System.out.println(student);
				
				System.out.println("--------------------------");
				
				System.out.println(student.getCourses());
		
				//commit the transaction
				session.getTransaction().commit();
				
				//closing the session
				session.close();
				
				System.out.println("session closed");
				
				System.out.println(student.getCourses());
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
				factory.close();
			}
		}
}
