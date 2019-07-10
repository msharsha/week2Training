package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println("<h1>UnAuthorized access to this page</h1>");
		pw.println("<h3>To try again <a href='login.html'>Click here</a> </h3>");
		ServletContext ctx = request.getServletContext();
		String comp = ctx.getInitParameter("company");
		pw.println("<h2>Company is "+comp+"</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("t1");
		String password = request.getParameter("t2");
		PrintWriter out = response.getWriter();
		if(name.equals(password)) {
//			out.println("<h1>");
//			out.println("Welcome "+ name);
//			out.println("</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("final");
			rd.forward(request, response);
		}
		else {
			out.println("<h1>Sorry invalid credentials</h1>");
		//	out.println("<h3>To try again <a href='login.html'>Click here</a> </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
