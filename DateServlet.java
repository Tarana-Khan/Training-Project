package com.vsics.fs;
import java.io.*;
import javax.servlet.*;
import java.util.Date;
//this is a code to fetch date
 public class DateServlet extends GenericServlet
 {
	 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		 res.setContentType("text/html");
		 PrintWriter pw=res.getWriter();
		 Date d1=new Date();
		 // this function print date and time
		 pw.println("<h1><center> hello servlet this is current date and time::"+d1 +"</center></h1>");
		 pw.close();
 }
}
