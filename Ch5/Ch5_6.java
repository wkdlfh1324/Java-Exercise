package Ch5;

import java.util.Scanner;

// �ڹ��� ���� 5�� 6�� ����
// Date : 22 / 06 / 07

// �ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴�.
// �������� ���� �����ϵ��� ������ �� ���� ä��ÿ�.

/*public class Ch5_6 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ

			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�.
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���>", i + 1, new String(question));
			String answer = sc.nextLine();
			
			// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if (words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}
	}
}*/

public class Ch5_6 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			
			for (int j = 0; j < question.length; j++) {
				int random = (int)(Math.random() * question.length);
				
				char tmp = question[j];
				question[j] = question[random];
				question[random] = tmp;
			} // char�迭�� ���̸�ŭ �ݺ������ָ� �� ���ھ� ��ġ�� �����ش�.
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���>", i + 1, new String(question));
			String answer = sc.nextLine();
			
			// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if (words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}
	}
}
