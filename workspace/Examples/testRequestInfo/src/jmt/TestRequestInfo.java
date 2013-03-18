package jmt;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class TestRequestInfo extends HttpServlet {

	private static final String CONTENT_TYPE = "text/html";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType(CONTENT_TYPE);
		String title = "Test Request Parameters";
	    PrintWriter out = response.getWriter(); 
	    String docType =
	      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
	      "Transitional//EN\">\n";
	    out.println(docType + 
	    "<HTML>\n" +
        "<HEAD><TITLE>" + title + "</TITLE>" +
        "<LINK REL=STYLESHEET HREF=\"styles.css\" TYPE=\"text/css\">" +
        		"</HEAD>\n" +
        "<BODY BGCOLOR=\"#FDF5E6\">\n" +
        "<H1>" + title + "</H1>\n");
	    Enumeration e = request.getParameterNames();
	    while (e.hasMoreElements()) {
	    	String name = (String) e.nextElement();
			out.println("<p>Request parameter <i>" + name +
					"</i> = " + request.getParameter(name)+ "</p>");
	    }
		out.close();
	}

}
