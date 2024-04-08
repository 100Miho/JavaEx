package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class ClassRoom{
	// 필드
	private String subject;
	private String roomName;
	
	// 생성자
		// containValue에서 사용하기 위한 생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}
	
	// Getter, Setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(roomName, subject);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == subject) {
			return true;
		}
		ClassRoom other = (ClassRoom) obj;
		return Objects.equals(roomName, other.roomName) && Objects.equals(subject, other.subject);
	}
	
	// 동일성 체크 

	}

public class HashTableEx {
	public static void main(String[] args) {
		// Map형 자료형
		// KeySet과 List의 복합 자료형
		// Key(KeSet) - 순서 X, 중복 X
		// Value는 key를 통한 접근만 가능, 중복 O
		
		// HashTable 선언
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// Map에 데이터 넣기 : put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Kurarpikt", "R404"));
		
		// 출력: 순서가 없음
		System.out.println(map);
		
		// 데이터 참조: get
		System.out.println(map.get("303"));
		
		// 데이터 변경: put
		map.put("202", new ClassRoom("C#", "R204"));
		System.out.println(map.get("202"));
		
		// 특정 키 포함 여부 확인: containsKey
		System.out.println(map.containsKey("202"));
		System.out.println(map.containsKey("505"));
		
		// 특정 값 포함 여부 확인
//		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		System.out.println("========= Iterator =========");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) { // 뒤에 요소가 더 있는지 확인
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		map.clear(); // 맵 비우기
		System.out.println(map);
	}
}