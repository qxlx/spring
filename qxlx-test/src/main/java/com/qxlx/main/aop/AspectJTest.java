package com.qxlx.main.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test() {
	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.out.println("around.....before");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around.....after");
		return o;
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterThrowing("test()")
	public void afterThrowingTest() {
		System.out.println("AfterThrowing");
	}


	@AfterReturning("test()")
	public void afterReturningTest() {
		System.out.println("AfterReturning");
	}
}