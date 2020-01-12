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

/**
 * Servlet Filter implementation class UserFilter
 */
@WebFilter(urlPatterns={"/Seat.jsp","/ShowI.jsp"})
public class UserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Object o =  session.getAttribute("Id");
        if(o!=null){
        	System.out.println("ooooooooo");
        	chain.doFilter(request, response);
//        	int Id = (Integer)o;
//        	UserDao userDao = new UserDao();
//        	User user = userDao.querybyid(Id);
        	
          
        }else{
        	
        	req.getRequestDispatcher("/login.jsp").forward(req, res);;
        	System.out.println(req.getContextPath());
        }
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
