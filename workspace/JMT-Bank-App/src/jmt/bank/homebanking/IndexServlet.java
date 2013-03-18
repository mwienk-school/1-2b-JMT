package jmt.bank.homebanking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Client;

import jmt.bank.shared.BankService;

@SuppressWarnings("serial")
public class IndexServlet extends HomeBankingServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (this.isAuthorized(req, resp)) {		
			Client client = (Client) session.getAttribute("client");
			
			// forward to JSP
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/homebanking/index.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
