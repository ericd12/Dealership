package car_dealership;

public class Employee {

	public void handleCust(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			float loanAmt = vehicle.getPrice() - cust.getCashAvailable();
			runCredit(cust, loanAmt);
		} else if(vehicle.getPrice() <= cust.getCashAvailable()) {
			System.out.println("The customer is paying in cash");	
			processTransaction(cust, vehicle);
		} else {
			System.out.println(cust + " will need more money for the " + vehicle);
		}
	}
	
	public void runCredit(Customer cust, float loanAmt) {
		System.out.println("Credit History for " + cust);
		System.out.println("The available loan is for " + loanAmt);
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("The customer has purchased a " + vehicle + " for $" + vehicle.getPrice());
	}
}
