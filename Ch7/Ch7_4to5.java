package Ch7;

// 자바의 정석 7장 4~5번 문제
// Date : 22 / 07 / 03

/*
 * MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신
 * 이 멤버변수들의 값을 어디서나 일고 변경할 수 있도록 getter와 setter메서드를 추가하시오.
 */

/*
 * 연습문제 7-4에서 작성한 MyTv클래스에 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * 
 * 메서드명 : gotoPrevChannel
 * 기     능 : 현재 채널을 이전 채널로 변경한다.
 * 반환타입 : 없음
 * 매개변수 : 없음
 */

class MyTv {
	private boolean isPowerOn;
	private int channel = 1;
	private int volume;
	
	private int prevChannel; // 이전 채널을 저장할 변수
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	void setChannel(int channel) {
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	void setVolume(int volume) {
		this.volume = volume;
	}
	boolean getIsPowerOn() {
		return isPowerOn;
	}
	int getChannel() {
		return channel;
	}
	int getVolume() {
		return volume;
	}
	void gotoPrevChannel() {
		int prev; // 이전 채널 임시 저장할 변수
		
		prev = this.channel;
		this.channel = this.prevChannel;
		this.prevChannel = prev;
	}
	
}

public class Ch7_4to5 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
