package com.javaex.oop.staticmember;

public class SingletonApp {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		System.out.println("s2 == s3 ? " + (s2 == s3));
	}
}