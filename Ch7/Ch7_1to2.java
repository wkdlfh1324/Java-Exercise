package Ch7;

// �ڹ��� ���� 7�� 1~2�� ����
// Date : 22 / 07 / 03

// ����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ������ ���̴�. ����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ �Ͻÿ�.
// ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �� �־� �ְ�, ���ڰ� 1, 3, 8�� ��쿡�� �� ���� �� ���� ��(kwang)�̾�� �Ѵ�.
// ��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾�� �Ѵ�.

/* �������� 7-1�� SutdaDeckŬ������ ������ ���ǵ� ���ο� �޼��带 �߰��ϰ� �׽�Ʈ�Ͻÿ�.
 * 
 * �޼���� : shuffle
 * ��     �� : �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�.(Math.random()���)
 * ��ȯŸ�� : ����
 * �Ű����� : ����
 * 
 * �޼���� : pick
 * ��     �� : �迭 cards�� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : SutdaCard
 * �Ű����� : int index - ��ġ
 * 
 * �޼���� : pick
 * ��     �� : �迭 cards�� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.(Math.random()���)
 * ��ȯŸ�� : SutdaCard
 * �Ű����� : ����
 * */

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() { // 1���� 10���� ���� �ѽ�, ���ڰ� 1, 3, 8 �̸� isKwang�� true
		int j = 1; // 1���� 10���� ���� ����
		for (int i = 0; i < cards.length; i++, j++) { // ī���� ���ڸ�ŭ �ݺ��ؼ� ��ü ����
			cards[i] = new SutdaCard(j, i <= 9 && 
					                    i == 0 || 
					                    i == 2 || 
					                    i == 7 ? 
					                    		true : false); // i�� 10�����϶� 1, 3, 8�̸� isKwang = true
			if (i == 9) { // 10��° �迭�� ���ڰ� ���� 1���� �ٽ� ����
				j = 0;
			}
		}
	}
	
	void shuffle() { // �迭 cards�� ��� ī�� ��ġ�� �ڼ��� �޼���
		for (int i = 0; i < cards.length; i++) {
			SutdaCard tmp = new SutdaCard(); // �迭�� ��ġ�� �ӽ������� ��ä ����
			int random = (int)(Math.random() * 20);
			
			tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() { // pick �޼��带 �����ε�
		int random = (int)(Math.random() * 20);
		return cards[random];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num + (isKwang ? "K" : "");
	}
}

public class Ch7_1to2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
