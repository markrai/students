package spring.example8_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example8.xml");

		// get the bean from spring container     //default id would be: tennisCoach
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		// call some methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
