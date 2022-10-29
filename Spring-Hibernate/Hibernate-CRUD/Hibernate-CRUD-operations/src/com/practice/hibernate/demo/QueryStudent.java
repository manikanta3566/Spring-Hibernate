package com.practice.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {
	
		//create the session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create the session
		Session  session=factory.getCurrentSession();
		
		try {
			
			//begin the transaction
			session.beginTransaction();
            
			//querying the student
			
			//getting all the students
			List<Student> students = session.createQuery("from Student").list();
			
			displayStudent(students);
			
			//getting all the students whose firstName is admin
			System.out.println("\n\n students whose first name is admin");
			students=session.createQuery("from Student s where s.firstName='admin'").list();
			
			displayStudent(students);
			
			//getting all the students whose firstname is admin or lastname is dev
			System.out.println("\n\nstudents whose firstname is admin or lastname is dev");
			students=session.createQuery("from Student s where s.firstName='admin' or s.lastName='dev'").list();
			displayStudent(students);
			
			//getting all students whose email ends with gmail.com
			System.out.println("\n\nstudents whose email ends with gmail.com");
			students=session.createQuery("from Student s where s.email LIKE '%gmail.com'").list();
			displayStudent(students);
			
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

	private static void displayStudent(List<Student> students) {
		for(Student student:students) {
			System.out.println(student);
		}
	}

}
