package com.redfern.dogproject;

public class DogDriver {

	public static void main(String[] args) {
		
		Dog fido 			= new Dog("Fido", "male", 8);
		LabraDoodle larry 	= new LabraDoodle("male", 8);
		Brittany axel 		= new Brittany();
		
		fido.bark();
		larry.bark();
		axel.bark();
		
		
		
		
		
		
		
		
//		fido.bark();
//		fido.bark("woof woof!");
//		
//		Brittany axel = new Brittany("Male", 4);
//		axel.bark();
//		System.out.println(axel.getAge());
//		
//		axel.sit();
//		axel.sit(5);
//		
//		LabraDoodle betty = new LabraDoodle("female", 2);
//		betty.sit();
		
	}

}
