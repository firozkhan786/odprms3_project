package com.Test;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet1 class Test
public class Test extends HttpServlet {
	          
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String ibmid= req.getParameter("name"); 
	String email= req.getParameter("email");
	String password= req.getParameter("password");
	
	System.out.println("WELCOME"+"Your IBMID:"+ibmid);
	
	//if user is AVJTJE then you allow to Servlet2 else Servlet3
	
	if(ibmid.equalsIgnoreCase("AVJTJE"))  
	{
		RequestDispatcher rd=req.getRequestDispatcher("servlet2");  
		rd.forward(req, resp);  
	}else{
		RequestDispatcher rd=req.getRequestDispatcher("servlet3");  
		rd.forward(req, resp);  
	}
	}
	
	
	
	
	

}
