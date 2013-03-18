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
public class WithdrawServlet extends CashDispensingServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (this.isAuthorized(req, resp)) {
			float amount = Float.valueOf(req.getParameter("amount").trim()).floatValue();
			try {
				float totalWithdraw = ((Float) req.getSession().getAttribute("withdraw")) + amount;
				if(totalWithdraw > 500) throw new TransactionException("Total amount withdrawn in this session exceeds &euro; 500");
				
				// Withdraw the amount, store in the result
				String result = BankService.getInstance(session.getAttribute("wsdl-url")).withdraw((String) req.getSession().getAttribute("cdaccount"), amount);
				req.getSession().setAttribute("withdraw", totalWithdraw);
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
					.getRequestDispatcher("/WEB-INF/cashdispensing/withdraw.jsp");
			dispatcher.forward(req, resp);
		}
	} 
}
