package Ch6;

// �ڹ��� ���� 6�� 21�� ����
// Date : 22 / 06 / 13

// ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.

/*
 * �޼���� : abs
 * ��     �� : �־��� ���� ���밪�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : int value
 */

public class Ch6_21 {
	// ���밪�� ��ȯ�ϴ� abs �޼���
	static int abs(int value) {
		return Math.abs(value);
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "�� ���밪:" + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪:" + abs(value));
	}

}
