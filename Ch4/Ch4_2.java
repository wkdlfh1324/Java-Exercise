package Ch4;

//�ڹ��� ���� 4�� 1��° ����
//22 / 06 / 05

/*1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.*/

public class Ch4_2 {
	public static void main(String[] args) {
		int sum = 0; // ���
		for (int i = 1; i <= 20; i++) { // 1���� 20������ ���� �ݺ� 
			if (i % 2 != 0 && i % 3 != 0) { // 2 �Ǵ� 3�� ������� Ȯ��
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
