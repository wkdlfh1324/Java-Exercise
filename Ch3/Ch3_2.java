package Ch3;

// 자바의 정석 3장 2번째 문제
// 22 / 06 / 04
public class Ch3_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);                  //6      (00000011 -> 00000110)
		System.out.println(y >= 5 || x < 0 && x > 2);     //true   (true OR false && false)
		System.out.println(y += 10 - x++);                //13     (y = y + 10 - 2, x는 증감연산자로 인해 3)
		System.out.println(x += 2);                       //5      (x = x + 2)
		System.out.println(!('A' <= c && c <= 'Z'));      //false  (괄호안의 결과는 true지만 앞에 논리 부정 연산자 '!'이 들어가 있으므로 결과는 false)
		System.out.println('C' - c);                      //2      ('C' - 'A', 'A' = 65, 'C' = 67)
		System.out.println('5' - '0');                    //5      ('5' = 53, '0' = 48)
		System.out.println(c + 1);                        //66
		System.out.println(++c);                          //B     (증감 연산자 ++가 앞에 붙어 있으므로 증가시키고 대입)
		System.out.println(c++);                          //B     (증갑 연산자 ++가 뒤에 붙어 있으므로 대입하고 증가시킴)
		System.out.println(c);                            //C
		
	}

}
