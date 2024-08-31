package example.spring.aop;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect //mark this class as an aspect
@Component
public class Audience {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPountCut() {
		
	}
	@Before("myPountCut()")
	public void takeSeats() {
		System.out.println("Please take your seats");
		
	}
	@Before("myPountCut()")
	public void turnOffMobiles() {
		System.out.println("Please turn off your mobiles");
		
	}
	@AfterReturning("myPountCut()")
	public void clap() {
		System.out.println("Clap Clap Clap");
		
	}
	@AfterThrowing("myPountCut()")
	public void demandForRefund() {
		System.out.println("Please give our money back");
		
	}
	@After("myPountCut()")
	public void leave() {
		System.out.println("bye,leaving now");
		
	}

}


