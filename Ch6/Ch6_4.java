package Ch6;

// �ڹ��� ���� 6�� 4�� ����
// Date : 22 / 06 / 12

// �� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�.

/*public class Ch6_4 {
	// �� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
              
              	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.	
              		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}*/

// ��� 1.4142135623730951


public class Ch6_4 {
	// �� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)); // ���� ���� �Ÿ� ���ϴ� ������ �˻��Ͽ� �־���
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
