package Ch4;

//자바의 정석 4장 5번째 문제
//22 / 06 / 05

/*다음의 for문을 while문으로 변경하시오.

public class Ch4_5 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}*/

public class Ch4_5 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) { // 10번 반복
			int j = 0;
			while (j <= i) { // i의 크기만큼 * 찍기
				System.out.print("*");
				j++;
			}
			System.out.println(); // 줄바꿈
			i++;
		}
	}
}
