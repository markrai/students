package spring.example1.withoutspring;

public class App {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.drive();
	}

}


/* We can either have the Car implementation or the Bike implementation..
 * But at the moment, our code is dependent on these two classes: "Car" and "Bike" 
 *
 */
