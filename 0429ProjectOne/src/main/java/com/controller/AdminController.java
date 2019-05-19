package com.controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.*;
import com.dao.TicketDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Ticket;

public class AdminController {
	
	public static String loadTickets(HttpServletRequest request, HttpServletResponse response) {
		TicketDaoImpl tImpl = new TicketDaoImpl();
		List<Ticket> tList = tImpl.selectAllTickets();
		
		try {
			response.getWriter().write(new ObjectMapper().writeValueAsString(tList));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "/0429ProjectOne/html/Admin.do";
	}
	
	
	
}
