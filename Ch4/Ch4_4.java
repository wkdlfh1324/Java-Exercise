package Ch4;

//자바의 정석 4장 4번째 문제
//22 / 06 / 05

/*1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.*/

public class Ch4_4 {
	public static void main(String[] args) {	
		
		int sum = 0; // 총합
		int s = 1;
		int num = 0;
		
//      While 문 사용
		
//		int i = 1; // 반복
//		while(sum <= 100) { // 총합이 100 이상 될때까지 반복
//			int j = i; 
//			if (i % 2 == 0) { // 2의 배수라면 음수로 변경
//				i *= -1;
//			}
//			sum += i;
//			System.out.printf("%d%n", i);
//			i = j;
//			i++;
//		}
//		System.out.println(sum);
		
		for (int i = 1; true; i++, s = -s) {
			num = s * i;
			sum += num;
			
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}
