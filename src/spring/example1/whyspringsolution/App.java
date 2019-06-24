package spring.example1.whyspringsolution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("example1.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle");
		obj.drive();
	}

}

/*
 * We can either have the Car implementation or the Bike implementation.. But at
 * the moment, our code is dependent on these two classes: "Car" and "Bike"
 *
 */
