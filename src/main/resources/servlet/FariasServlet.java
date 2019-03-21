package servlet;

import java.io.*;
import java.servlet.*;
import java.servlet.http.*;


public class FariasServlet extends HttpServlet{
		
	@Override
	protected void doGet(HTTPServletRequest request, HTTPServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/index.html";
        
        
        
        
        getServletContext()
        	.getRequestDispatcher(url)
        	.forward(request, response);
    }

}

