package jmt;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class StudentsFormServlet extends HttpServlet {

	private static final String CONTENT_TYPE = "text/html";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// set content type
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>FormStudentServlet</title></head>");
		out.println("<body>");
		out.println("<p>The servlet has received a GET. This is the reply.</p>");
		out.println("<p>Hello " + request.getParameter("FirstName") + " "
				+ request.getParameter("LastName") + "</p>");
		out.println("<p>You are a " + request.getParameter("Gender") + ".</p>");
		String s = "";
		if (request.getParameter("Internship") == null)
			s = "NOT ";
		out.println("<p>You have " + s + "completed your internship.</p>");
		out.println("<p>You have completed the following courses:");
		String[] courses = request.getParameterValues("Courses");
		if (courses == null)
			out.println("none!</p>");
		else {
			for (int i = 0; i < courses.length; i++)
				out.println(courses[i]);
			out.println("</p>");
		}
		String action = "";
		if (request.getParameter("Add") != null)
			action = "add";
		else
			action = "remove";
		out.println("<p>Database action: " + action + "</p>");
		out.println("</body></html>");
	}

}
