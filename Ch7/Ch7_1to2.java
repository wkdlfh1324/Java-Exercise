package Ch7;

// 자바의 정석 7장 1~2번 문제
// Date : 22 / 07 / 03

// 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯다카드 20장을 담는 SutdaCard배열을 초기화 하시오.
// 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(kwang)이어야 한다.
// 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.

/* 연습문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트하시오.
 * 
 * 메서드명 : shuffle
 * 기     능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
 * 반환타입 : 없음
 * 매개변수 : 없음
 * 
 * 메서드명 : pick
 * 기     능 : 배열 cards에 지정된 위치의 SutdaCard를 반환한다.
 * 반환타입 : SutdaCard
 * 매개변수 : int index - 위치
 * 
 * 메서드명 : pick
 * 기     능 : 배열 cards에 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
 * 반환타입 : SutdaCard
 * 매개변수 : 없음
 * */

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() { // 1부터 10까지 숫자 한쌍, 숫자가 1, 3, 8 이면 isKwang이 true
		int j = 1; // 1부터 10까지 넣을 숫자
		for (int i = 0; i < cards.length; i++, j++) { // 카드의 숫자만큼 반복해서 객체 생성
			cards[i] = new SutdaCard(j, i <= 9 && 
					                    i == 0 || 
					                    i == 2 || 
					                    i == 7 ? 
					                    		true : false); // i가 10이하일때 1, 3, 8이면 isKwang = true
			if (i == 9) { // 10번째 배열에 숫자가 들어가면 1부터 다시 시작
				j = 0;
			}
		}
	}
	
	void shuffle() { // 배열 cards에 담긴 카드 위치를 뒤섞는 메서드
		for (int i = 0; i < cards.length; i++) {
			SutdaCard tmp = new SutdaCard(); // 배열의 위치를 임시저장할 객채 생성
			int random = (int)(Math.random() * 20);
			
			tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() { // pick 메서드를 오버로딩
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
