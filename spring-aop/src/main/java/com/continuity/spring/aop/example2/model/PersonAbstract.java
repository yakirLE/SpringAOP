package com.continuity.spring.aop.example2.model;

import com.continuity.spring.aop.example2.annotation.Metric;

public abstract class PersonAbstract implements Person {

	private static int id = 0;
	private int myId;
	private String firstname;
	private String lastname;
	private int age;
	private Gender gender;

	public PersonAbstract(Gender gender) {
		this.myId = ++id;
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Metric
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return myId;
	}

	public Gender getGender() {
		return gender;
	}

	public static enum Gender {
		Male, Female;
	}
}
