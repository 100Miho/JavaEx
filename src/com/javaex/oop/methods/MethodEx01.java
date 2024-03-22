package com.javaex.oop.methods;

public class MethodEx01 {
	public static void main(String[] args) {
		// 매개변수 X , 리턴 X
		printMessage();
		
		// 매개변수 X, 리턴 O
		String message = getMessage();
		System.out.println(message);
		
		// 매개변수 O, 리턴 X
		printDvide(4, 0);
		printDvide(4, 3);
		
		// 매개변수 O, 리턴 O
		// 다형성 (오버로드)
		int num01 = 4, num02 = 5, num03 = 3;
		double sum = getSum(num01, num02);
		System.out.println(sum);
		sum = getSum(num01, num02, num03);
		System.out.println(sum);
	}
	
	private static void printMessage() {
		// 매개변수 X
		// 리턴 X -> void
		System.out.println("매개변수가 없고, 리턴도 없는 메서드");
	}
	
	private static String getMessage() {
		// 매개변수 X
		// 리턴 O
		return "\n매개변수는 없고, 리턴은 있는 메서드";
	}
	
	private static void printDvide(int num01, int num02) {
		// 매개변수 O
		// 리턴 X
		System.out.println("\n매개변수는 있고, 리턴은 없는 메서드");
		if(num02 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		// 리턴 값이 없어도 리턴 가능
		// 	ㄴ 남은 코드를 더이상 수행하지 않고 제어를 돌려줄 때
		System.out.printf("%d / %d = %d%n", num01, num02, num01/num02);
	}
	
	
	// 메서드 오버로드
	public static double getSum(double num01, double num02) {
		System.out.println("\n매개변수가 있고, 리턴도 있는 메서드");
		return num01 + num02;
	}
	
	public static double getSum(double num01, double num02, double num03) {
		System.out.println("\n매개변수가 있고, 리턴도 있는 메서드를 오버로드 함");
		return num01 + num02 + num03;
	}
}