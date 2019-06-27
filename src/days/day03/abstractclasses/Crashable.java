package days.day03.abstractclasses;

// cannot be instantiated; should contain at least ONE abstract method

public abstract class Crashable {

	boolean carDrivable = true;

	public void crashTheCar() {
		this.carDrivable = false;
	}

	public abstract void setCarStrength(int carPower); 

	public abstract int getCarStrength();

}
