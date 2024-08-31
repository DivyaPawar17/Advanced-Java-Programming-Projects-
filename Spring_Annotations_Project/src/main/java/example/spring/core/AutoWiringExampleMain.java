package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExampleMain {

	public static void main(String[] args) {
		Class <SpringConfig2> configClass = SpringConfig2.class;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClass);
		Object custoObj = context.getBean("cust");
		System.out.println(custoObj);
		
	}

} 