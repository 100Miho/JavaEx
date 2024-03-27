package com.javaex.oop.casting;

public class Dog extends Animal {
	public Dog(String name) {
		super.name=name;
	}
	
	public void wang() {
		System.out.println(name + ": 멍멍!");
	}
}
