/**
 * 
 */
package com.pudong.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class Advisor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg3.getClass().getName()+"执行了必要的操作");
	}

}
