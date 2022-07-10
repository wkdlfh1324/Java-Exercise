package Ch9;

// �ڹ��� ���� 9�� 2�� ����
// Date : 22 / 07 / 09

/*
 * ������ ���� �������� �򵵷� Point3DŬ������ equals()�� ��������� x, y, z�� ���� ���ϵ��� �������̵��ϰ�,
 * toString()�� �������� �����ؼ� ������ �������̵� �Ͻÿ�.
 * 
 * ��� : [1,2,3]
 *      [1,2,3]
 *      p1==p2?false
 *      p1.equals(p2)?true
 */

public class Ch9_2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));

	}
}

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	@Override
	public boolean equals(Object obj) { // �ν��Ͻ� ���� x, y, z�� ��
		return this.x == ((Point3D)obj).x &&
			   this.y == ((Point3D)obj).y &&
			   this.z == ((Point3D)obj).z;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "," + z + "]";
	}
}
