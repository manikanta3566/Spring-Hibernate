package com.practice.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.jsp.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username="root";
	String password="123456789";
	String jdbcUrl="jdbc:mysql://localhost:3306/customer_db";
	String driver="com.mysql.cj.jdbc.Driver";
	try {
		PrintWriter printWriter=response.getWriter();
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(jdbcUrl,username,password);
		printWriter.write("connected to db");
		System.out.println("connected to db");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
