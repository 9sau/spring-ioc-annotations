package com.saurabh.ioc;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${random.fortune}")
	private String[] fortunes;
	
	private Random random = new Random();

	@Override
	public String getDailyFortune() {
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
