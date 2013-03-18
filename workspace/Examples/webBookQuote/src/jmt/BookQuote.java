package jmt;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */

public class BookQuote extends HttpServlet {
 	private Quoter quoter;
	
    public void init() throws ServletException {
    	quoter = new Quoter();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    String title = "Book Quote"; 
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\" TYPE=\"text/css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>ISBN number: " +
                   request.getParameter("isbn") + "\n" +
                "  <P>Price: " +
                   Double.toString(quoter.getBookPrice(request.getParameter("isbn"))) +
                "</BODY></HTML>");
  }
  

}
