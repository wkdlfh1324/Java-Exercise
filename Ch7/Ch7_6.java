package Ch7;

// 자바의 정석 7장 6번 문제
// Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Ch7_6 {
	public static void main(String[] args) {
		Outer outer = new Outer(); // 내부 클래스는 외부 클래스의 객체를 생성하여 접근
		Outer.Inner ot = outer.new Inner(); // 객체 생성도 가능
		System.out.println(outer.new Inner().iv);
		System.out.println(ot.iv);
	}
}
