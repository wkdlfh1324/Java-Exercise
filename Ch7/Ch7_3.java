package Ch7;

// 자바의 정석 7장 3번 문제
// Date : 22 / 07 / 03

/* 
 * 다음의 코드는 컴파일하면 에러가 발생한다. 
 * 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
 * */

class Product {
	int price;
	int bounsPoint;
	
	Product(){} // 추가
	// Tv 객체 생성시 Tv 클래스의 조상 클래스인 Product도 같이 포함되므로 Product의 생성자도 같이 호출되는데, 기본 생성자가 없으므로 에러가 발생하였음.
	
	Product(int price) {
		this.price = price;
		bounsPoint = (int)(price / 10.0);
	}
}

class Tv extends Product {
	Tv() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv";
	}
}

public class Ch7_3 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
