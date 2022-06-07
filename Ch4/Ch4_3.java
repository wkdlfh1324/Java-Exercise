package Ch4;

//자바의 정석 4장 3번째 문제
//22 / 06 / 05

/*1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.*/

public class Ch4_3 {
	public static void main(String[] args) {
		int sum = 0; // 결과
		for (int i = 1; i <= 10; i++) { // 10번 반복
			for (int j = 1; j <= i; j++) { // 반복한 횟수만큼 j의 값을 추가
				sum += j; // j값을 더하기
			}
		}
		System.out.println(sum);
	}
}
