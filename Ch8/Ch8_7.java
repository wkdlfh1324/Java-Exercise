package Ch8;

import java.util.Scanner;

// 자바의 정석 8장 7번 문제
// date : 22 / 07 / 06

/*
 * 다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.
 * 예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라. 
 * 
 * 1과 100사이의 값을 입력하세요 : 50
 * 더 작은 수를 입력하세요.
 * 1과 100사이의 값을 입력하세요 : asdf
 * Exception in thread~~~
 */

public class Ch8_7 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");

			try {
				input = new Scanner(System.in).nextInt();
				if (answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if (answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + count + "번입니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			}
		} while (true);
	}
}
