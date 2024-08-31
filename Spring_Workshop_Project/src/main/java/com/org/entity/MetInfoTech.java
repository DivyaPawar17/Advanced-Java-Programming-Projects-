package com.org.entity;

public class MetInfoTech implements TraningCompany{

private Trainer trainer;

	

	public MetInfoTech() {

		System.out.println("Default constructor of Metinfotech");

	}

	
	public MetInfoTech(Trainer trainer) {

		super();

		this.trainer = trainer;

		System.out.println("parameterized constructor of Metinfotech");

	}

	public Trainer getTrainer() {

		return trainer;

	}

	public void setTrainer(Trainer trainer) {

		this.trainer = trainer;

	}

	
	@Override

	public String toString() {

		return "MetInfotech [trainer=" + trainer + "]";

	}



	@Override
	public void conductTraning() {
		trainer.train();

		System.out.println("metinfotech conducting training");

	}



	

	

	

	

    

}