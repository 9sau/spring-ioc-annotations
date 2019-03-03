package com.saurabh.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Register bean in spring container with default name as "tennisCoach"
@Component
public class TennisCoach implements Coach {

	private FortuneService service;

	// Spring will scan for all components that implements Fortune Service
	// and injects it in this constructor. Here, it is HappyFortuneService
	/*
	 * @Autowired public TennisCoach(FortuneService service) { this.service =
	 * service; }
	 */

	
	public TennisCoach(){
		System.out.println("Inside Tennis Coach contructor");
	}
	
	// Spring will scan for all components that implements Fortune Service
	// and injects it in this constructor. Here, it is HappyFortuneService
	@Autowired
	public void setFortuneService(FortuneService service){
		System.out.println("Inside setter for Tennis Coach");
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Backhand";
	}

	@Override
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
