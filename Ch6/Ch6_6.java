package Ch6;

// 자바의 정석 6장 6번 문제
// Date : 22 / 06 / 12

// 연습문제 6-4에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스 메서드로 정의하시오.

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) { // 매개변수 x, y의 좌표까지의 거리를 알고 싶을때 
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)); // 두점 사이 거리 구하는 공식을 검색하여 넣었음
		                                                                     // 루트 Math.sqrt, 제곱 Math.pow
	}
}
public class Ch6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
