package Ch3;

//�ڹ��� ���� 3�� 6��° ����
//22 / 06 / 04

/*�Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�. 
��ȯ������ 'C = 5/9 * (F - 32)'��� �� ��, (1)�� �˸��� �ڵ带 �����ÿ�. 
��, ��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ� �Ѵ�. (Math.round()�� ������� �ʰ� ó���� ��)*/

/*public class Ch3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (  (1)  );
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}*/

public class Ch3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
