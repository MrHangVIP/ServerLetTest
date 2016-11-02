package com.szh.login.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.szh.login.Daos.UserDao;
import com.szh.login.beans.UserBean;

/**
 * 增加一个用户
 *
 */
public class AddUserServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPass");
		int age=Integer.parseInt(request.getParameter("age"));
		//组装
		UserBean user=new UserBean(userName, userPassword, age);
		//存值
		new UserDao().addOne(user);
		//跳转
//		response.sendRedirect("jsp/login.jsp");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
