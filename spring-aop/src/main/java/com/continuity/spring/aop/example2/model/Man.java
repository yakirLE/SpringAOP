package com.continuity.spring.aop.example2.model;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.continuity.spring.aop.example2.annotation.Metric;

import lombok.Getter;
import lombok.Setter;

@Component("man")
@Getter
@Setter
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Man extends PersonAbstract {
	
	public Man() {
		super(Gender.Male);
	}
	
	@Metric
	@Override
	public void speak() {
		System.out.println("Hi, I'm man #" + getId() + " and my name is " + getFirstname() + " " + getLastname() + "(" + getAge() + " yo)");
	}

}
