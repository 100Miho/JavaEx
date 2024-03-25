package com.javaex.oop.goods.v03;

// Ver02. Private
public class Goods {
	// Field (맴버변수)
	private String name;
	private int price;

//	생성자를 하나도 선언하지 앟았을 경우 자가컴파일러가 기본생성자 추가/
//	개발자가 생성자를 만들었을 경우, 기본 생성자는추가되지 않는다.
	public Goods() {}
	public Goods(String name, int price) {
		this.name=name;
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