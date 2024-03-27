package com.javaex.oop.staticmember;

// 스태틱 영역 활용
// 단 하나의 인스턴스만 유지
// 		new Singleton() -> X
public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}