package com.javaex.opp.tv.v01;

public class TV {
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
		if(channel >= 1 && channel <= 255) {
			this.channel=channel;
		} else if(channel <= 0) {
			channel = 255;
			this.channel=channel;
		} else if(channel > 255) {
			channel = 1;
			this.channel=channel;
		}
	}
	public void channer(boolean up) {
		if(channel >= 1 && channel <= 255) {
			channel = up ? channel+1 : channel-1;
		} else if(channel <= 0) {
			channel=255;
		} else if(channel > 255) {
			channel = 1;
		}
	}
	
	public void voluem(int volume) {
		if(volume >= 0 && volume <= 100) {
			this.volume=volume;
		} else if (volume < 0) {
			volume=0;
			this.volume=volume;
		} else if (volume > 100) {
			volume=100;
			this.volume=volume;
		}
	}
	public void voluem(boolean up) {
		if(volume >= 0 && volume <= 100) {
			volume = up ? volume+1 : volume-1;
		} else if(volume < 0) {
			volume = 0;
		} else if(volume > 100) {
			volume = 100;
		}
	}
	
	
	public void status() {
		System.out.printf("전원:%s, 채널: %d, 볼륨: %d%n", power ? "ON" : "OFF", getChannel(), getVolume());
	}
}