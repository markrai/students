package spring.example2;

import spring.example3_constructor_injection.FortuneService;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Do batting practice!";
	}

}
