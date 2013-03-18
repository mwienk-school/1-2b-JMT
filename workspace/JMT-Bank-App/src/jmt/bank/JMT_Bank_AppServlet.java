package jmt.bank;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JMT_Bank_AppServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}