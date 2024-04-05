package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;

class Student {
	// 필드
	int id;
	String name;
	
	// 생성자
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// 게터, 셋터
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

//	객체의 동등성 비교를 위한 두 개의 관문
//		1. hashCode()
//		2. equals()
	
	@Override
	//값의 동일성 판별을 위한 .equals 메서드 오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return (id == other.id) && (name == other.name);
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return id;
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		// 1. HashSet 사용법 (기본타입)
//		usingHashSet();
		
		// 2. 집합 연산
//		setOperation();
		
		// 3. HashSet사용법 (객체 자료형)
		usingHashSetWidthCustom();
	}
	
	private static void usingHashSet() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		
		// 요소(객체) 추가
		hs.add("JAVA");
		hs.add("C");
		hs.add("C++");
		hs.add("phython");
		hs.add("Java");
		
		System.out.println("hs: " + hs);
		System.out.println("SIZE: " + hs.size());
		
		// 특정 객체 포함
		System.out.println("C++ 포함? : " + hs.contains("C++"));
		System.out.println("Lynux 포함? : " + hs.contains("Lynux"));
		System.out.println("hs: " + hs);
		
		// HashSet은 순서가 없기 때문에 오로지 객체로만 삭제
		hs.remove("C++");
		System.out.println("hs: " + hs);
	}
	
	@SuppressWarnings("unchecked")
	private static void setOperation() {
		// 집합 연산
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체 집합: " + numbers);
		
		HashSet<Integer> odds = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
		System.out.println("홀수 집합: " + odds);
		
		HashSet<Integer> evens = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println("짝수 집합: " + evens);
		
		HashSet<Integer> mThree= new HashSet<>(Arrays.asList(3, 6, 9));
		System.out.println("3의 배수 집합: " + mThree);
		
		// 교집합: retainAll
		// 원본 보호를 위해 복제
		System.out.println("========== 교집합 ==========");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.retainAll(setB);	// 집합A 교집합 집합B = [ 3, 9 ]
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3,9))));
		
		// 합집합 : addAll
		System.out.println("========== 합집합 ==========");
		setA = (HashSet<Integer>)odds.clone();
		setB = (HashSet<Integer>)evens.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.addAll(setB);
		System.out.println("합집합 : " + setA);
		System.out.println(setA.equals(numbers));
		
		// 차집합 : removeAll
		setA = (HashSet<Integer>)numbers.clone();
		setB = (HashSet<Integer>)odds.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.removeAll(setB);
		System.out.println("차집합 : " + setA);
		System.out.println(setA.equals(evens));
	}
	
	private static void usingHashSetWidthCustom() {
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student(404, "크라피카");
		Student s2 = new Student(40, "크라피카");
		Student s3 = new Student(99, "키르아 조르딕");
		Student s4 = new Student(99, "키르아 조르딕");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println(hs.toString());
		
		// 서로 다른 객체 s3와 s4 를 동등 객체로 판정
	}
}