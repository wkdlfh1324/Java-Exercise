package Ch3;

// �ڹ��� ���� 3�� 2��° ����
// 22 / 06 / 04
public class Ch3_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);                  //6      (00000011 -> 00000110)
		System.out.println(y >= 5 || x < 0 && x > 2);     //true   (true OR false && false)
		System.out.println(y += 10 - x++);                //13     (y = y + 10 - 2, x�� ���������ڷ� ���� 3)
		System.out.println(x += 2);                       //5      (x = x + 2)
		System.out.println(!('A' <= c && c <= 'Z'));      //false  (��ȣ���� ����� true���� �տ� �� ���� ������ '!'�� �� �����Ƿ� ����� false)
		System.out.println('C' - c);                      //2      ('C' - 'A', 'A' = 65, 'C' = 67)
		System.out.println('5' - '0');                    //5      ('5' = 53, '0' = 48)
		System.out.println(c + 1);                        //66
		System.out.println(++c);                          //B     (���� ������ ++�� �տ� �پ� �����Ƿ� ������Ű�� ����)
		System.out.println(c++);                          //B     (���� ������ ++�� �ڿ� �پ� �����Ƿ� �����ϰ� ������Ŵ)
		System.out.println(c);                            //C
		
	}

}
