package Ch6;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Arrays;

// 자바의 정석 6장 17번 문제
// Date : 22 / 06 / 12

// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : shuffle
// 기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//      처리한 배열을 반환한다.
// 반환타입 : int[]
// 매개변수 : int[]arr - 정수값이 담긴 배열

public class Ch6_17 {
	
	static int[] shuffle(int[] arr) { // 클래스 메서드로 만들어야 인스턴스 생성없이 사용가능
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		} // 배열을 섞음
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
