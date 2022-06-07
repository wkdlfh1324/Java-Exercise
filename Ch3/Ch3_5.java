package Ch3;

//자바의 정석 3장 5번째 문제
//22 / 06 / 04

//아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
/*public class Ch3_5 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(  (1)  );
	}
}*/

public class Ch3_5 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(0 == num ? "0" : (0 < num ? "양수" : "음수"));
	}
}
