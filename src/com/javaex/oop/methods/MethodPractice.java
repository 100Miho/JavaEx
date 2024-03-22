package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {
	public static void main(String[] args) {
		printHelloMethod();
		printNumbers();
		System.out.println("\n"+getRandomNumber());
		System.out.println(getSum());

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		printOddEven(num);
		
		System.out.print("문자열 입력 >> ");
		String str = sc.next();
		printStringLength(str);
		
		System.out.print("두 개의 숫자를 입력하세요.\n첫번째 숫자 >> ");
		int num01 = sc.nextInt();
		System.out.print("두 번재 숫자 >> ");
		int num02 = sc.nextInt();
		System.out.println("큰 숫자: " + getLargeNumber(num01, num02));
		
		System.out.print("문자열 두 개를 입력하세요.\n첫번째 문자열 >> ");
		String str01 = sc.next();
		System.out.print("두 번째 문자열 >> ");
		String str02 = sc.next();
		System.out.println(concatenateStrings(str01, str02));

		//ArrayList를 활용하지 않으면 안 될 것 같은데... 사용법이 기억이 안납니다.
//		System.out.println("정수를 여러개 입력하세요. 그만 입력하려면 0을 입력하세요.");
//		int cnt = 0;
//		while(true) {
//			System.out.print(">> ");
//			int num = sc.nextInt();
//			if(num == 0) {
//				break;
//			}
//			cnt++;
//		}
		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7));
		System.out.println(concatenateStrings("하나", "둘", "셋", "넷", "다섯"));
		
		sc.close();
	}
	
//	문제 1. 콘솔에 "Hello Method!"를 출력하는 메서드를 작성하세요.
	private static void printHelloMethod() {
		System.out.println("\"Hello Method!\"");
	}
	
//	문제 2. 1부터 10 까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요.
	private static void printNumbers() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
//	문제 3. 0~100 사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
	private static int getRandomNumber() {
		int num = (int)(Math.random()*101);
		return num;
	}
	
//	문제 4. 1부터10까지의 합(55)를 반환하는 메서드를 작성하세요.
	private static int getSum() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
//	문제 5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
	private static void printOddEven(int num) {
		if(num  == 0) {
			System.out.println(0);
		} else if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
	
//	문제 6. 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요.
	private static void printStringLength(String str) {
		System.out.println(str.length());	// 이게 되네
	}
	
//	문제 7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요.
	private static int getLargeNumber(int num01, int num02) {
		if((num01 - num02) == 0) {
			return 0;
		} else if((num01 - num02) > 0) {
			return num01;
		} else {
			return num02;
		}
	}
	
//	문제 8. 문자열 두 개를 입력받아 하나로 합쳐 반환하는 메서드를 작성하세요.
	private static String concatenateStrings(String str01, String str02) {
		return str01 + ", " + str02;
	}
	
//	문제 9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요.
	private static int sumAll(int ... values) {
		int sum = 0;
		for(int val : values) {
			sum += val;
		}
		return sum;
	}
	
//	문제 10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요.
	private static String concatenateStrings(String ... values) {
		String str = "";
		for(String val : values) {
			str += val + " ";
		}
		return str;
	}
}