package Ch8;

import java.util.Scanner;

// �ڹ��� ���� 8�� 7�� ����
// date : 22 / 07 / 06

/*
 * ������ 1~100������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ� �־ �߻��� �����̴�.
 * ����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է��� �޵��� �����϶�. 
 * 
 * 1�� 100������ ���� �Է��ϼ��� : 50
 * �� ���� ���� �Է��ϼ���.
 * 1�� 100������ ���� �Է��ϼ��� : asdf
 * Exception in thread~~~
 */

public class Ch8_7 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");

			try {
				input = new Scanner(System.in).nextInt();
				if (answer > input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else if (answer < input) {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				} else {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
					break;
				}
			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
			}
		} while (true);
	}
}
