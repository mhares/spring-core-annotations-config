package spring.annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
    private FortuneService fortuneService;
    
    public TennisCoach() {
		System.out.println(">> Tennis Coach : Inside default Contructor");
	}
    
    @Autowired
    public void setForuneService (FortuneService theFortuneService) {
		System.out.println(">>> Tennis Coach : Inside setForuneService() Method");

		fortuneService = theFortuneService;
	}
	
  /*  @Autowired
    public TennisCoach(FortuneService theFortuneService) {
    	fortuneService = theFortuneService;
    }
*/
	@Override
	public String getDailyWorkout() {
		
		return "Practise your backend volley ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	


}
