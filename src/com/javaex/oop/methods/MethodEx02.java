package com.javaex.oop.methods;

public class MethodEx02 {
	public static void main(String[] args) {
		// 가변인수 : 정해지지 않은 개수의 인수가 넘어 올 때
		
		// 방법 1) 배열로 전달하는 방법
		System.out.println("getSumArr : " + getSumArr(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		
		// 방법 2) 가변인수 사용법
		System.out.println("getSumVar : " + getSumVar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		// 고정 인수와 가변 인수를 같이 사용
		printSum("합계 : ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	// 배열을 이용한 여러개의 데이터 전달
	private static double getSumArr(double[] values) {
		double total = 0;
//		for(int i=0; i<values.length; i++) {
//			total += (double)values[i];
//		}
		// 확장된 for문
		for(double val : values) {
			total += val;
		}
		return total;
	}
	
	// 가변인수 ... 으로 전달
	private static double getSumVar(double ... values) {
		double total = 0;
		for(double val : values) {
			total += val;
		}
		return total;
	}
	
	// 고정인수와 가변인수를 같이 선언
	private static void printSum(String massage, double ... values) {
		System.out.println(massage + getSumVar(values));
	}
}