package com.manan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args)
	{
		//load the spring file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from the context
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach duplicateCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==duplicateCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for duplicateCoach: "+duplicateCoach);
		
		context.close();
				
	}

}
