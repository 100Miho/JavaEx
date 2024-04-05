package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
//		Queue 선언
//		Qeuce : 인터페이스 실제 저장은 LinkedList 기능 활용
		Queue<Integer> queue = new LinkedList();	// 리스트: 중간 삽입, 삭제 가능
													// 링크드 리스트를 그대로 활용 하되, 중간 삽입, 중간 삭제 불가능
		
		for(int i=0; i<10; i++) {
			queue.offer(i); //입력(제공)
			System.out.println("Queue : " + queue);
		}
		
		System.out.println("PEEK : " + queue.peek()); // 출력 방향의 데이터 확인 
		System.out.println("POLL : " + queue.poll()); // 인출
		System.out.println("Queue : " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll()); // 인출
			System.out.println("Queue : " + queue);
		}
	}
}