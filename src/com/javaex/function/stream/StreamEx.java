package com.javaex.function.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		int scores[] = {80, 90, 70, 100, 60, 50};
		
		// 배열에서 스트림 뽑아내는 방법
		IntStream arrStream = Arrays.stream(scores);
//		System.out.println(arrStream);
		
		// 사용자 정의 클래스 타입 스트림
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 90, 95, 100));
		students.add(new Student("고길동", 80, 50, 90));
		students.add(new Student("전우치", 80, 90, 80));
		students.add(new Student("임꺽정", 70, 65, 70));
		students.add(new Student("장길산", 60, 60, 60));
		
		// 컬렉션 프레임워크 클래스에서는 .stream() 메서드로 스트림 추출 가능
		Stream<Student> objStream = students.stream();
//		System.out.println(objectStream);
		
		// [ 최종연산 ] : forEach
//		testForEach(scores, objStream);
//		testFilter(scores, objStream);	// Filter
//		testMap(scores);				// Map
//		testCountSum(scores);			// Sum
//		testFilterSort(students);		// Filter, Sorted
		testReduce(scores);				// Reduce
		
	}
	
	private static void testForEach(int[] source, List<Student> lst) {
		// forEach -> 최종 연산, 스트림을 순회하면서 최종 처리 담당
		System.out.println("========== Stream forEach ==========");
		
		// 배열의 순회
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i] + " \n");
		}
		
		// forEach 사용
		Arrays.stream(source).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 컬렉션 순회
		Iterator<Student> it = lst.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
		
		// forEach
		lst.stream().forEach(obj -> System.out.println(obj));
	}
	
	private static void testFilter(int[] arr, List<Student> lst) {
		// arr에서 점수가 70점 이상인 것만 추출
		System.out.println("========== Stream Filter ==========");
		System.out.println(Arrays.toString(arr));
		
		Arrays.stream(arr).filter(n -> n >= 70).forEach(n -> System.out.println(n + " "));;
		
		// lst에서 평균 점수가 70점 이상인 것만 추출
		lst.stream().filter(obj -> obj.getAverate() >= 70).forEach(System.out::println.);
	}
	
	private static void testMap(int[] arr) {
		System.out.println("========== Stream Map ==========");
		// 맵은 형태는 그대로, 내부 요소의 변형
		System.out.println("원본: " + Arrays.toString(arr));
		// 각 요소를 /2 해서 새로 운 배열을 형성
		Arrays.stream(arr).map(n -> n/2).forEach(n -> System.out.print(n + " "));	// 배열을 스트림으로 전환 후 map함수적용 후 최종연산
		
		// 배열 arr요소 모두 *2 -> 새로운 배열로 변환
		int[] multiply = Arrays.stream(arr).map(n -> n*2).toArray();
		System.out.println("\n*2: " + Arrays.toString(multiply));
	}
	
	private static void testCountSum(int[] arr) {
		// count : 요소의 개수를 카운트하는 함수
		int numCnt = (int)Arrays.stream(arr).count();
		System.out.println(Arrays.toString(arr) + " : count = " + numCnt);
		// sum : 기본형 특화함수
		// 기본형 특화 스트림: primitive Type을 처리하기 위해 만들어진 스트림
		//		예) IntStream, LongStream, DoubleStream
		// 배열로부터 70점 이상인 점수를 필터링해서 모두 합산
		System.out.println("70점 이상 점수 합계: " + Arrays.stream(arr).filter(n -> n >=70).sum());
	}
	
	private static void testFilterSort(List<Student> lst) {
		// 평균점 70점 이상인 학생 목록으로부터 학생 이름의 오름차 순으로 정렬하여 출력
		System.out.println("========== Stream Filter + Sort ==========");
//		lst.stream().filter(obj -> obj.getAverate() >= 70).sorted((obj1, obj2) -> obj1.getName().compareTo(obj2.getName())).forEach(System.out::println);
				// -> 오름차순으로 정렬
		lst.stream().filter(obj -> obj.getAverate() >= 70).sorted((obj1, obj2) -> -obj1.getName().compareTo(obj2.getName())).forEach(System.out::println);
		
	}
	
	private static void testReduce(int[] arr) {
		System.out.println("원본 배열: " + Arrays.toString(arr));
		System.out.println("========== Stream Reduce ==========");
		
//								누산기 초기값, ( acc:누산기 , curr:현재 요소 )
		int total = Arrays.stream(arr).reduce(0, (acc, curr) -> {System.out.println("acc: " + acc);
																System.out.println("curr: " + curr);
																return acc + curr;
		});
		System.out.println("Total: " + total);
	}
}