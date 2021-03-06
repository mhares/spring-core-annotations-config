package spring.annotations.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotationsDemoApp {

	public static void main(String[] args) {
	
		// read spring configuration file 
		ClassPathXmlApplicationContext context =
				           new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class );
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class );
		
		// check if they are the same 
		boolean result = (theCoach== alphaCoach);
		
		// print the result 
		System.out.println(">> Pointing to same object : " + result);
		
		System.out.println(">> Memory Location for theCoach : " + theCoach);
		System.out.println(">> Memory Location for alphaCoach : " + alphaCoach);
		
		
		
		// close the context
		context.close();
		
		

	}

}
