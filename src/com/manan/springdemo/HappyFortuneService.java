package com.manan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		String message="Congratulations! You have won $10 today!!";
		return message;
	}

}
