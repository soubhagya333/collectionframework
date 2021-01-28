package couplingexample;

public class Driver {
	private String name;
	private Vehicle vehicle=new TruckVehicle();
	
	public Driver() {
	}

	public Driver(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	public void drive() {
		System.out.println("driving by"+this.name);
		this.vehicle.move();
	}

}
