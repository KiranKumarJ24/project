package com.dest.Program1;
import java.io.IOException;

 @WebServlet("/Program1")
 public class Program1 extends HttpServlet{
 @Override
 protected void service(HttpServletRequest req,
 HttpServletResponse resp)
 throws ServletException,IOException {
	 String name = req.getParameter("your_name");
	 PrintWriter writer = resp.getWriter();
	 writer.println(name);
 }
 }