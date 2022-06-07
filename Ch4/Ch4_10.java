package Ch4;

import java.util.Scanner;

//자바의 정석 4장 10번째 문제
//22 / 06 / 05

/*다음은 숫자맞히기 게임을 작성한 것이다.
1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞히면 게임이 끝난다.
사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇 번 만에 숫자를 맞혔는지 알려준다.
(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.*/

//public class Ch4_10 {
//	public static void main(String[] args) {
//		int answer = (1);
//		int input = 0;
//		int count = 0;
//		
//		Scanner s = new Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1과 100사이의 값읋 입력하세요 :");
//			input = s.nextInt();
//
//			  (2)
//
//		} while(true);
//	}
//}

public class Ch4_10 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값읋 입력하세요 :");
			input = s.nextInt();
		    
			if (input == answer) {
				System.out.println("맞혔습니다.");
				System.out.printf("시도횟수는 %d번입니다.%n", count);
				break;
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			
		} while(true);
	}
}
