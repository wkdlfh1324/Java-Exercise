package Ch6;

// 자바의 정석 6장 4번 문제
// Date : 22 / 06 / 12

// 두 점의 거리를 계산하는 getDistance()를 완성하시오.

/*public class Ch6_4 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
              
              	(1) 알맞은 코드를 넣어 완성하시오.	
              		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}*/

// 결과 1.4142135623730951


public class Ch6_4 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)); // 두점 사이 거리 구하는 공식을 검색하여 넣었음
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
