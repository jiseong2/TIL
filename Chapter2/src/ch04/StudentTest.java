package ch04;

// Ŭ���� ����
public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		        //��������      //������
		
		//�ν��Ͻ� ����
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		             // �޼���      // �Ű�����
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim); // �� �޸��� �����ּҰ� ���.
		System.out.println(studentKim);

	}

}