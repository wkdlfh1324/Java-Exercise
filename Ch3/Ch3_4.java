package Ch3;

//�ڹ��� ���� 3�� 4��° ����
//22 / 06 / 04

/*�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�. 
���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ��� ���̴�. 
(1)�� �˸��� �ڵ带 �����ÿ�.*/

/*public class Ch3_4 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucker = (  (1)  );
		
		System.out.println("�ʿ��� �ٱ��� �� :" + numOfBucker);
		
	}
}*/

public class Ch3_4 {
	public static void main(String[] args) {
		int numOfApples = 1; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��
		int numOfBucker = numOfApples % sizeOfBucket != 0 ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket; // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ��� �� :" + numOfBucker);
		
	}
}
