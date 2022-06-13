package Personal;

import java.util.Scanner;

// 가위바위보 게임
// Date : 22 / 06 / 06
// 같은 내용이 반복되는게 많아 수정 예정

public class RockScissorsPaper_Game {
	public static void main(String[] args) {
		String[] rsp = { "가위", "바위", "보" };

		Scanner sc = new Scanner(System.in);

		while (true) { // 결과가 나올때까지 반복
			System.out.printf("1. 가위%n2. 바위%n3. 보%n");
			String opponentPick = rsp[(int) (Math.random() * 3)]; // 상대
			String myPick = rsp[sc.nextInt() - 1]; // 나
			
			if (myPick.equals(opponentPick)) { // 두개의 문자열이 동일할때 무승부
				System.out.println("비겼습니다. 다시 선택해주세요.");
				continue;
			} // 가위 -> 보승리 바위패배, 바위 -> 가위승리 보패배, 보 -> 바위승리 가위패배
			switch (myPick) { // case문 안이 반복이라 수정 예정
			case "가위":
				if (opponentPick.equals("보")) {
					System.out.println("승리하였습니다.");
					break;
				}
				System.out.println("패배하였습니다.");
				break;
			case "바위":
				if (opponentPick.equals("가위")) {
					System.out.println("승리하였습니다.");
					break;
				}
				System.out.println("패배하였습니다.");
				break;
			case "보":
				if (opponentPick.equals("바위")) {
					System.out.println("승리하였습니다.");
					break;
				}
				System.out.println("패배하였습니다.");
				break; 
			}
			break; // while문을 빠져나옴
		}
	}

}
