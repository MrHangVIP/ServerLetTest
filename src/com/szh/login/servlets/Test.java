package com.szh.login.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 增加一个用户
 *
 */
public class Test extends HttpServlet {

	
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	
//		跳转
//		response.sendRedirect("jsp/login.jsp");
//		response.getWriter().println("欢迎【】用户登录成功！！！");	
		 response.setCharacterEncoding("UTF-8");  
		 response.setContentType("application/json; charset=utf-8");  

//         JSONObject json = new JSONObject();
//
//         JSONArray array = new JSONArray();
////         JSONObject member = null;      
//
//         json.put("account", 1);
//         json.put("jsonArray", array);
         String jsonStr="{\"result\":\"0\",\"item\":\"item\"}";
         PrintWriter pw = response.getWriter();
//         pw.print(json.toString());
         pw.append(jsonStr);
         System.out.println("json array :"+jsonStr);
//         System.out.println("json object :"+json.toString());

         pw.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
