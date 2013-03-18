package jmt.bank.server;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import jmt.bank.beans.Account;
import jmt.bank.shared.AuthenticationException;

@SuppressWarnings("serial")
public class BankServlet extends HttpServlet {
	
	public void init() {
		Account.createAccounts();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankImpl bank = new BankImpl();
		String address;
		try {
			if (request.getParameter("type").equals("card")) {
				bank.authenticateCard(request.getParameter("cardId"),
						              request.getParameter("PIN"));
			} else if (request.getParameter("type").equals("client")) {
				bank.authenticateClient(request.getParameter("username"),
						                request.getParameter("password"));
			}
			address = "/WEB-INF/bank/authenticationsuccess.jsp";
		} catch (AuthenticationException e) {
			address = "/WEB-INF/bank/authenticationerror.jsp";
			request.setAttribute("error", e.getMessage());
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}
