package Ch5;

import java.lang.reflect.Array;
import java.util.Arrays;

// �ڹ��� ���� 5�� 5�� ����
// Date : 22 / 06 / 07

// ������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�.
// (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.

/*public class Ch5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			    (1)
			    
		}
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		
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
		
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j]; 
			ballArr[j] = tmp; // �迭�� �ε����� ���� ��ġ�� �ٲ۴�
		}
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		// ����ϱ� copyOf ���
		ball3 = Arrays.copyOf(ballArr, 3); // ballArr �迭�� 0, 1, 2 �ε����� �� ball3 �迭�� ����
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
