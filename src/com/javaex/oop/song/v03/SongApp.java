package com.javaex.oop.song.v03;

public class SongApp {
	public static void main(String[] args) {
		Song[] song = new Song[5];
		
		song[0]=new Song("아이유", "좋은날", "Rear", "이민수", 2010, 3);
		song[1]=new Song("BICBANG", "거짓말", "Always", "G-DRAGO", 2007, 2);
		song[2]=new Song("버스커 버스커", "벚꽃엔딩", "버스커버스커 1집", "장범준", 2012, 4);	
		song[3]=new Song("Missing", "Ellegarden");
		song[4]=new Song("창귀", "안예은");
		for(Song val: song)
			val.showInfo();
	}
}
