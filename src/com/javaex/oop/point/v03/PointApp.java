package com.javaex.oop.point.v03;

public class PointApp {
	public static void main(String[] args) {
		Point point = new Point();
		
		point.setX(5);
		point.setY(5);
		point.draw(true);
		
		point.setX(10);
		point.setY(23);
		point.draw(false);
//		오버로딩 메서드 실행
		
	}
}