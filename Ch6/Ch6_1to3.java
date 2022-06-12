package Ch6;

// �ڹ��� ���� 6�� 1, 2, 3�� ����
// Date : 22 / 06 /12

// 6-1. ������ ���� ��� ������ ���� Student Ŭ������ �����Ͻÿ�.
// Ÿ��          ������           ����
//String    name     �л��̸�
// int      ban        ��
// int      no        ��ȣ
// int      kor      ��������
// int      eng      ��������
// int      math     ��������

// 6-2. ������ ���� �������� �򵵷� Student Ŭ������ �����ڿ� info()�� �߰��Ͻÿ�.
// ��� : ȫ�浿,1,1,100,60,76,236,78.7

// 6-3. �������� 6-1���� ������ Student Ŭ������ ������ ���� ���ǵ� �� ���� �޼��� getTotal()�� getAverage()�� �߰��Ͻÿ�.
/*�޼����: getTotal
   ���: ����(kor), ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
   ��ȯŸ�� : int
   �Ű����� : ����*/

/*�޼����: getAverage
   ���: ����(��������+��������+��������)�� ������� ���� ����� ���Ѵ�. �Ҽ��� ��°�ڸ����� �ݿø��� ��.
   ��ȯŸ�� : float
   �Ű����� : ����*/

class Student {
	String name; // �л��̸�
	int ban;     // ��
	int no;      // ��ȣ
	int kor;     // ��������
	int eng;     // ��������
	int math;    // ��������
	
	Student(){}; // �⺻ ������
	Student(String name, int ban, int no, int kor, int eng, int math){ // ������
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// s ���������� String Ÿ���� �����Ƿ� String ������ return ���ִ� info �޼��� ����
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
	
	// ������ intŸ�� ������ ��ȯ�ϴ� getTotal �޼���
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	// ������ ������� ���� ���
	float getAverage() {
		float avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10f  ; // �Ҽ��� ��°�ڸ����� �ݿø�
		return avg;
	}
	// getTotal�� getAverage �޼��尡 �߰� �����Ƿ�, �ڵ��� �ߺ��� ���̱� ���� info�޼��忡 ���
}

public class Ch6_1to3 {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
     	String str = s.info();
		System.out.println(str);
		
		System.out.println("�̸�:" + s.name);
		System.out.println("����:" + s.getTotal());
		System.out.println("���:" + s.getAverage());
	}
}

