package Ch5;

// �ڹ��� ���� 5�� 4�� ����
// Date : 22 / 06 / 07

// 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.

/*public class Ch5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20},
				{ 30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}*/

public class Ch5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20},
				{ 30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		int count = 0; // 2���� �迭�ȿ� �ִ� ������ ����
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];  // ���� �ݺ����� �̿��� 2���� �迭 ��ü ������ ���� ���� ������ ���ϴ� ������ ������
				count ++;
			}
		}
		average = (float)(total) / count; // total�� count �Ѵ� �������̹Ƿ� �Ǽ��� ǥ���ϱ� ���� �ϳ��� float�� ����ȯ
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}
