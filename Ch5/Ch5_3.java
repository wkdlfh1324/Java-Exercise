package Ch5;

import java.util.Arrays;

// �ڹ��� ���� 5�� 3�� ����
// Date : 22 / 06 / 07

// �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.

/*public class Ch5_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 ,50 };
		int sum = 0;
             (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.		
		System.out.println("sum=" + sum);
	}
}*/

public class Ch5_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 ,50 }; // ��� ���� ���Ϸ��� ������ ���� ��������
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // int�� �迭 arr�� ���̸�ŭ �ݺ��ϸ� �ε����� �����ϴ� i������ �־� ���� ������� �Ѱ��� ���ͼ� sum�� ������
		
		System.out.println("sum=" + sum);
	}
}
