package management2;

import java.util.Scanner;

public class Holiday extends TargetStudy2 implements Studyinput {
	
	public Holiday(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
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
		System.out.println( "����: "+ skind + "\n����: " + Subject1 + "\n������ �ð�: " + TargetStudyTime);
	}
}
