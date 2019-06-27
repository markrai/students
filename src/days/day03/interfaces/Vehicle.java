package days.day03.interfaces;

public class Vehicle implements Drivable {

	int numOfWheels = 2;
	double theSpeed = 0;

	int carPower = 0;

	public int getWheels() {
		return this.getWheels();
	}

	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
	}

	public double getSpeed() {
		return this.theSpeed;
	}

	public void setSpeed(double speed) {

	}

	public Vehicle(int wheels, double speed) {

		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

}
