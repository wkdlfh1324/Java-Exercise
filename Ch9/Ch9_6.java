package Ch9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// �ڹ��� ���� 9�� 6�� ����
// Date : 22 / 07 / 10

/*
 * ������ ȭ�����κ��� ��ȭ��ȣ�� �Ϻθ� �Է¹޾� ��ġ�ϴ� ��ȭ��ȣ�� �־��� ���ڿ� �迭���� ã�Ƽ� ����ϴ� ���α׷��̴�.
 * �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
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
				String tmp = num.replace("-", ""); // phoneNum���� '-'�� ����
				Matcher m = p.matcher(tmp);
				if (m.find()) { // ���ϰ� ��ġ�ϸ�, list�� phoneNum�� �߰��Ѵ�.
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
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}
	}
}
