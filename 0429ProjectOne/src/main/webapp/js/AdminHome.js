/**
 * 
 */

window.onload = function getTickets() {

    let ticketTable = document.getElementById("reimbtable");
    let xHttp = new XMLHttpRequest();

    xHttp.onreadystatechange = function() {
	
	    if(xHttp.readyState == 4 && xHttp.status == 200) {
	    	let tickets = JSON.parse(xHttp.responseText);
	    	console.log(tickets);
		    setValues(tickets);
	    }
    }
    xHttp.open("POST", "/0429ProjectOne/html/Admin.do", true);
	xHttp.send();
}



// Iterate over table with a for loop
for (let ticket in tickets) {
    let row = document.createElement("tr");
    
    let userId = document.createElement("th");
    let firstName = document.createElement("th");
    let lastName = document.createElement("th");
    let type = document.createElement("th");
    let amount = document.createElement("th");
    let dateSubmitted = document.createElement("th");
    let dateResolved = document.createElement("th");
    let status = document.createElement("th");
    let description = document.createElement("th");
    let ticketId = document.createElement("th");
    let button = document.createElement("th");

    button.innerHTML = "<button type=\"button\" name=\"approve\">Approve</button>" +
                       "<button type=\"button\" name=\"deny\">Deny</button>";

// Add event listeners to buttons and functions to change status of ticket
    document.getElementsByName("approve").addEventListener("click", approveTicket);
    document.getElementsByName("deny").addEventListener("click", denyTicket); //create these functions
    
    row.appendChild(userId);
    row.appendChild(firstName);
    row.appendChild(lastName);
    row.appendChild(type);
    row.appendChild(amount);
    row.appendChild(dateSubmitted);
    row.appendChild(dateResolved);
    row.appendChild(status);
    row.appendChild(description);
    row.appendChild(ticketId);
    row.appendChild(button);

// Display inner HTML to cells
    function setValues(ticket) {
    	document.getElementById("userId").innerHTML = ticket.userId;
    	//document.getElementById("firstName").innerHTML = ;
    	//document.getElementById("lastName").innerHTML = ticket.userId;
    	document.getElementById("type").innerHTML = ticket.ticketType;
    	document.getElementById("amount").innerHTML = ticket.amount;
    	document.getElementById("dateSubmitted").innerHTML = ticket.dateSubmitted;
    	document.getElementById("dateResolved").innerHTML = ticket.dateResolved;
    	document.getElementById("status").innerHTML = ticket.status;
    	document.getElementById("description").innerHTML = ticket.description;
    	document.getElementById("ticketId").innerHTML = ticket.ticketId;
    }

    ticketTable.appendChild(row);
}




