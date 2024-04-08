package com.manan.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	String[] fortunes= {"You have won $100 today!Enjoy!","You have won a Chevrolet Camaro!","You have won Dodge Challenger Hellcat!"};

	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
 