package Ch4;

import java.util.Scanner;

//�ڹ��� ���� 4�� 10��° ����
//22 / 06 / 05

/*������ ���ڸ����� ������ �ۼ��� ���̴�.
1�� 100 ������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ������ ������ ������.
����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ������ ������ ������ �� �� ���� ���ڸ� �������� �˷��ش�.
(1)~(2)�� �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.*/

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
//			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
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
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt();
		    
			if (input == answer) {
				System.out.println("�������ϴ�.");
				System.out.printf("�õ�Ƚ���� %d���Դϴ�.%n", count);
				break;
			} else if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			
		} while(true);
	}
}
