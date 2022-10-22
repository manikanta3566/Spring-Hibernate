package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbcConnection {

	public static void main(String[] args) {
	String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker";
	String username="hbstudent";
	String password="hbstudent";
	try {
		Connection con=DriverManager.getConnection(jdbcUrl, username, password);
		System.out.println("connected successfully "+con.getCatalog());
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
