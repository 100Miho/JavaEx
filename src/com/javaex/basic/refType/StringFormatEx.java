package com.javaex.basic.refType;

public class StringFormatEx {
//	                                 args = 매개변수
	public static void main(String[] args) {
		//%s(문자열) , %d(10진수), %n(개행)
		
		// __개의 __중에서 __개를 먹었다.
		String fruit = "사과";
		int total = 10, eat = 3;
//		                   포맷 문자열                        순서 중요
		System.out.printf("%d개의 %s중에서 %d개를 먹었다.%n", total, fruit, eat);
		
		// %d의 천단위 구분 기호 %,d
		int amount = 1_234_567_890; // _는 식별되지 않는다.
		System.out.printf("%,d%n", amount);
		
		double pi = Math.PI;
//		                       소수점 아래 2자리 까지 표현
		System.out.printf("PI: %.2f%n", pi);
		
		// 포맷 형식은 String 형의 .format 매서드에서 구현된다.
		String fmt = "\"%d개의 %s중에서 %d개를 먹었다.\"%n";
		System.out.printf(fmt, 10, "바나나", 2);
	}
}