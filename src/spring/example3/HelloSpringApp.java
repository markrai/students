package spring.example3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load Spring configuration file into Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example3.xml");

		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call new method for fortunes
				System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
