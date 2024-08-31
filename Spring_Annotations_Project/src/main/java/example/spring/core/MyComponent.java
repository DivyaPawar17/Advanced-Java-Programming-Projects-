package example.spring.core;

import org.springframework.stereotype.Component;

@Component//Marks this class as a component so that spring can manage it
public class MyComponent {
	public void testMyComponent() {
		System.out.println("My Component Test Works....");
	}

}
