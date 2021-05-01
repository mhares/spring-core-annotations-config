package spring.annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    
    public TennisCoach() {
		System.out.println(">> Tennis Coach : Inside default Contructor");
	}
    
 /*   @Autowired
    public void doMyCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>> Tennis Coach : Inside doMyCrazyStuff() Method");
		fortuneService = theFortuneService;
	}
	*/
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
