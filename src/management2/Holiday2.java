package management2;

import java.util.Scanner;

public class Holiday2 extends TodayStudy2 implements Studyinput2 {
	
	public Holiday2(StudyKind kind2) {
		super(kind2);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
		
		System.out.println("������ �ð��� �Է��ϼ���.");
		int TodayStudyTime = input.nextInt();
		this.setTodayStudyTime(TodayStudyTime);
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
		System.out.println( "����: "+ skind + "\n����: " + Subject2 + "\n�����ѽð�: " + TodayStudyTime);
	}

}
