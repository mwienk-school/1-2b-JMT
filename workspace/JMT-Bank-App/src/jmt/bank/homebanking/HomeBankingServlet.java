package jmt.bank.homebanking;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public abstract class HomeBankingServlet extends HttpServlet {

	/**
	 * Check whether the user has a active session, redirect if not
	 * @param req
	 * @param resp
	 * @return
	 * @throws IOException
	 */
	public boolean isAuthorized (HttpServletRequest req, HttpServletResponse resp) 
			throws IOException {
		HttpSession session = req.getSession();
		Boolean isLoggedIn = (Boolean) session.getAttribute("login-homebanking");
		
		// Redirect user to login page when not logged in
		if (isLoggedIn == null || isLoggedIn == false) {
			resp.sendRedirect(resp.encodeRedirectURL("/homebanking/login"));
			return false;
		} else {
			return true;
		}
	}
	
}
