package Ch4;

//�ڹ��� ���� 4�� 7��° ����
//22 / 06 / 05

/*���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ��µǾ�� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�.*/

/*public class Ch4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			            (1)
			 
		}
		
		System.out.println("sum=" + sum);
	}
}
*/

public class Ch4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; // ������� �� ������ ���� �ڷ��� int�̹Ƿ� ����ȯ�� �ʿ䰡 ����.
		}
		System.out.println("sum=" + sum);
	}
}
