package management2;

import java.util.Scanner;

public class Semester extends Study implements Studyinput {
	public Semester(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.println("�� �����ѽð��� �Է��ϼ���.");
		int Goal = input.nextInt();
		this.setGoal(Goal);
		
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
		
		System.out.println("������ �ð��� �Է��ϼ���.");
		int TargetStudyTime = input.nextInt();
		this.setTargetStudyTime(TargetStudyTime);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case �б���:
			skind = "�б���";
			break; 
		case ����: 
			skind = "����";
			break; 
		default:
		}
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal + "\n����: " + Subject1 + "\n�����ѽð�: " + TargetStudyTime);
	}

}
