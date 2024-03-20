package com.javaex.basic.refType;

public class StringEx {
	public static void main(String[] args) {
		String str1;			// 선언 (null 상태)
		str1 = "Java";			// ((Heap 영역에) 할당
		
		String str2 = "Java";	// 선언과 동시에 할당
		
		String str3 = new String("Java");
		
//		세 참조 변수는 같은 값을 가지고 있다.
		System.out.println("str1 == str2 = " + (str1 == str2));	// 리터럴로 선언하면 같은 주소값
		System.out.println("str2 == str3 = " + (str2 == str3));
		
		// 값의 비교는 .equals 메소드 이용
		System.out.println("str1 equals str2 = " + str1.equals(str2));
		System.out.println("str2 equals str3 = " + str2.equals(str3));
	}
}