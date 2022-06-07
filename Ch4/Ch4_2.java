package Ch4;

//자바의 정석 4장 1번째 문제
//22 / 06 / 05

/*1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.*/

public class Ch4_2 {
	public static void main(String[] args) {
		int sum = 0; // 결과
		for (int i = 1; i <= 20; i++) { // 1부터 20까지의 정수 반복 
			if (i % 2 != 0 && i % 3 != 0) { // 2 또는 3의 배수인지 확인
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
