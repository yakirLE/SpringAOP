package com.continuity.spring.aop.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.continuity.spring.aop.example2.config.AppConfig;

public class MainClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(App.class).exec();
		/*
		
		Male p1 = context.getBean(Male.class);
		p1.setFirstname("yakir");
		p1.setLastname("levi");
		p1.setAge("32");
		Female p2 = context.getBean(Female.class);
		p2.setFirstname("linoy");
		p2.setLastname("levi");
		p2.setAge("30");
		List<Person> lst = new ArrayList<>();
		lst.add(p1);
		lst.add(p2);
		
		for(Person p : lst) {
			p.speak();
		}
		*/
	}
}

