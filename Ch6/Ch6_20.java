package Ch6;

import java.util.Arrays;

// �ڹ��� ���� 6�� 20�� ����
// Date : 22 / 06 / 13

// ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.

/*
 * �޼���� : max
 * ��     �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�.
 *         ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : int[] arr - �ִ밪�� ���� �迭
 */

public class Ch6_20 {
	static int max(int[] arr) {
		int max = 0; // �ִ밪�� �� ������ ����� �ʱ�ȭ����
		if (arr == null || arr.length == 0) { // �迭�� null�̰ų� ũ�Ⱑ 0�϶� -999999�� ��ȯ
			return -999999;
		}
		// �迭�� �� ���̶� ���� ���ϱ� ���� for���� �迭�� �ε����� ���� �迭�� ������ ������
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max; // ���� �迭 �ε����� ���� �ִ밪�� �� ����(max)�� ���� ���� �迭�� ���ڰ� ���ٸ� �ִ밪�� �迭�� ���ڷ� �ٲ���
		}
		return max; // �ִ밪�� ��ȯ
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));
		System.out.println("�ִ밪:" + max(null));
		System.out.println("�ִ밪:" + max(new int[] {}));
	}
}
