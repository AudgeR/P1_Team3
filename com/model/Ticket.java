package com.model;

public class Ticket {
	private int ticketId, ticketType, userId;
	private double amount;
	private String dateSubmitted, dateResolved, status, description;
	
	public Ticket() {
	}

	public Ticket(int ticketId, int ticketType, double amount, String dateSubmitted, 
			String dateResolved, String status,String description, int userId) {
		super();
		this.ticketId = ticketId;
		this.ticketType = ticketType;
		this.amount = amount;
		this.dateSubmitted = dateSubmitted;
		this.dateResolved = dateResolved;
		this.status = status;
		this.description = description;
		this.userId = userId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getDateResolved() {
		return dateResolved;
	}

	public void setDateResolved(String dateResolved) {
		this.dateResolved = dateResolved;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketType=" + ticketType + 
			   ", amount=" + amount + ", dateSubmitted=" + dateSubmitted + 
			   ", dateResolved=" + dateResolved + ", status=" + status + 
			   ", description=" + description + ",userId=" + userId + "]";
	}
	
	
}
