package Ch9;

// �ڹ��� ���� 9�� 3�� ����
// Date : 22 / 07 / 09

/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * 
 * �޼���� : count
 * ��     �� : �־��� ���ڿ�(src)�� ã������ ���ڿ�(target)�� �� �� �������� ��� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : String src
 *         String target
 *         
 * (1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�.
 * 1. src���� target�� pos�� ��ġ���� ã�´�.
 * 2. ã���� count�� ���� 1 ���� ��Ű��, pos�� ���� target.length��ŭ ������Ų��.
 * 3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�.
 */

public class Ch9_3 {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while (true) {
			int index = src.indexOf(target, pos);
			if (index > 0) { // ���ڿ��� �ִٸ�
				count++; // ������ ����������
				pos = index + target.length(); // �߰��� ���� �ں��� �ٽ� ã��
 			} else if (index == -1) { // ���ٸ� -1�� �����ϹǷ� ������ �༭ �ݺ����� �������´�
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345AB", "345"));
		System.out.println(count("12345", "AB"));
	}
}
