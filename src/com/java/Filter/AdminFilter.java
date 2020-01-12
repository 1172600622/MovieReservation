package com.java.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.Dao.UserDao;
import com.java.been.User;
@WebFilter(urlPatterns={"/admin/*"})
public class AdminFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Object o =  session.getAttribute("Id");
        if(o!=null){
        	System.out.println("sss");
        	int Id = (Integer)o;
        	UserDao userDao = new UserDao();
        	User user = userDao.querybyid(Id);
        	if(user.isAdmin()==true){
            
        		chain.doFilter(request, response);
        	}else{
            	System.out.println("b");
            	res.sendRedirect(req.getContextPath()+"/login.jsp");
            }
        }else{
        	System.out.println("ss");
        	res.sendRedirect(req.getContextPath()+"/login.jsp");
        }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
