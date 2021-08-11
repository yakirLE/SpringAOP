package com.continuity.spring.aop.example2.model;

public interface Person {

	String getFirstname();
	void setFirstname(String firstname);
	String getLastname();
	void setLastname(String lastname);
	int getAge();
	void setAge(int age);
	
	void speak();
}
