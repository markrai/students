package spring.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load Spring configuration file into Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example2.xml");

		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}

}
