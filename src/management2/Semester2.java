package management2;

import java.util.Scanner;

public class Semester2 extends TodayStudy1 implements Studyinput2 {
	public Semester2 (StudyKind kind2) {
		super(kind2);
	}
	public void getUserInput(Scanner input) {
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("�� ������ �ð��� �Է��ϱ⸦ ���Ͻó���? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("�� ������ �ð��� �Է��ϼ���.");
				int Goal2 = input.nextInt();
				this.setGoal(Goal2);
			}
			else if(answer == 'n' || answer == 'N') {
				this.Goal2 = 0; 
				break;
			}
			else {
			}
		}
		
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
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal2 + "\n����: " + Subject2 + "\n�����ѽð�: " + TodayStudyTime);
	}

	
}
