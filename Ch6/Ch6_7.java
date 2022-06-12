package Ch6;

// 자바의 정석 6장 7번 문제
// Date : 22 / 06 /12

// 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
// (단, 모든 병사의 공격력과 방어력은 같아야한다.)

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
// 모든 병사의 공격력과 방어력은 같아야 하므로 weapon과 armor변수는 static을 붙인다(cv).
// weapon과 armor가 클래스 변수이므로 클래스 변수(cv)를 사용하는 weaponUp(), armorUp() 메서드는 static이 붙어야한다.
