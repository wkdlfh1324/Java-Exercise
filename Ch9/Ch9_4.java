package Ch9;

// �ڹ��� ���� 9�� 4�� ����
// Date : 22 / 07 / 10

/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * 
 * �޼���� : contains
 * ��     �� : ù ��° ���ڿ�(src)�� �� ��° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� : String src
 *         String target
 */

public class Ch9_4 {
	static boolean contains(String src, String target) {
		return src.indexOf(target, 0) > 0; // ���ڿ��� �ϳ��� �����ϸ� true
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		System.out.println(contains("12345", "345"));
	}
}
