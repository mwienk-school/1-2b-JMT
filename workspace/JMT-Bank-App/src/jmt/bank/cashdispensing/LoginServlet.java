package jmt.bank.cashdispensing;

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
public class LoginServlet extends CashDispensingServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		try {
			String cardnumber = req.getParameter("cardnumber");
			String pin = req.getParameter("pin");			
			Client client = BankService.getInstance(session.getAttribute("wsdl-url")).authenticateCard(cardnumber, pin);

			// Set session variables
			
			session.setAttribute("login-cashdispensing", true);
			session.setMaxInactiveInterval(60);
			session.setAttribute("client", client);
			session.setAttribute("cdaccount", client.getAccountId());
			session.setAttribute("deposit", 0.0f);
			session.setAttribute("withdraw", 0.0f);

			// Forward to banking index
			resp.sendRedirect(resp.encodeRedirectURL("/cashdispensing"));
		} catch (Exception e) {
			// Return error message to user
			req.setAttribute("error", e);

			// Forward to JSP
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/WEB-INF/cashdispensing/login.jsp");
			dispatcher.forward(req, resp);
		}

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Forward to JSP
		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/cashdispensing/login.jsp");
		dispatcher.forward(req, resp);
	}

}
