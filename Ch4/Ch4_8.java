package Ch4;

//�ڹ��� ���� 4�� 8��° ����
//22 / 06 / 05

//Math.random()�� �̿��ؼ� 1���� 6 ������ ������ ������ ���� value�� �����ϴ� �ڵ带 �ϼ��϶�. (1)�� �˸��� �ڵ带 �����ÿ�.

/*public class Ch4_8 {
	public static void main(String[] args) {
		int value = ( (1) );
		
		System.out.println("value:" + value);
	}
}*/

public class Ch4_8 {
	public static void main(String[] args) {
		int value = (int)(Math.random() * 6) + 1; // 0 ~ 5�� ���� �����Ƿ� 1�� �����ش�.
		System.out.println("value:" + value);
	}
}
