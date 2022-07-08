package Ch9;

// �ڹ��� ���� 9�� 1�� ����
// Date : 22 / 07 / 08

/*
 * ������ ���� �������� �򵵷� SutdaCardŬ������ equals()�� ��������� num, isKwang�� ���� ���ϵ��� �������̵��ϰ� �׽�Ʈ �Ͻÿ�.
 * 
 * ��� : c1=3K
 *      c2=3K
 *      c1.eqauls(c2):true
 */ 

public class Ch9_1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
		public boolean equals(Object obj) {
			return this.num == ((SutdaCard)obj).num &&
					this.isKwang == ((SutdaCard)obj).isKwang;
		}
	
	@Override
		public String toString() {
			return num + (isKwang ? "K" : "");
		}
}