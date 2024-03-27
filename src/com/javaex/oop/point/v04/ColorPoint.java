package com.javaex.oop.point.v04;


// 상속 extends
public class ColorPoint extends Point {
	private String color;
	
//	public ColorPoint() {}
//		생성자 내에서 부모 생성자를 호출하지 않으면
//		부모의 기본 생성자를 호출
	public ColorPoint(String color) {
		super(0,0);
		this.color=color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	@Override	// 현재 메서드가 오버라이드인지 확인
	public void draw() {
		// Getter 이용 우회접근
//		System.out.printf("%s색으로 점[x=%d, y=%d]를 그렸습니다.\n", color, super.getX(), super.getY());
		System.out.printf("%s색으로 점[x=%d, y=%d]를 그렸습니다.\n", color, x, y);
	}
	
	@Override
	public void draw(boolean bdraw) {
		System.out.println(color + (bdraw ? "색 그림을 그렸습니다" : "색 그림을 지웠습니다."));
	}
}