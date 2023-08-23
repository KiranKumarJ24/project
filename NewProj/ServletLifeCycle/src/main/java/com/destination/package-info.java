package com.destination;
 import java.io.IOException;
 
 /**
 * Servlet implementation class Servlet1
 */
 @WebServlet("/Servlet1")
 public class Servlet1 extends HttpServlet {
	 private static final long serialVersionUID =1;
	 
	 /**
	  * @see Servlet#init(ServletConfig)
	  */
	 
	 public void service(HttpServletRequest request, HttpServletResponse)
	 System.out.print("Hi from Init()");
	 
 }
 }