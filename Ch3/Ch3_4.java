package Ch3;

//자바의 정석 3장 4번째 문제
//22 / 06 / 04

/*아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 
만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다. 
(1)에 알맞은 코드를 넣으시오.*/

/*public class Ch3_4 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucker = (  (1)  );
		
		System.out.println("필요한 바구의 수 :" + numOfBucker);
		
	}
}*/

public class Ch3_4 {
	public static void main(String[] args) {
		int numOfApples = 1; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기
		int numOfBucker = numOfApples % sizeOfBucket != 0 ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket; // 모든 사과를 담는데 필요한 바구니의 수
		
		System.out.println("필요한 바구의 수 :" + numOfBucker);
		
	}
}
