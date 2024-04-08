package com.manan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		String message="You get to rest today!!";
		return message;
	}

}
