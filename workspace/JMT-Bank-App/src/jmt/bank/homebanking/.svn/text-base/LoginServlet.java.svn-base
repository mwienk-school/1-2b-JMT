package jmt.bank.homebanking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Client;

import jmt.bank.shared.AuthenticationException;
import jmt.bank.shared.BankService;

@SuppressWarnings("serial")
public class LoginServlet extends HomeBankingServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		try {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			Client client = BankService.getInstance(session.getAttribute("wsdl-url")).authenticateClient(username, password);

			// Set session variables
			session.setAttribute("login-homebanking", true);
			session.setMaxInactiveInterval(60);
			session.setAttribute("client", client);
			session.setAttribute("hbaccount", client.getAccountId());
			session.setAttribute("transfer", 0.0f);

			// Forward to banking index
			resp.sendRedirect(resp.encodeRedirectURL("/homebanking"));
		} catch (AuthenticationException e) {
			// Return error message to user
			req.setAttribute("error", e);

			// Forward to JSP
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/WEB-INF/homebanking/login.jsp");
			dispatcher.forward(req, resp);
		}

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Forward to JSP
		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/homebanking/login.jsp");
		dispatcher.forward(req, resp);
	}

}
