package Ch6;

// 자바의 정석 6장 1, 2, 3번 문제
// Date : 22 / 06 /12

// 6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하시오.
// 타입          변수명           설명
//String    name     학생이름
// int      ban        반
// int      no        번호
// int      kor      국어점수
// int      eng      영어점수
// int      math     수학점수

// 6-2. 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
// 결과 : 홍길동,1,1,100,60,76,236,78.7

// 6-3. 연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
/*메서드명: getTotal
   기능: 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
   반환타입 : int
   매개변수 : 없음*/

/*메서드명: getAverage
   기능: 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다. 소수점 둘째자리에서 반올림할 것.
   반환타입 : float
   매개변수 : 없음*/

class Student {
	String name; // 학생이름
	int ban;     // 반
	int no;      // 번호
	int kor;     // 국어점수
	int eng;     // 영어점수
	int math;    // 수학점수
	
	Student(){}; // 기본 생성자
	Student(String name, int ban, int no, int kor, int eng, int math){ // 생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// s 참조변수가 String 타입을 받으므로 String 변수를 return 해주는 info 메서드 생성
	String info() {
		return name + "," 
				+ ban + ","
				+ no + ","
				+ kor + ","
				+ eng + ","
				+ math + ","
				+ getTotal() + ","
				+ getAverage();
	}
	
	// 총점을 int타입 변수로 반환하는 getTotal 메서드
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	// 총점을 과목수로 나눈 평균
	float getAverage() {
		float avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10f  ; // 소수점 둘째자리에서 반올림
		return avg;
	}
	// getTotal과 getAverage 메서드가 추가 됐으므로, 코드의 중복을 줄이기 위해 info메서드에 사용
}

public class Ch6_1to3 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
     	String str = s.info();
		System.out.println(str);
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}

