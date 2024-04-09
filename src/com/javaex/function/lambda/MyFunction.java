package com.javaex.function.lambda;

@FunctionalInterface	// 인터페이스가 함수인자를 컴파일러에게 문의
public interface MyFunction {
	// 함수영 인터페이스: 내부에 반드시 한 개의 메서드만 허용
	int getResult(int x, int y);
	// 내부 로직을 설계시에 미정 상태로 둔다.
}