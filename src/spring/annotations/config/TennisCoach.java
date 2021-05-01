package spring.annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
    private FortuneService fortuneService;
	
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
    	fortuneService = theFortuneService;
    }

	@Override
	public String getDailyWorkout() {
		
		return "Practise your backend volley ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	


}
