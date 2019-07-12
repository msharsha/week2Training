package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class AdminUpServlet
 */
public class AdminUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("f1");
		int age = Integer.parseInt(request.getParameter("f2"));
		String pwd = request.getParameter("f3");
		Employee e = new Employee(name,age,pwd,"nadmin");
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		EmpDao obj = (EmpDao)factory.getBean("empdao");
		if(obj.insert(e)) {
			RequestDispatcher rd =request.getRequestDispatcher("ValidAdminInsert.jsp");
			rd.forward(request,response); 
		}
		else {
			RequestDispatcher rd =request.getRequestDispatcher("InvalidAdminInsert.jsp");
			rd.include(request, response); 
		}
	}

}
