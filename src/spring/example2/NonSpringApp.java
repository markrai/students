package spring.example2;

public class NonSpringApp {

	public static void main(String[] args) {
		// create the object
		BaseballCoach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}

/*
 * Problem: app should be easily configurable with any type of coach
 */