package Ch7;

// �ڹ��� ���� 7�� 6�� ����
// OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Ch7_6 {
	public static void main(String[] args) {
		Outer outer = new Outer(); // ���� Ŭ������ �ܺ� Ŭ������ ��ü�� �����Ͽ� ����
		Outer.Inner ot = outer.new Inner(); // ��ü ������ ����
		System.out.println(outer.new Inner().iv);
		System.out.println(ot.iv);
	}
}
