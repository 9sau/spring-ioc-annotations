package com.saurabh.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		// Coach coach2 = context.getBean("tennisCoach", Coach.class);

		// boolean isSame = coach1 == coach2;

		// System.out.println("Is Same: " + isSame);
		System.out.println("coach1: " + coach1);
		// System.out.println("coach2: " + coach2);

		context.close();

	}

}
