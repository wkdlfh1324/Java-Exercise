package Ch7;

// �ڹ��� ���� 7�� 8�� ����
// Date : 22 / 07 / 04

// ������ ���� �������� �򵵷� (1)~(4)�� �ڵ带 �ϼ��Ͻÿ�.

/*
 *  ��� : 30
 *       20
 *       10
*/

class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
				int value = 30;

				System.out.println(value);
				System.out.println(this.value); // Ŭ������ �ν��Ͻ� ���� ������ ���� this ���
				System.out.println(Outer3.this.value); // �ܺ� Ŭ���� ����
		}
	}
}

public class Ch7_8 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.Inner3 inner = out.new Inner3();

		inner.method1();
	}
}
