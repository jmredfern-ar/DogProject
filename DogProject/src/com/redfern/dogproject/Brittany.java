package com.redfern.dogproject;

public class Brittany extends Dog {
	
	private boolean isFast = true;

	public Brittany() {
	}

	public Brittany(String gender, int age) {
		super(gender, age);
	}

	//Overridden method
	public void bark() {
		System.out.println("Brittany barking...");
	}
	
	public void sit(int numMinutes) {
		System.out.println("Sit for " + numMinutes + " minutes");
	}
	
}
