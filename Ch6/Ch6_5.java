package Ch6;

// �ڹ��� ���� 6�� 5�� ����
// Date : 22 / 06 / 12

// ������ �ڵ忡 ���ǵ� �������� �������� �����ؼ� �����ÿ�.

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}

public class Ch6_5 {
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}

// Ŭ���� ���� (static ����) : width, height
// �ν��Ͻ� ���� : kind, num
// �������� : k, n
