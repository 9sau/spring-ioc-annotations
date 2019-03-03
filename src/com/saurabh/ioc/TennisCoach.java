package com.saurabh.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Register bean in spring container with default name as "tennisCoach"
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	//spring uses java reflection to inject dependency for field injections
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService service;
	
	@Value("${coach.name}")
	private String name;

	// Spring will scan for all components that implements Fortune Service
	// and injects it in this constructor. Here, it is HappyFortuneService
	/*
	 * @Autowired public TennisCoach(FortuneService service) { this.service =
	 * service; }
	 */

	public TennisCoach() {
		System.out.println("Inside Tennis Coach contructor");
	}
	
	public String getName(){
		return name;
	}

	// Spring will scan for all components that implements Fortune Service
	// and injects it in this constructor. Here, it is HappyFortuneService
	// below method name can be anything
	/*
	 * @Autowired public void setFortuneService(FortuneService service){
	 * System.out.println("Inside setter for Tennis Coach"); this.service =
	 * service; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice Backhand";
	}

	@Override
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
