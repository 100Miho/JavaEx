package com.javaex.oop.tv.v01;

public class TV {
	// 상수
	private static final int MIN_CAHNNEL = 1;
	private static final int MAX_CAHNNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {}
	public TV(int channel, int voluem, boolean power) {
		this.channel=channel;
		this.volume=voluem;
		this.power=power;
	}
	
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void power(boolean on) {
		power = on ? true : false;
	}
	
	public void channer(int channel) {
//		if(channel >= 1 && channel <= 255) {
//			this.channel=channel;
//		} else if(channel <= 0) {
//			channel = 255;
//			this.channel=channel;
//		} else if(channel > 255) {
//			channel = 1;
//			this.channel=channel;
//		}
		if(channel >= MIN_CAHNNEL && channel <= MAX_CAHNNEL)
			this.channel=channel;
	}
	public void channer(boolean up) {
//		if(channel >= 1 && channel <= 255) {
//			channel = up ? channel+1 : channel-1;
//		} else if(channel <= 0) {
//			channel=255;
//		} else if(channel > 255) {
//			channel = 1;
//		}
		if(up) {
			if(this.channel < MAX_CAHNNEL)
				this.channel++;
		} else {
			if(this.channel > MIN_CAHNNEL)
				this.channel--;
		}
	}
	
	public void voluem(int volume) {
//		if(volume >= 0 && volume <= 100) {
//			this.volume=volume;
//		} else if (volume < 0) {
//			volume=0;
//			this.volume=volume;
//		} else if (volume > 100) {
//			volume=100;
//			this.volume=volume;
//		}
		if(volume >= MIN_VOLUME && volume <= MAX_VOLUME)
			this.volume=volume;
	}
	public void voluem(boolean up) {
//		if(volume >= 0 && volume <= 100) {
//			volume = up ? volume+1 : volume-1;
//		} else if(volume < 0) {
//			volume = 0;
//		} else if(volume > 100) {
//			volume = 100;
//		}
		if(up) {
			if(volume < MAX_VOLUME)
				this.volume++;
		} else {
			if(volume > MIN_VOLUME)
				this.volume--;
		}
				
	}
	
	
	public void status() {
		if(power)
			System.out.printf("채널: %d, 볼륨: %d%n", getChannel(), getVolume());
		else
			System.out.println("전원 꺼짐");
	}
}