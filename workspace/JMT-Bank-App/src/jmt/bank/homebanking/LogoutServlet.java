package jmt.bank.homebanking;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LogoutServlet extends HomeBankingServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		// Unset session
		HttpSession session = req.getSession();
		session.removeAttribute("login-homebanking");
		session.removeAttribute("hbaccount");
		session.removeAttribute("transfer");
			
		// Forward to index
		resp.sendRedirect(resp.encodeRedirectURL("/"));
	}

}
