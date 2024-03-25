package com.javaex.oop.song.v02;

public class SongApp {
	public static void main(String[] args) {
		Song[] song = new Song[3];
		
		song[0]=new Song("아이유", "좋은날", "Rear", "이민수", 2010, 3);
		song[1]=new Song("BICBANG", "거짓말", "Always", "G-DRAGO", 2007, 2);
		song[2]=new Song("버스커 버스커", "벚꽃엔딩", "버스커버스커 1집", "장범준", 2012, 4);	
		
		for(Song val : song)
			// val.showInfo();
			System.out.printf("%s, %s (%s, %d번 Track, %s작곡)\n", val.getTitle(), val.getArtist(), val.getAlbum(), val.getYear(), val.getTrack                       (), val.getComposer());
	}
}
