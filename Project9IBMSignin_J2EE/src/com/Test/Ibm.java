package com.Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Text;

//Servlet2 class IBM
public class Ibm extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//These two lines will show response in web browser.
	    resp.setContentType("text/html");  
		PrintWriter out = resp.getWriter();
	     
	    String ibmid= req.getParameter("name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
	
       
	    out.print("Welcome to IBM ....... "+ibmid); 
	    
	   
	    out.print("Your Email ID - "+email); 
	    
	   
	    out.print("Your password is- "+password); 

	}
	
	
}
