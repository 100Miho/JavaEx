package com.javaex.oop.staticmember;

public class StaticExApp {
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("s1.refCount: " + s1.refCount);

		StaticEx s2 = new StaticEx();
		System.out.println("StaticEx.refCount: " + StaticEx.refCount);
		
		StaticEx s3 = new StaticEx();
		System.out.println("StaticEx.refCount: " + StaticEx.refCount);
		
		s3=null; // 참조 해제
		System.out.println("s3해제");
		System.out.println("StaticEx.refCount: " + StaticEx.refCount);
		System.gc(); // 가비지컬렉터 호철
		
//		try {
//			Thread.sleep(3000);
//			System.out.println("StaticEx.refCount: " + StaticEx.refCount);
//		} catch (Exception e) {
//			
//		}
	}
}