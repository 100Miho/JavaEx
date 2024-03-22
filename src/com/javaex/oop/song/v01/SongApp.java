package com.javaex.oop.song.v01;

public class SongApp {
	public static void main(String[] args) {
		Song[] song = new Song[3];
		
		song[0]=new Song();
		song[0].setArtist("아이유");
		song[0].setTitle("좋은날");
		song[0].setAlbum("Real");
		song[0].setYear(2010);
		song[0].setTrack(3);
		song[0].setComposer("이민수");
		
		song[1]=new Song();
		song[1].setArtist("BICBANG");
		song[1].setTitle("거짓말");
		song[1].setAlbum("Always");
		song[1].setYear(2007);
		song[1].setTrack(2);
		song[1].setComposer("G-DRAGON");
		
		song[2]=new Song();
		song[2].setArtist("버스커버스커");
		song[2].setTitle("벚꽃엔딩");
		song[2].setAlbum("버스커버스커 1집");
		song[2].setYear(2012);
		song[2].setTrack(4);
		song[2].setComposer("장범준");
		
		for(Song val : song) {
			val.showInfo();
		}
	}
}
