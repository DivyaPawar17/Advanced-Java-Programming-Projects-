package example.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Bean;

@Configuration //Marks this class as a configuration unit

public class SpringConfig {
	
	
	@Bean    //This class is equivalent to spring-config.xml
	//The default ID is the method name getHelloBean
	public GreetingService getHelloBean() {
		GreetingService gs = new HelloService();
		return gs;
	}
	
	@Bean("greet")//Overrides the default ID And assigns a new one:greet
	public GreetingService getWelcomeBean() {
		GreetingService gs = new WelcomeService();
		return gs;
	}
	
	@Bean
	@Lazy //Marks this bean as Lazy
	public GreetingService matchResult() {
		//This is equivalent to setter Injection
		CricketMatchResult result = new CricketMatchResult();
		result.setWinningTeam("India");
		result.setLosingTeam("Pakistan");
		result.setWinningMargin(6);
		result.setWinningType("Runs");
		return result;
	}
	
	@Bean 
	@Scope("prototype")
	public GreetingService matchResult2() {
		//This is equivalent to constructor Injection 
		GreetingService gs = new CricketMatchResult(8, "India", "Ireland", "Wicket");
		return gs;
	}

}
