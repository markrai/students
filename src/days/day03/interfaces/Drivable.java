package days.day03.interfaces;

/** most interfaces are adjectives. Because, most objects are "nouns" and if you want to
/*  modify a noun, then you do so using an adjective!
 * 
 */

public interface Drivable {
	
	double pi = 3.14;       // variables in interfaces are constants
	
	public abstract int getWheels();   // public abstract is already implied
	
	void setWheels(int numWheels);
	
	double getSpeed();	
	
	void setSpeed(double speed);
	

}


// Interfaces include what methods an implementing class MUST implement.
