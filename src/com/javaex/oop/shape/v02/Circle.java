package com.javaex.oop.shape.v02;

public class Circle extends Shape {
	private double radius;
	
	Circle(int x, int y, double radius){
		super(x, y);
		this.radius=radius;
	}
	
	// 부모가 선언한 추상메서드는 반드시 구현해야 한다.
	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, r=%f, area=%f]를 그렸습니다.\n", x, y, radius, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);	// 제곱 메서드
		return area;
	}
}