package Ch4;

//�ڹ��� ���� 4�� 3��° ����
//22 / 06 / 05

/*1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.*/

public class Ch4_3 {
	public static void main(String[] args) {
		int sum = 0; // ���
		for (int i = 1; i <= 10; i++) { // 10�� �ݺ�
			for (int j = 1; j <= i; j++) { // �ݺ��� Ƚ����ŭ j�� ���� �߰�
				sum += j; // j���� ���ϱ�
			}
		}
		System.out.println(sum);
	}
}
