package spring.example3_constructor_injection;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// default constructor
	public BaseballCoach() {

	}

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";

	}

	@Override
	public String getDailyFortune() {
		
		// use my fortune service to get a fortune
		
		return fortuneService.getFortune();

	}

}
