package Personal;

import java.util.Scanner;

// ���������� ����
// Date : 22 / 06 / 06
// ���� ������ �ݺ��Ǵ°� ���� ���� ����

public class RockScissorsPaper_Game {
	public static void main(String[] args) {
		String[] rsp = { "����", "����", "��" };

		Scanner sc = new Scanner(System.in);

		while (true) { // ����� ���ö����� �ݺ�
			System.out.printf("1. ����%n2. ����%n3. ��%n");
			String opponentPick = rsp[(int) (Math.random() * 3)]; // ���
			String myPick = rsp[sc.nextInt() - 1]; // ��
			
			if (myPick.equals(opponentPick)) { // �ΰ��� ���ڿ��� �����Ҷ� ���º�
				System.out.println("�����ϴ�. �ٽ� �������ּ���.");
				continue;
			} // ���� -> ���¸� �����й�, ���� -> �����¸� ���й�, �� -> �����¸� �����й�
			switch (myPick) { // case�� ���� �ݺ��̶� ���� ����
			case "����":
				if (opponentPick.equals("��")) {
					System.out.println("�¸��Ͽ����ϴ�.");
					break;
				}
				System.out.println("�й��Ͽ����ϴ�.");
				break;
			case "����":
				if (opponentPick.equals("����")) {
					System.out.println("�¸��Ͽ����ϴ�.");
					break;
				}
				System.out.println("�й��Ͽ����ϴ�.");
				break;
			case "��":
				if (opponentPick.equals("����")) {
					System.out.println("�¸��Ͽ����ϴ�.");
					break;
				}
				System.out.println("�й��Ͽ����ϴ�.");
				break; 
			}
			break; // while���� ��������
		}
	}

}
