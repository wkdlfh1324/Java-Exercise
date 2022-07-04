package Ch7;

// 자바의 정석 7장 8번 문제
// Date : 22 / 07 / 04

// 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.

/*
 *  결과 : 30
 *       20
 *       10
*/

class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
				int value = 30;

				System.out.println(value);
				System.out.println(this.value); // 클래스의 인스턴스 변수 접근을 위해 this 사용
				System.out.println(Outer3.this.value); // 외부 클래스 접근
		}
	}
}

public class Ch7_8 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.Inner3 inner = out.new Inner3();

		inner.method1();
	}
}
