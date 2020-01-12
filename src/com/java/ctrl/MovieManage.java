package com.java.ctrl;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Dao.MovieDao;
import com.java.been.Movie;

/**
 * Servlet implementation class ShowM
 */
@WebServlet("/MovieManage")
public class MovieManage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		MovieDao movieDao = new MovieDao();
		int result = 0;
		if ("addMovie".equals(op)) {

			String name = request.getParameter("Name");
			String type = request.getParameter("Type");
			String playTime = request.getParameter("PlayTime");
			playTime = playTime.replace("T"," ");


			int duration = Integer.parseInt(request.getParameter("Duration"));
			String describe = request.getParameter("Describe");
			int price = Integer.parseInt(request.getParameter("Price"));
			Movie movie = new Movie(name, type, playTime, duration, describe, price);
			result = movieDao.addMovie(movie);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowM.jsp");
			} else {
				response.sendRedirect("admin/AdmAddM.jsp");
			}

		} else if ("delMovie".equals(op)) {
			int mId = Integer.parseInt(request.getParameter("MId"));
			result = movieDao.delMovie(mId);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowM.jsp");
			} else {
				response.sendRedirect("admin/AdmShowM.jsp");
			}

		} else if ("updMovie".equals(op)) {
			int mId = Integer.parseInt(request.getParameter("MId"));
			String name = request.getParameter("Name");
			String type = request.getParameter("Type");
			
			String playTime = request.getParameter("PlayTime");
			
			playTime = playTime.replace("T"," ");
        	System.out.println("");

			int duration = Integer.parseInt(request.getParameter("Duration"));
			String describe = request.getParameter("Describe");
			int price = Integer.parseInt(request.getParameter("Price"));
			Movie movie = new Movie(mId, name, type, playTime, duration, describe, price);
			result = movieDao.updateMovie(movie);
		
			if (result == 1) {
				response.sendRedirect("admin/AdmShowM.jsp");
			} else {
				response.sendRedirect("admin/AdmUpdM.jsp?MId="+mId);
			}
		}

	}

}
