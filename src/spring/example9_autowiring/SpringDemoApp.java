package spring.example9_autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {

		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example9.xml");

		// get the bean from spring container     //default id would be: tennisCoach
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call some methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
