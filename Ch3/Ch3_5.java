package Ch3;

//�ڹ��� ���� 3�� 5��° ����
//22 / 06 / 04

//�Ʒ��� ���� num�� ���� ���� '���', '����', '0'�� ����ϴ� �ڵ��̴�. ���� �����ڸ� �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�.
/*public class Ch3_5 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(  (1)  );
	}
}*/

public class Ch3_5 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(0 == num ? "0" : (0 < num ? "���" : "����"));
	}
}
