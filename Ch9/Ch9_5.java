package Ch9;

// 자바의 정석 9장 5번 문제
// Date : 22 / 07 / 10

/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 
 * 메서드명 : delChar
 * 기     능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
 * 반환타입 : String
 * 매개변수 : String src - 변환할 문자열
 *         String delCh - 제거할 문자들로 구성된 문자열
 */

public class Ch9_5 {
	static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src); // 문자열의 제거를 위해 StringBuffer 사용, String 클래스는 수정이 불가능하다. Read Only
		for (int i = 0; i < delCh.length(); i++) { // 제거할 문자들을 한글자씩 가져오기 위해 반복문 사용
			String delChar = delCh.charAt(i) + ""; // 제거할 문자
			if (sb.indexOf(delChar, 0) >= 0) { // 문자가 존재한다면, 문자를 찾아서 문자를 제거
				while (true) { // 같은 문자가 여러개일수도 있으므로 반복
					sb.deleteCharAt(sb.indexOf(delChar, 0));					
					if (sb.indexOf(delChar, 0) == -1) { // 같은 문자가 남아있지 않다면 반복문을 나감
						break;
					}
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
