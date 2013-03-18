package coreservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowBalance
 */
public class ShowBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankCustomer customer =
			BankCustomer.getCustomer(request.getParameter("id"));
			String address;
			if (customer == null) {
			address = "/WEB-INF/bank-support/UnknownCustomer.jsp";
			} else if (customer.getBalance() < 0) {
			address = "/WEB-INF/bank-support/NegativeBalance.jsp";
			request.setAttribute("badCustomer", customer);
			} else if (customer.getBalance() < 10000) {
				address = "/WEB-INF/bank-support/NormalBalance.jsp";
				request.setAttribute("regularCustomer", customer);
				} else {
				address = "/WEB-INF/bank-support/HighBalance.jsp";
				request.setAttribute("eliteCustomer", customer);
				}
				RequestDispatcher dispatcher = request.getRequestDispatcher(address);
				dispatcher.forward(request, response);
				}
				

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
