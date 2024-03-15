package com.javaex.basic.operators;
public class LogicalOperEx {
	public static void main(String[] args) {
		int a = 7;
		int b;
		b = 3;
		
		// 비교 연산자 >=, <=, > , < , == !=
		System.out.println("비교 연산자");
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		// 논리 연산자
		System.out.println("\n논리 연산자");
//			논리곱 (AND: &&)
//			논리형 (OR: ||)
//			논리부정 (NOT: !)
		int c = 5;
//		c는 0초과, 10 미만의 값?
//			조건1: c > 0
//			조건2: c < 10
//		결과: 조건1 and 조건2 
		boolean r1 = c > 0;
		boolean r2 = c < 10;
		boolean result = r1 && r2;
		System.out.println(result);
		
//		c가 0 이하이거나 10 이하인가?
//			조건1: c <= 0
//			조건2: c >= 10;
		r1 = c <= 0;
		r2 = c >= 10;
		result = r1 || r2;
		System.out.println(result);
		
//		문제 1의 논리 부정
		result = !(c > 0 && c < 10);
//			-> (c <=0 || c >= 10) 논리 결과와 동일
		System.out.println(result);
		
//		문제 2의 논리 부정
		result = !(c <=0 || c >=10);
//			-> (c > = || c < 10) 논리 결과와 동일
		System.out.println(result);
	}
}