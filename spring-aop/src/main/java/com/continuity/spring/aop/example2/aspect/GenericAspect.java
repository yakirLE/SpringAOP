package com.continuity.spring.aop.example2.aspect;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GenericAspect {
	
	private Logger logger = Logger.getLogger(GenericAspect.class.getName());
	
	// will execute any method ending with Passenger that's: from any package, receives any arg and may return anything 
	@Before("execution(public void speak())")
	public void before() {
		logger.info("entering method");
	}
	
	// will execute any method ending with Passenger that's: from any package, receives any arg and may return anything
	@After("execution(* *.*speak(..))")
	public void after() {
		logger.info("exiting method");
	}
	
	@Around("@annotation(com.continuity.spring.aop.example2.annotation.Metric)")
	public Object trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		Object returnObject = joinPoint.proceed();
		
		logger.info("execution time of " + joinPoint.getSignature() + " is " + (System.currentTimeMillis() - startTime) + "ms");
		
		return returnObject;
	}
	
	@Before("com.continuity.spring.aop.example2.aspect.CommonJoincuts.genericOperation()")
	public void bla(JoinPoint joinPoint){
		logger.info("----------- before anno, with JoinPoint -\n\t\t\tsignature: " + joinPoint.getSignature() + "\n\t\t\targs: " + Arrays.toString(joinPoint.getArgs()) + "\n\t\t\tobject: " + joinPoint.getThis());
	}

}
