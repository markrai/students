package spring.example8_annotations;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")   //if no id is provided then then it defaults to "tennisCoach" 
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your swings!";
	}

}
