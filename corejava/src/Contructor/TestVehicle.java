package Contructor;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(80);
		
		System.out.println("Initial speed of car is:"+ car.getSpeed());
		car.setSpeed(100);
		System.out.println("Updated speed of the car:"+car.getSpeed());
	}
}
