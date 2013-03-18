package jmt.bank;

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Client;

import jmt.bank.shared.AuthenticationException;
import jmt.bank.shared.BankService;

@SuppressWarnings("serial")
public class SetSoapServerServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		HttpSession session = req.getSession();
		
		String currentWsdlUrl = (String) session.getAttribute("wsdl-url");
		if (currentWsdlUrl == null || currentWsdlUrl.length() == 0) {
			currentWsdlUrl = BankService.getDefaultWsdlUrl();
		}
		
		req.setAttribute("currentWsdlUrl", currentWsdlUrl);
		req.setAttribute("error", req.getParameter("error"));
		
		// forward to JSP
		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/set-soap-server.jsp");
		dispatcher.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		String wsdlStr = req.getParameter("new-wsdl-url");
		
		try {
			URL wsdlUrl = new URL(wsdlStr);
			
			// try to set URL
			BankService bankService = BankService.getInstance(wsdlStr);
			
			// save to session
			session.setAttribute("wsdl-url", wsdlStr);
			
			// redirect back to GET method
			resp.sendRedirect("/set-soap-server");	
		} catch (Exception e) {
			// redirect back to GET method
			resp.sendRedirect("/set-soap-server?error=invalid");	
		}
		
		

	}
	
}
