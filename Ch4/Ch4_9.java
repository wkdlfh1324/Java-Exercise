package Ch4;

//�ڹ��� ���� 4�� 9��° ����
//22 / 06 / 05

/*intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�. 
���� ���� num�� ���� 12345���, '1+2+3+4+5'�� ����� 15�� ����϶�.
(1)�� �˸��� �ڵ带 �����ÿ�.*/

/*public class Ch4_9 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		(1)
		
		System.out.println("sum="+sum);
	}
}*/

public class Ch4_9 {
	public static void main(String[] args) {
		int num = 123456;
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.err.println("sum="+sum);
	}
}
