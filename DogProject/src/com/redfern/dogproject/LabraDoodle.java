package com.redfern.dogproject;

public class LabraDoodle extends Dog {
	
	public LabraDoodle() {
		super();
	}
	
	public LabraDoodle(String gender, int age) {
		super(gender, age);
	}
	
	public void bark() {
		System.out.println("LabraDoodle barking...");
	}

}
