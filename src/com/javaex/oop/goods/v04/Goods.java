package com.javaex.oop.goods.v04;

// Ver03. this
public class Goods {
	// Field (맴버변수)
	private String name;
	private int price;

//	vVer04.
//	현재 자기 자신의 객체를 의미
//	this : 현재 자신의 생성자를 만들었을 경우, 기본 생성자는 추가되지 않는다;
	public Goods() {}
	public Goods(String name) {
		this.name=name;
	}
	public Goods(int price) {
		this.price=price;
	}
	public Goods(String name, int price) {
		this(name); // => Goods(String name) 생성자 호출
		this.price=price;
	}
		
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
	}
	
	public void showInfo() {
		System.out.println("상품 이름: " + name);
		System.out.println("가격: " + price);
	}
}