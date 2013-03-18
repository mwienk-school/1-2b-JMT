package jmt.bank.cashdispensing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jmt.bank.shared.BankService;
import jmt.bank.shared.TransactionException;

@SuppressWarnings("serial")
public class CheckBalanceServlet extends CashDispensingServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (this.isAuthorized(req, resp)) {
			try {
				float balance = BankService.getInstance(session.getAttribute("wsdl-url")).getBalance((String) req.getSession().getAttribute("cdaccount"));
				req.setAttribute("result", "Your current balance is &euro; " + balance);
			} catch (TransactionException e) {
				req.setAttribute("error", e);
			}

			// forward to JSP
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/WEB-INF/jquery.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
