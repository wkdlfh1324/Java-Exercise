package Ch4;

//�ڹ��� ���� 4�� 6��° ����
//22 / 06 / 05

/*�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Ch4_6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { // �ֻ��� 1
			for (int j = 1; j <= 6; j++) { // �ֻ��� 2
				if (i + j == 6) { // �հ谡 6
					System.out.printf("%d + %d = %d%n", i, j, i+j); // ����� �� ���
				}
			}
		}
	}
}
