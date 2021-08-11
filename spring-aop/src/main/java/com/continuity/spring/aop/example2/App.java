package com.continuity.spring.aop.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.continuity.spring.aop.example2.model.Person;

@Component
public class App {

	@Autowired
	@Qualifier("man")
	private Person p1;
	
	@Autowired
	@Qualifier("woman")
	private Person p2;
	
	@Autowired
	@Qualifier("man")
	private Person p3;
	
	@Autowired
	@Qualifier("woman")
	private Person p4;
	
	public void exec() {
		p1.setFirstname("yakir");
		p1.setLastname("levi");
		p1.setAge(32);
		p1.speak();
		p2.setFirstname("linoy");
		p2.setLastname("levi");
		p2.setAge(30);
		p2.speak();
		p3.setFirstname("yagel moshe");
		p3.setLastname("levi");
		p3.setAge(5);
		p3.speak();
		p4.setFirstname("eleanor");
		p4.setLastname("levi");
		p4.setAge(3);
		p4.speak();
	}
}
