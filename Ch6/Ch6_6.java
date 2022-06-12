package Ch6;

// �ڹ��� ���� 6�� 6�� ����
// Date : 22 / 06 / 12

// �������� 6-4���� �ۼ��� Ŭ�����޼��� getDistance()�� MyPointŬ������ �ν��Ͻ� �޼���� �����Ͻÿ�.

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) { // �Ű����� x, y�� ��ǥ������ �Ÿ��� �˰� ������ 
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)); // ���� ���� �Ÿ� ���ϴ� ������ �˻��Ͽ� �־���
		                                                                     // ��Ʈ Math.sqrt, ���� Math.pow
	}
}
public class Ch6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		// p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2, 2));
	}
}
