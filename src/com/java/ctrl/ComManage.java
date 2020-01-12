package com.java.ctrl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Dao.CommentDao;
import com.java.Dao.IndentDao;
import com.java.been.Comment;
import com.java.been.Indent;

/**
 * Servlet implementation class ComManage
 */
@WebServlet("/ComManage")
public class ComManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		CommentDao commentDao = new CommentDao();
		
		int result = 0;
		
		int	id = Integer.parseInt(request.getParameter("Id"));
			int mId = Integer.parseInt(request.getParameter("MId"));
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String commentTime = df.format(date);
			
			float grade = Float.parseFloat(request.getParameter("Grade")) ;
			String comment = request.getParameter("comment");
			Comment comment2 = new Comment(mId, id, comment, commentTime, grade);
			
			
			result = commentDao.addComm(comment2);
			if (result == 1) {
				response.sendRedirect("ShowC.jsp?MId="+mId);
			} else {
				response.sendRedirect("ShowC.jsp?MId="+mId);
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
