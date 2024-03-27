package com.javaex.oop.casting;

public class Cat extends Animal {
	public Cat(String name) {
		super.name=name;
	}
	
	public void meow() {
		System.out.print(name + ": 야옹~!");
	}
}