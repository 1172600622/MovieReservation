package com.java.ctrl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Dao.IndentDao;
import com.java.Dao.MovieDao;
import com.java.been.Indent;
import com.java.been.Movie;

/**
 * Servlet implementation class Ident
 */
@WebServlet("/IndentManage")
public class IndentManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndentManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		IndentDao identDao = new IndentDao();
		System.out.println(op);
		int result = 0;
		if ("addI".equals(op)) {
			int mId = Integer.parseInt(request.getParameter("MId"));
			int	Id = Integer.parseInt(request.getParameter("Id"));
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String orderTime = df.format(date);
			System.out.println(orderTime);
			int seatNO = Integer.parseInt(request.getParameter("seatNo")) ;
		
			System.out.println(mId);
			
			Indent ident = new Indent(Id,mId,orderTime,seatNO);
			result = identDao.addIdent(ident);
			if (result == 1) {
				response.sendRedirect("ShowI.jsp");
			} else {
				response.sendRedirect("Seat.jsp?Id="+Id+"MId="+mId);
			}

		} else if ("delI".equals(op)) {
			int mId = Integer.parseInt(request.getParameter("MId"));
			int	Id = Integer.parseInt(request.getParameter("Id"));
			result = identDao.delIdent(Id, mId);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowI.jsp");
			} else {
				response.sendRedirect("admin/AdmShowI.jsp");
			}

		} else if ("updI".equals(op)) {
			int mId = Integer.parseInt(request.getParameter("MId"));
			int	Id = Integer.parseInt(request.getParameter("Id"));
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String orderTime = df.format(date);
			int seatNO = Integer.parseInt(request.getParameter("seatNo")) ;
		
			
			
			Indent ident = new Indent(Id,mId,orderTime,seatNO);
			result = identDao.updateIdent(ident);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowI.jsp");
			} else {
				response.sendRedirect("admin/AdmUpdI.jsp?Id="+Id+"MId="+mId);
			}
		}

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
