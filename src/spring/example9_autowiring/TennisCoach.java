package spring.example9_autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired // automatically wire up what's being passed in the parameter;
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "practice your swings!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
