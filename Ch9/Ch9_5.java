package Ch9;

// �ڹ��� ���� 9�� 5�� ����
// Date : 22 / 07 / 10

/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * 
 * �޼���� : delChar
 * ��     �� : �־��� ���ڿ����� ������ ���ڵ��� �����Ͽ� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src - ��ȯ�� ���ڿ�
 *         String delCh - ������ ���ڵ�� ������ ���ڿ�
 */

public class Ch9_5 {
	static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src); // ���ڿ��� ���Ÿ� ���� StringBuffer ���, String Ŭ������ ������ �Ұ����ϴ�. Read Only
		for (int i = 0; i < delCh.length(); i++) { // ������ ���ڵ��� �ѱ��ھ� �������� ���� �ݺ��� ���
			String delChar = delCh.charAt(i) + ""; // ������ ����
			if (sb.indexOf(delChar, 0) >= 0) { // ���ڰ� �����Ѵٸ�, ���ڸ� ã�Ƽ� ���ڸ� ����
				while (true) { // ���� ���ڰ� �������ϼ��� �����Ƿ� �ݺ�
					sb.deleteCharAt(sb.indexOf(delChar, 0));					
					if (sb.indexOf(delChar, 0) == -1) { // ���� ���ڰ� �������� �ʴٸ� �ݺ����� ����
						break;
					}
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
