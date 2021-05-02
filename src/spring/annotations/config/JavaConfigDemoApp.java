package spring.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
	
		// read spring configuration class 
	AnnotationConfigApplicationContext context =
				           new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class );
		
		// call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily Fortune 
	System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
		

	}

}
