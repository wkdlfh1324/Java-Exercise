package Ch4;

//�ڹ��� ���� 4�� 4��° ����
//22 / 06 / 05

/*1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100 �̻��� �Ǵ��� ���Ͻÿ�.*/

public class Ch4_4 {
	public static void main(String[] args) {	
		
		int sum = 0; // ����
		int s = 1;
		int num = 0;
		
//      While �� ���
		
//		int i = 1; // �ݺ�
//		while(sum <= 100) { // ������ 100 �̻� �ɶ����� �ݺ�
//			int j = i; 
//			if (i % 2 == 0) { // 2�� ������ ������ ����
//				i *= -1;
//			}
//			sum += i;
//			System.out.printf("%d%n", i);
//			i = j;
//			i++;
//		}
//		System.out.println(sum);
		
		for (int i = 1; true; i++, s = -s) {
			num = s * i;
			sum += num;
			
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}
