package com.continuity.spring.aop.example2.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoincuts {

	@Pointcut("execution(* *.*Firstname(..)))")
	public void genericOperation() {}
	
}
