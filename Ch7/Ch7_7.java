package Ch7;

// 자바의 정석 7장 7번 문제
// Date : 22 / 07 / 04

// Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

public class Ch7_7 {
	public static void main(String[] args) {
		Outer2.Inner oi = new Outer2.Inner(); // 내부 static클래스는 외부 클래스 객체 생성없이 접근 가능
		System.out.println(oi.iv);
	}
}
