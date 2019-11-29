package days.day03.abstractclasses;

import days.day03.interfaces.Drivable;

public class Vehicle extends Crashable implements Drivable {

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

	@Override
	public int drive() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speedUp(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
