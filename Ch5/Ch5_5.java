package Ch5;

import java.lang.reflect.Array;
import java.util.Arrays;

// 자바의 정석 5장 5번 문제
// Date : 22 / 06 / 07

// 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
// (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

/*public class Ch5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			    (1)
			    
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		        (2)
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}
}*/

public class Ch5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j]; 
			ballArr[j] = tmp; // 배열의 인덱스의 값의 위치를 바꾼다
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// 복사니까 copyOf 사용
		ball3 = Arrays.copyOf(ballArr, 3); // ballArr 배열의 0, 1, 2 인덱스의 값 ball3 배열에 복사
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
