package Ch9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 자바의 정석 9장 6번 문제
// Date : 22 / 07 / 10

/*
 * 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열 배열에서 찾아서 출력하는 프로그램이다.
 * 알맞은 코드를 넣어 프로그램을 완성하시오.
 */

public class Ch9_6 {
	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7890", "088-2346-9870", "013-3456-7890" };
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println(">>");
			String input = s.nextLine().trim();

			Pattern p = Pattern.compile(".*" + input + ".*");

			for (int i = 0; i < phoneNumArr.length; i++) {
				String num = phoneNumArr[i];
				String tmp = num.replace("-", ""); // phoneNum에서 '-'를 제거
				Matcher m = p.matcher(tmp);
				if (m.find()) { // 패턴과 일치하면, list에 phoneNum을 추가한다.
					list.add(num);
				}
			}

			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
				;
			}

			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}
}
