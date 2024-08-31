package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfig2 {
	//Declaring a Bean of type Address
	@Bean("addr")
	
	public Address getAddress() {
		Address myAddress = new Address("Chennai", 421118);
		return myAddress;
		
	}
	
	@Bean("addr2")
	@Primary// Making this bean as Primary
	public Address getAddress2() {
		Address myAddress = new Address("Mumbai", 411565);
		return myAddress;
		
	}
	
	//Declaring a Bean of type Customer
	@Bean("cust")
	public Customer getCustomer() {
		//Not setting permanent address asking spring to auto-wire
		Customer customerRef = new Customer();
		customerRef.setCustomerId("C001");
		customerRef.setName("Divya Pawar");
		customerRef.setAge(24);
		return customerRef;
	}

}
