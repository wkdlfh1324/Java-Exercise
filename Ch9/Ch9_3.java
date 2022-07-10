package Ch9;

// 자바의 정석 9장 3번 문제
// Date : 22 / 07 / 09

/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 
 * 메서드명 : count
 * 기     능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
 * 반환타입 : int
 * 매개변수 : String src
 *         String target
 *         
 * (1) 반복문을 사용해서 아래의 과정을 반복한다.
 * 1. src에서 target을 pos의 위치부터 찾는다.
 * 2. 찾으면 count의 값을 1 증가 시키고, pos의 값을 target.length만큼 증가시킨다.
 * 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
 */

public class Ch9_3 {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while (true) {
			int index = src.indexOf(target, pos);
			if (index > 0) { // 문자열이 있다면
				count++; // 갯수를 증가시켜줌
				pos = index + target.length(); // 발견한 문자 뒤부터 다시 찾음
 			} else if (index == -1) { // 없다면 -1을 리턴하므로 조건을 줘서 반복문을 빠져나온다
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345AB", "345"));
		System.out.println(count("12345", "AB"));
	}
}
