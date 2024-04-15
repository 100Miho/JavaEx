package com.javaex.miniproject;

import java.io.PrintWriter;

public class Person {
	private int num;
	private String name;
	private String phone;
	private String tel;
	
	public Person(int num, String name, String phone, String tel) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.tel = tel;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setTxt(PrintWriter pw) {
		pw.println(name + "," + phone + "," + tel);
	}
	
	@Override
	public String toString() {
		return num + ". " + name + " " + phone + " " + tel;
	}
}