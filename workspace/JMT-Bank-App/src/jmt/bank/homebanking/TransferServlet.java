package jmt.bank.homebanking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jmt.bank.shared.BankService;
import jmt.bank.shared.TransactionException;

@SuppressWarnings("serial")
public class TransferServlet extends HomeBankingServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (this.isAuthorized(req, resp)) {
			float amount = Float.valueOf(req.getParameter("amount").trim()).floatValue();

			try {
				float totalTransfer = ((Float) req.getSession().getAttribute("transfer")) + amount;
				if(totalTransfer > 5000) 
					throw new TransactionException("The total transferred amound in this session exceeds &euro; 5000");
				String transfer = BankService.getInstance(session.getAttribute("wsdl-url")).transfer((String) req.getSession().getAttribute("hbaccount"), req.getParameter("account"), amount);
				req.getSession().setAttribute("transfer", totalTransfer);
				req.setAttribute("result", transfer);
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
					.getRequestDispatcher("/WEB-INF/homebanking/transfer.jsp");
			dispatcher.forward(req, resp);
		}
	}
}