package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private float cashAvailable;
	
	
	public Customer(String name, String address, float cashAvailable) {
		super();
		this.name = name;
		this.address = address;
		this.cashAvailable = cashAvailable;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getCashAvailable() {
		return cashAvailable;
	}
	public void setCashAvailable(float cashAvailable) {
		this.cashAvailable = cashAvailable;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCust(this, finance, vehicle);
	}
}
