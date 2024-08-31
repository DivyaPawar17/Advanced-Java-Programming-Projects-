package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String CustomerId;
	private String name;
	private int age;
	//@Autowired
	
	@Autowired(required =false)//making it OPTIONAL
	@Qualifier("addr")
	private Address permanentAddress;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(String customerId, String name, int age, Address permanentAddress) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.age = age;
		this.permanentAddress = permanentAddress;
	}


	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", age=" + age + ", permanentAddress="
				+ permanentAddress + "]";
	}

}
