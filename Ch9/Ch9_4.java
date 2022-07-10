package Ch9;

// 자바의 정석 9장 4번 문제
// Date : 22 / 07 / 10

/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 
 * 메서드명 : contains
 * 기     능 : 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
 * 반환타입 : boolean
 * 매개변수 : String src
 *         String target
 */

public class Ch9_4 {
	static boolean contains(String src, String target) {
		return src.indexOf(target, 0) > 0; // 문자열이 하나라도 존재하면 true
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		System.out.println(contains("12345", "345"));
	}
}
