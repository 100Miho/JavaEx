package com.javaex.oop.shape.v01;

public class ShapeApp {
	public static void main(String[] args) {
//		Shape s = new Shape(); -> 추상 클래스는 직접 객체화 불가능
		Circle circle = new Circle(10, 20, 30);
		circle.draw();
		
		Rectangle rectangle = new Rectangle(10, 20, 100, 500);
		rectangle.draw();
	}
}