package com.manan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		super();
		System.out.println("-->Tennis Coach Instance created!!");
	}
	
	
//	Constructor injection
//	@Autowired	
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		String message="Practice your service regularly!";
		return message;
	}
	
//	Dependency injection on any method
//	@Autowired
//	public void initialiseFortuneService(FortuneService fortuneService)
//	{
//		System.out.println("-->Inside Initialise Fortune Service");
//		this.fortuneService=fortuneService;
//	}
	
//	Setter Injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("-->Inside setter for fortuneService");
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	@PostConstruct
	public void doMyStartUp()
	{
		System.out.println("||Started||");
	}
	
	@PreDestroy
	public void doCleanUp()
	{
		System.out.println("||Ended||");
	}

}
