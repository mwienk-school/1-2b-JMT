package jmt.bank.cashdispensing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public abstract class CashDispensingServlet extends HttpServlet {

	/**
	 * Check whether the user has a active session, redirect if not
	 * @param req
	 * @param resp
	 * @return
	 * @throws IOException
	 */
	public boolean isAuthorized (HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		Boolean isLoggedIn = (Boolean) session.getAttribute("login-cashdispensing");
		String requestedWith = req.getHeader("X-Requested-With");
		
		// check if user is logged in
		if (isLoggedIn == null || isLoggedIn == false) {
			if (requestedWith != null && requestedWith.equals("XMLHttpRequest")) {
				// return ajax error
				req.setAttribute("error", new Exception("Error: your session has expired. Please login again."));
				RequestDispatcher dispatcher = req
						.getRequestDispatcher("/WEB-INF/jquery.jsp");
				dispatcher.forward(req, resp);
			} else {
				// Redirect user to login page when not logged in
				resp.sendRedirect(resp.encodeRedirectURL("/cashdispensing/login"));
			}
			return false;
		} else {
			return true;
		}
	}
	
}
