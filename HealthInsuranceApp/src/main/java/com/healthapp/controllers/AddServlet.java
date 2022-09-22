package com.healthapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthapp.model.Plan;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Plan plan=new Plan();
		String planName = request.getParameter("planName");
		String brand = request.getParameter("brand");
		String coverage = request.getParameter("coverage");
		String category = request.getParameter("category");
		double sumInsured = Double.parseDouble(request.getParameter("sumInsured"));
		plan.setPlanName(planName);
		plan.setBrand(brand);
		plan.setCoverage(coverage);
		plan.setCategory(category);
		plan.setSumInsured(sumInsured);
		request.setAttribute("plan", plan);
		RequestDispatcher dispacter = request.getRequestDispatcher("success.jsp");
		dispacter.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
