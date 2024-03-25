package com.javaex.oop.song.v03;
// v03 - 메서드 오버로딩


public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {}
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
		System.out.println("title, artist 생성자");
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
//		this.title=title;
//		this.artist=artist;
		this(title, artist);
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
		System.out.println("전체 필드 생성자");
	}
	
	// Getter, Setter
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d번 Track, %s작곡)\n", artist, title, album, year, title, composer);
	}
}
