package com.javaex.oop.shape.v01;

// 추상 클래스
//		- 자신이 객체회 돌 수는 없다.
//		- 상속을 위한 부모 클래스로맨 존재
//		- 안쪽에 추상 메서드를 가져야만 한다.
//		- 상속 받은 클래스는 선언된 추상 메서드를 반드시 구현해야 한다.
public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// 추상 메서드
//			-> 추상 클래스를 상속받은 클래스에서 반드시 구현해야 한다.
	public abstract void draw();
	public abstract double area();
}