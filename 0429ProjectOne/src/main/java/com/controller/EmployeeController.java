package com.controller;
import javax.servlet.http.HttpServletRequest;
import com.dao.TicketDaoImpl;
import com.model.Employee;
import com.model.Ticket;

public class EmployeeController {
	
	public static String newExpense(HttpServletRequest request) {
		Employee e = (Employee)LoginController.session.getAttribute("user");
		TicketDaoImpl tImpl = new TicketDaoImpl();
		
		String type = request.getParameter("type"); // Change numerical values to "Lodging", "Food", etc..
		String amount = request.getParameter("Amount");
		String dateSubmitted = "15-MAY-19"; // Implement current date
		String status = "Pending";
		String description = request.getParameter("Description");
		int userID = e.getUserID();

		Ticket t = new Ticket(null, type, amount, dateSubmitted, "", status, description, userID);
		
		tImpl.insertTicket(t);	

		return "/html/Login.html";
	}
}
