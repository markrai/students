package spring.example3;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
 		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run for 30 minutes!";

	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
