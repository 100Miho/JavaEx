package com.javaex.oop.goods.v01;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "PENTAX";
		camera.price = 400_000;
		
		Goods lgGram = new Goods();
		lgGram.name = "LG그램";
		lgGram.price = 900_000;
		Goods mugCup = new Goods();
		
		mugCup.name = "머그컵";
		mugCup.price = 2_000;
		
		System.out.println("[ 상품 정보 ]");
		System.out.printf("%s - %,d원", camera.name, camera.price);
		System.out.printf("\n%s - %,d원", lgGram.name, lgGram.price);
		System.out.printf("\n%s - %,d원", mugCup.name, mugCup.price);
	}
}
