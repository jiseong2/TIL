/*24. ArrayList�� Ȱ���� ������ ���� ���� ���α׷�
���� �ó�����

1001�й� Lee�� 1002�й� Kim, �� �л��� �ֽ��ϴ�. 
Lee �л��� ����� ���� 2������ �����߰�, Kim �л��� ����, ����, ���� 3 ������ �����Ͽ����ϴ�.
Lee �л��� ���� 100��, ���� 50���Դϴ�. 
Kim �л��� ���� 70��, ���� 85��, ���� 100���Դϴ�. 
Student�� Subject Ŭ������ ����� ArrayList�� Ȱ���Ͽ� �� �л��� ���� ������ ������ ����ϼ���*/

package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	// ������� �����ϸ� List �� ����. �޼��� ����.
	
	public void addSubject(String name, int point) {
		
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
		
	}
	

	public void showScoreInfo() {
		
		int total = 0;  // total ���� ����
		
		for(Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(studentName + "�л��� " + subject.getName() + " ������ ������ " + subject.getScorePoint() + "�Դϴ�.");
		}
		
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�." );
	}
}