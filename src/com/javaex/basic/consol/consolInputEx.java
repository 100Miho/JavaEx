package com.javaex.basic.consol;

import java.util.Scanner;

public class consolInputEx {
	public static void main(String[] args) {
		//스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		//데이터 입력
		System.out.print("나이는? >> ");
		int age = sc.nextInt();
		System.out.print("이름은? >> ");
		String name =sc.next();
		
		System.out.println("안녕하세요, " + age + "세 " + name + "님");
		
		//스캐너 닫기
		sc.close();
	}
}
