package com.redfern.dogproject;

public class Dog {
	
	//const
	private static final int INVALID_AGE = -1;

	private String name;
	private String gender;
	private int age;
	
	//Overloading Constructors
	public Dog() {
		name = "";
		gender = "";
		age = INVALID_AGE; //-1
		
		if(age == INVALID_AGE) {
			//DO SOMETHING
		}
	}
	
	public Dog(String gender, int age) {
		name = "";
		this.gender = gender;
		this.age = age;
	}
	
	public Dog(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Overloaded bark() methods
	public void bark() {
		System.out.println("Dog barking...");
	}
	
	public void bark(String str) {
		System.out.println(str);
	}
	
	public void sit() {
		System.out.println("Dog sits...");
	}
	
	//java.lang.Object.toString() => returns obj location in memory
	//Overridden
	public String toString() {
		return "Dog " + this.name + " Gender: " + this.gender + " Age: " + this.age;
	}
}
