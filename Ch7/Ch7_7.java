package Ch7;

// �ڹ��� ���� 7�� 7�� ����
// Date : 22 / 07 / 04

// OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

public class Ch7_7 {
	public static void main(String[] args) {
		Outer2.Inner oi = new Outer2.Inner(); // ���� staticŬ������ �ܺ� Ŭ���� ��ü �������� ���� ����
		System.out.println(oi.iv);
	}
}
