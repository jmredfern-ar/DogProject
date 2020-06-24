package com.redfern.dogproject;

public class Cat {
	
	private String name;
	private String breed;
	private String address;
	private int age;
	boolean isFinicky;
	
	public Cat(String name, int age, boolean isFinicky) {
		this.name = name;
		this. age = age;
		this. isFinicky = isFinicky;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFinicky() {
		return isFinicky;
	}

	public void setFinicky(boolean isFinicky) {
		this.isFinicky = isFinicky;
	}
	
	//Overriding Object.toString()
	public String toString() {
		return "Cat: " + this.name;
	}
	
	public static void main(String[] args) {
		Cat felix = new Cat("felix", 12, true);
		System.out.println(felix.isFinicky());
		System.out.println(felix);
	}

}
