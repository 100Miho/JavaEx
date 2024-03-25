package com.javaex.oop.tv.v01;

public class TvApp {
	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.voluem(120);
		tv.status();
		
		tv.voluem(false);
		tv.status();
		
		tv.channer(0);
		tv.status();
		
		tv.channer(true);
		tv.channer(true);
		tv.channer(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}
}