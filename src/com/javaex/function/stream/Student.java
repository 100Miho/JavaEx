package com.javaex.function.stream;

public class Student {
	// 필드
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	// Getters
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAverate() {
		return getTotal() / 3;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", getTotal()="
				+ getTotal() + ", getAverate()=" + getAverate() + "]";
	}
}
