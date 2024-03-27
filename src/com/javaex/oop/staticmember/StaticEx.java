package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;		// 클래스 변수	-> 생성된 모든 인스턴스 변수
	public static String classVar;	// 클래스 변수
	public String instanceVar;		// 인스턴스 변수
	
	// 스태틱 블록으로 클래서 변수 초기화
	static {
		refCount = 0;				// 스태틱 변수 초기화
		classVar = "Static Member";	// 클래스 변수 접근
//		instanceVar = "Instance Member"; // -> 스태틱 영역에서 인스턴스 멤버로의 접근 불가
		// static 영역에서는 static 영역만 접근 가능
	}
	
	// 생성자
	public StaticEx() {
		// 인스턴스가 생성될 때, 객체 카운트를 증가
		refCount++;
		System.out.println("refCount: " + refCount);
		System.out.println("인스턴스가 생성되었습니다.");
	}
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		refCount--; // 객체가 소멸 될 때 참조 카운트 1 감소
		super.finalize();
		System.out.println("소멸자 호출");
		System.out.println("refCount: " + refCount);
	}
}