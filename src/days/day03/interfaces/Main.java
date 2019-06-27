package days.day03.interfaces;

public class Main {

	public Main() {

		Vehicle car = new Vehicle(4, 100.00);

		System.out.println("Car Max Speed" + car.getSpeed());
		System.out.println("Num of Wheels" + car.getWheels());

	}

}
