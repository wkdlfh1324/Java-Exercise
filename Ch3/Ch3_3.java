package Ch3;

// �ڹ��� ���� 3�� 3��° ����
// 22 / 06 / 04

// �Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. ���� ���� num�� ���� '456'�̶�� '400'�� �ǰ�, '111'�̶�� '100'�� �ȴ�. (1)�� �˸��� �ڵ带 �����ÿ�.
/*public class Ch3_3 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println(  (1)  );
	}
}*/

public class Ch3_3 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println(num / 100 * 100);
	}
}
