package Ch6;

import java.util.Arrays;

// 자바의 정석 6장 20번 문제
// Date : 22 / 06 / 13

// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.

/*
 * 메서드명 : max
 * 기     능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
 *         만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
 * 반환타입 : int
 * 매개변수 : int[] arr - 최대값을 구할 배열
 */

public class Ch6_20 {
	static int max(int[] arr) {
		int max = 0; // 최대값이 들어갈 변수를 만들고 초기화해줌
		if (arr == null || arr.length == 0) { // 배열이 null이거나 크기가 0일때 -999999를 반환
			return -999999;
		}
		// 배열의 값 중이라 값을 비교하기 위해 for문과 배열의 인덱스를 통해 배열의 값들을 가져옴
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max; // 현재 배열 인덱스의 값과 최대값이 들어갈 변수(max)의 값을 비교해 배열의 숫자가 높다면 최대값을 배열의 숫자로 바꿔줌
		}
		return max; // 최대값을 반환
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));
	}
}
