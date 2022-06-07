package Ch5;

import java.util.Arrays;

// 자바의 정석 5장 3번 문제
// Date : 22 / 06 / 07

// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

/*public class Ch5_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 ,50 };
		int sum = 0;
             (1) 알맞은 코드를 넣어 완성하시오.		
		System.out.println("sum=" + sum);
	}
}*/

public class Ch5_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 ,50 }; // 모든 값을 더하려면 값들을 각자 빼내야함
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // int형 배열 arr의 길이만큼 반복하며 인덱스에 증감하는 i변수를 넣어 값을 순서대로 한개씩 빼와서 sum에 더해줌
		
		System.out.println("sum=" + sum);
	}
}
