package Ch7;

// �ڹ��� ���� 7�� 3�� ����
// Date : 22 / 07 / 03

/* 
 * ������ �ڵ�� �������ϸ� ������ �߻��Ѵ�. 
 * �� ������ �����ϰ� ������ �����ϱ� ���ؼ��� �ڵ带 ��� �ٲپ�� �ϴ°�?
 * */

class Product {
	int price;
	int bounsPoint;
	
	Product(){} // �߰�
	// Tv ��ü ������ Tv Ŭ������ ���� Ŭ������ Product�� ���� ���ԵǹǷ� Product�� �����ڵ� ���� ȣ��Ǵµ�, �⺻ �����ڰ� �����Ƿ� ������ �߻��Ͽ���.
	
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
