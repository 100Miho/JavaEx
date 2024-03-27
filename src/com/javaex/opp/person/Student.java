package com.javaex.opp.person;

public class Student extends Person {
	String schoolName;
	
	public Student() {}
	public Student(String schoolName) {
		this.schoolName=schoolName;
	}
	public Student(String name, int age, String schoolName) {
		setName(name);
		setAge(age);
		this.schoolName=schoolName;
	}
	
	public String getSchoolname() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d, 출신: %s%n", getName(), getAge(), schoolName);
	}
}