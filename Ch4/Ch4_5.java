package Ch4;

//�ڹ��� ���� 4�� 5��° ����
//22 / 06 / 05

/*������ for���� while������ �����Ͻÿ�.

public class Ch4_5 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}*/

public class Ch4_5 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) { // 10�� �ݺ�
			int j = 0;
			while (j <= i) { // i�� ũ�⸸ŭ * ���
				System.out.print("*");
				j++;
			}
			System.out.println(); // �ٹٲ�
			i++;
		}
	}
}
