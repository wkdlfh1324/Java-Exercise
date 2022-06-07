package Ch4;

//자바의 정석 4장 8번째 문제
//22 / 06 / 05

//Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.

/*public class Ch4_8 {
	public static void main(String[] args) {
		int value = ( (1) );
		
		System.out.println("value:" + value);
	}
}*/

public class Ch4_8 {
	public static void main(String[] args) {
		int value = (int)(Math.random() * 6) + 1; // 0 ~ 5의 값이 나오므로 1을 더해준다.
		System.out.println("value:" + value);
	}
}
