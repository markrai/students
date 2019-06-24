package spring.example1.withoutspring;

public class App {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}

}


/* We can either have the Car implementation or the Bike implementation..
 * But at the moment, our code is dependent on these two classes: "Car" and "Bike" 
 *
 */
