package com.osi.loan.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CachingAdvice {
	Map<String, Object> cache = new HashMap<String, Object>();

		/*@Around("execution(* com.osi.loan.service.UserService.findUser(..))")
public Object cacheResult(ProceedingJoinPoint pjp) throws Throwable {
		String key = pjp.toLongString(); // joinpoint name : Eg: findUser
		Object result = cache.get(key);
		if (result == null) {
			result = pjp.proceed();
			cache.put(key, result);
		}
		return result;
	}*/
	
	@Before("execution(* com.osi.loan.service.UserService.findUser(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}
