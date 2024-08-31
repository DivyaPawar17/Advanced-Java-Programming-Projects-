package example.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan//Asking Spring to scan the component
@ComponentScan(basePackages={"juices","milkshakes","desserts","example"})
public class SpringConfig3 {
	  //@Bean methods if any
	
 /*	@Bean
	public MyComponent getMyComponent() {
		return new MyComponent();
	} */
	
}
