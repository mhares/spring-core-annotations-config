package spring.annotations.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
	
		// read spring configuration file 
		ClassPathXmlApplicationContext context =
				           new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class );
		
		// call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
		

	}

}
