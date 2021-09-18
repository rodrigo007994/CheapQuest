/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.cheapquest.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class Home extends HttpServlet {
    /**
	 * 
	 */

    @Override
    public void init() throws ServletException{
        
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        request.setAttribute("ztitle", "Home");
        String configUrl=getServletContext().getInitParameter("url");
        String configUser=getServletContext().getInitParameter("user");
        String configPass=getServletContext().getInitParameter("pass");
        PrintWriter out = response.getWriter();
out.println("<html><head></head>\n" +
"<body><h1>Servlet Carlos,ve la documentacion de bootstrap-5.1.1, Popper is also included with bootsrap </h1>\n" +
"</body></html>");
    }
    @Override
    public void destroy(){
  
    }
}