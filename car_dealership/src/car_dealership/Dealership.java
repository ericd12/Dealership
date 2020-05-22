package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		

		
		Customer cust1 = new Customer("Eric", "123 Any St. Washington, D.C.", 30000);
		
		Vehicle vehicle = new Vehicle("Acura", "TLX", 25000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp , false);
		
		
		Vehicle car = new Vehicle("Acura", "TLX", 25000);
		
		boolean match = car.equals(vehicle);
		
		System.out.println(match);
		

	}

}
