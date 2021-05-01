package spring.annotations.config;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create array of strings 
	String [] data = {"Beware of the wolf in the sheep's clothing",
			"Diligence is the mother of good luck",
			"the journey is reward"};
	
	
	// create random number 
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
