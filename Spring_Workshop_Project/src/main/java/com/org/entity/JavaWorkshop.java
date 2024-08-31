package com.org.entity;

public class JavaWorkshop implements Workshop {

private TraningCompany  company;

	

	public JavaWorkshop() {

		System.out.println("Default constructor of java workshop");

	}

	public JavaWorkshop(TraningCompany company) {

		super();

		this.company = company;

		System.out.println("Parameterized constructor of java workshop");

	}

	public TraningCompany getCompany() {

		return company;

	}
	@Override
	public void ConductWorkshop() {
		System.out.println("Java workshop started !!!");

		company.conductTraning();
		
	}
	public void setCompany(TraningCompany company) {

		this.company = company;

	}

	
}