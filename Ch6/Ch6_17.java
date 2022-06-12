package Ch6;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Arrays;

// �ڹ��� ���� 6�� 17�� ����
// Date : 22 / 06 / 12

// ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
// �޼���� : shuffle
// ��� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
//      ó���� �迭�� ��ȯ�Ѵ�.
// ��ȯŸ�� : int[]
// �Ű����� : int[]arr - �������� ��� �迭

public class Ch6_17 {
	
	static int[] shuffle(int[] arr) { // Ŭ���� �޼���� ������ �ν��Ͻ� �������� ��밡��
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		} // �迭�� ����
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
