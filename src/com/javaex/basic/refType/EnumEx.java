package com.javaex.basic.refType;

public class EnumEx {
	public static void main(String[] args) {
		// Enum Method Test
		Week today = Week.WEDNEDAY;
		System.out.println(today);
//		                                           ▽열거 상수의 문자열 표현
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
//															     △열거 상수의 열거 내 순번
		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		System.out.printf("obj is %s(%d)%n", obj.name(), obj.ordinal());
	}
}