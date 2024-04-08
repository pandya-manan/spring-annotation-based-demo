package com.manan.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	@Value("${manan.email}")
	private String email;
	
	@Value("${manan.team}")
	private String team;
	
	private FortuneService fortuneService;
			
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Complete 10 Laps Daily!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
