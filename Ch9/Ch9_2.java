package Ch9;

// 자바의 정석 9장 2번 문제
// Date : 22 / 07 / 09

/*
 * 다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 멤버변수인 x, y, z의 값을 비교하도록 오버라이딩하고,
 * toString()은 실행결과를 참고해서 적절히 오버라이딩 하시오.
 * 
 * 결과 : [1,2,3]
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
	public boolean equals(Object obj) { // 인스턴스 변수 x, y, z를 비교
		return this.x == ((Point3D)obj).x &&
			   this.y == ((Point3D)obj).y &&
			   this.z == ((Point3D)obj).z;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "," + z + "]";
	}
}
