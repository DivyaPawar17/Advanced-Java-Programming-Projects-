package example.spring.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect //mark this class as an aspect
@Component
public class AudienceWithAround {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPountCut() {
		
	}
	private void takeSeats() {
		System.out.println("Please take your seats: Around");
		
	}
	private void turnOffMobiles() {
		System.out.println("Please turn off your mobiles: Around");
		
	}
	private void clap() {
		System.out.println("Clap Clap Clap: Around");
		
	}
	private void demandForRefund() {
		System.out.println("Please give our money back: Around");
		
	}
	private void leave() {
		System.out.println("bye,leaving now: Around");
		
	}
	@Around("myPountCut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		takeSeats();
		turnOffMobiles();
		try {
			joinPoint.proceed();
			clap();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			demandForRefund();
		}
		
		leave();
	}

}

