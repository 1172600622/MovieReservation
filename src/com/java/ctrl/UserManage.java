package com.java.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Dao.MovieDao;
import com.java.Dao.UserDao;
import com.java.been.Movie;
import com.java.been.User;

/**
 * Servlet implementation class Usermanage
 */
@WebServlet("/UserManage")
public class UserManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		UserDao userDao = new UserDao();
		int result = 0;
		if ("addUser".equals(op)) {

			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			String name = request.getParameter("name");
			String  phone = request.getParameter("phone");
			boolean admin =Boolean.parseBoolean(request.getParameter("admin")) ;
			User user = new User(userName, passWord, name, phone, admin);
			result = userDao.addUser(user);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowU.jsp");
			} else {
				response.sendRedirect("admin/AdmAddU.jsp");
			}

		} else if ("delUser".equals(op)) {
			int Id = Integer.parseInt(request.getParameter("Id"));
			result = userDao.delUser(Id);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowU.jsp");
			} else {
				response.sendRedirect("admin/AdmShowU.jsp");
			}

		} else if ("updUser".equals(op)) {
			int Id = Integer.parseInt(request.getParameter("Id"));
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			String name = request.getParameter("name");
			String  phone = request.getParameter("phone");
			boolean admin =Boolean.parseBoolean(request.getParameter("admin")) ;
			User user = new User(Id,userName, passWord, name, phone, admin);
			result = userDao.updateAdm(user);
			if (result == 1) {
				response.sendRedirect("admin/AdmShowU.jsp");
			} else {
				response.sendRedirect("admin/AdmUpdU.jsp?Id="+Id);
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
