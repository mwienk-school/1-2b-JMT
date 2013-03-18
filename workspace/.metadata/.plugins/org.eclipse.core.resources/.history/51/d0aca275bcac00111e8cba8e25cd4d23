package jmt.bank.cashdispensing;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LogoutServlet extends CashDispensingServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		// Unset session
		HttpSession session = req.getSession();
		session.removeAttribute("login-cashdispensing");
		session.removeAttribute("cdaccount");
		session.removeAttribute("withdraw");
		session.removeAttribute("deposit");
			
		// Forward to index
		resp.sendRedirect(resp.encodeRedirectURL("/"));
	}

}
