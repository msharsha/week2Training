package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String name;
  
    public ConfigDemo() {
        super();
      
    }


	public void init(ServletConfig config) throws ServletException {
		name = config.getInitParameter("user");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.getWriter().println("<h1> Good Morning "+name+"</h1>");
		ServletContext ctx = request.getServletContext();
		String comp = ctx.getInitParameter("company");
		pw.println("<h2>Company is "+comp+"</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
