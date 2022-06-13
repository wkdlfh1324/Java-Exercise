package Ch6;

// 자바의 정석 6장 18번 문제
// Date : 22 / 06 / 13

// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.

/* 메서드명 : isNumber
 * 기     능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
 * 만일 주어진 문자열이 null이거나 빈문자열""이라면 false를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 * 
 * 결과 : 123는 숫자입니까? true
 *      1234o는 숫자입니까? false
*/

public class Ch6_18 {
	// 객체를 만들지 않으므로 static을 붙여 클래스 메서드로 만듦
	static boolean isNumber(String str) { // 1. 주어진 문자열이 모두 숫자인지 확인 for문과 if문, charAt이용
		                                  // 2. 숫자면 true 아니면 false
		if (str == null || str == "") { // null이거나 공백이면 false 리턴
			return false;
		}
		for (int i = 0; i < str.length(); i++) { // 문자열의 길이만큼 반복
			if (!('0' <= str.charAt(i) && str.charAt(i) <= '9')) { 
				// 문자열을 한글자씩 읽어내며 숫자가 아닐경우 false 리턴
				return false;
			}
		}
		return true; // 문자열이 숫자로 이루어져있는지 확인하는 반복문을 통과했으므로 true 리턴
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		System.out.println("null 테스트 " + isNumber(null));
	}

}
