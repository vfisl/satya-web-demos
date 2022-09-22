package com.student.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet(name = "RegisterServlet", urlPatterns = { "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//get the writer of the browser
		PrintWriter out=response.getWriter();
		//get the data from the jsp page
		String username=request.getParameter("studentName");
		int id=Integer.parseInt(request.getParameter("studentId"));
		String language=request.getParameter("language");
		String[] hobbies=request.getParameterValues("hobby");
		out.print("<html><body>");
		out.print("<strong>I am  "+username+"</strong><br>");
		out.print("<br>My id is " +id);
		out.print("<br>My favourite programming language is " +language);
		out.print("<br>My hobbies are.....  ");
		Stream.of(hobbies).forEach(out::println);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
