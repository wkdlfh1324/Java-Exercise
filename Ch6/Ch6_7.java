package Ch6;

// �ڹ��� ���� 6�� 7�� ����
// Date : 22 / 06 /12

// ������ ��ǻ�� ������ ����(marine)�� Ŭ������ ������ ���̴�. �� Ŭ������ ����߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�?
// (��, ��� ������ ���ݷ°� ������ ���ƾ��Ѵ�.)

class Marine {
	int x = 0, y = 0;
	int hp = 60;
	int weapon = 6;
	int armor = 0;
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ch6_7 {

}

// weapon, armor, weaponUp(), armorUp()
// ��� ������ ���ݷ°� ������ ���ƾ� �ϹǷ� weapon�� armor������ static�� ���δ�(cv).
// weapon�� armor�� Ŭ���� �����̹Ƿ� Ŭ���� ����(cv)�� ����ϴ� weaponUp(), armorUp() �޼���� static�� �پ���Ѵ�.
