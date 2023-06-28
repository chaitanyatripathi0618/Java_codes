package com.lpu.chai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo_01
 */
public class demo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo_01() {
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		int sub1 = Integer.parseInt(request.getParameter("sub1")); 
		int sub2 = Integer.parseInt(request.getParameter("sub2")); 
		out.println("ID : " + id + "<br>"); 
		out.println("NAME : " + name + "<br>");
		out.println("DOB : " + dob + "<br>");
		out.println("SUBJECT 1 MARKS : " + sub1 + "<br>");
		out.println("SUBJECT 2 MARKS : " + sub2 + "<br>");
		out.println("Total Marks ="+(sub1+sub2));
		out.close();
	}

}
