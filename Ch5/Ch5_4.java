package Ch5;

// 자바의 정석 5장 4번 문제
// Date : 22 / 06 / 07

// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

/*public class Ch5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20},
				{ 30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}*/

public class Ch5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20},
				{ 30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		int count = 0; // 2차원 배열안에 있는 값들의 갯수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];  // 이중 반복문을 이용해 2차원 배열 전체 각각의 값을 빼내 총합을 구하는 변수에 더해줌
				count ++;
			}
		}
		average = (float)(total) / count; // total과 count 둘다 정수형이므로 실수를 표시하기 위해 하나를 float로 형변환
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}
