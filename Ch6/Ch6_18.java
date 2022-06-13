package Ch6;

// �ڹ��� ���� 6�� 18�� ����
// Date : 22 / 06 / 13

// ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.

/* �޼���� : isNumber
 * ��     �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
 * ��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�Ѵ�.
 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ�""�̶�� false�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� : String str - �˻��� ���ڿ�
 * 
 * ��� : 123�� �����Դϱ�? true
 *      1234o�� �����Դϱ�? false
*/

public class Ch6_18 {
	// ��ü�� ������ �����Ƿ� static�� �ٿ� Ŭ���� �޼���� ����
	static boolean isNumber(String str) { // 1. �־��� ���ڿ��� ��� �������� Ȯ�� for���� if��, charAt�̿�
		                                  // 2. ���ڸ� true �ƴϸ� false
		if (str == null || str == "") { // null�̰ų� �����̸� false ����
			return false;
		}
		for (int i = 0; i < str.length(); i++) { // ���ڿ��� ���̸�ŭ �ݺ�
			if (!('0' <= str.charAt(i) && str.charAt(i) <= '9')) { 
				// ���ڿ��� �ѱ��ھ� �о�� ���ڰ� �ƴҰ�� false ����
				return false;
			}
		}
		return true; // ���ڿ��� ���ڷ� �̷�����ִ��� Ȯ���ϴ� �ݺ����� ��������Ƿ� true ����
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		System.out.println("null �׽�Ʈ " + isNumber(null));
	}

}
