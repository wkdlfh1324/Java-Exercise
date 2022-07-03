package Ch7;

// �ڹ��� ���� 7�� 4~5�� ����
// Date : 22 / 07 / 03

/*
 * MyTvŬ������ ������� isPowerOn, channel, volume�� Ŭ���� �ܺο��� ������ �� ������ �����ڸ� ���̰� ���
 * �� ����������� ���� ��𼭳� �ϰ� ������ �� �ֵ��� getter�� setter�޼��带 �߰��Ͻÿ�.
 */

/*
 * �������� 7-4���� �ۼ��� MyTvŬ������ ���� ä��(previous channel)�� �̵��ϴ� ����� �޼��带 �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
 * 
 * �޼���� : gotoPrevChannel
 * ��     �� : ���� ä���� ���� ä�η� �����Ѵ�.
 * ��ȯŸ�� : ����
 * �Ű����� : ����
 */

class MyTv {
	private boolean isPowerOn;
	private int channel = 1;
	private int volume;
	
	private int prevChannel; // ���� ä���� ������ ����
	
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
		int prev; // ���� ä�� �ӽ� ������ ����
		
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
