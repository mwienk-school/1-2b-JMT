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
public class DepositServlet extends CashDispensingServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (this.isAuthorized(req, resp)) {
			// validate form values
			float amount = Float.valueOf(req.getParameter("amount").trim()).floatValue();

			try {
				float totalDeposit = ((Float) req.getSession().getAttribute("deposit")) + amount; 
				if(totalDeposit > 1000) throw new TransactionException("The total of this sessions deposits exceeds &euro; 1000");
				String result = BankService.getInstance(session.getAttribute("wsdl-url")).deposit((String) req.getSession().getAttribute("cdaccount"), amount);
				req.getSession().setAttribute("deposit", totalDeposit);
				req.setAttribute("result", result);
			} catch (TransactionException e) {
					// set error
					req.setAttribute("error", e);
			}
			// forward to JSP
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/WEB-INF/jquery.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(this.isAuthorized(req, resp)) {
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/WEB-INF/cashdispensing/deposit.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
