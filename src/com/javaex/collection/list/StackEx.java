package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
//		Stack<Integer> stack = new Stack<>();
		
//		데이터 입력
		for(int i=0; i<10; i++) {
			stack.push(i);
			System.out.println("STACK : " + stack);
		}

//		가장 마지막에 있는 데이터 확인
		System.out.println("Peak : " + stack.peek());
		System.out.println("STACK : " + stack);
		
//		인출
		System.out.println("Pop : " + stack.pop());
		System.out.println("STACK : " + stack);
		System.out.println("STACK : " + stack);
		
//		while(true) {
//			System.out.println("Pop : " + stack.pop());
//			System.out.println("STACK : " + stack);
//		}
		
//		Stack이 비어있는지 확인 해야 한다
		while(!stack.empty()) {	// 비어 있지 않으면
			System.out.println("STACK : " + stack);
			System.out.println("Pop : " + stack.pop());
		}
	}
}