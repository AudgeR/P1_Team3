package Models;

//ticket id, type as an integer (1=Lodging, 2=Travel, 3=Food, 4=Other), amount, 
//date submitted, date resolved, status, and description fields.

public class Expenses {

	int expenseType;
	double amount;
	String dateSubmitted, dateResolved, status, description;
	

	public Expenses() {
		
	}

	public int getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(int expenseType) {
		
		if(expenseType > 0 & expenseType < 5) {
			this.expenseType = expenseType;
		}
		//Add way to ensure parameters remain between 1 and 4.
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
	

	@Override
	public String toString() {
		return "Expenses [expenseType=" + expenseType + ", amount=" + amount + ", dateSubmitted=" + dateSubmitted + ", dateResolved="
				+ dateResolved + ", status=" + status + ", description=" + description + "]";
	}
	public Expenses(int expenseType, double amount, String dateSubmitted, String dateResolved, String status, String description) {
		super();
		this.expenseType = expenseType;
		this.amount = amount;
		this.dateSubmitted = dateSubmitted;
		this.dateResolved = dateResolved;
		this.status = status;
		this.description = description;
	}
}
