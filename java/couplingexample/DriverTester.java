package couplingexample;

public class DriverTester {

	public static void main(String[] args) {
Vehicle vehicle = new TruckVehicle();
Driver driver=new Driver("veesh",vehicle);
driver.drive();
	}

}
