package Ch4;

//자바의 정석 4장 7번째 문제
//22 / 06 / 05

/*숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.*/

/*public class Ch4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			            (1)
			 
		}
		
		System.out.println("sum=" + sum);
	}
}
*/

public class Ch4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; // 결과값이 더 범위가 넓은 자료형 int이므로 형변환이 필요가 없다.
		}
		System.out.println("sum=" + sum);
	}
}
