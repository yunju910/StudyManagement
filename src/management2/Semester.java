package management2;

import java.util.Scanner;

public class Semester extends TargetStudy1 implements Studyinput {
	public Semester(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("�� ������ �ð��� �Է��ϱ⸦ ���Ͻó���? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("�� �����ҽð��� �Է��ϼ���.");
				int Goal = input.nextInt();
				this.setGoal(Goal);
			}
			else if(answer == 'n' || answer == 'N') {
				this.Goal = 0; 
				break;
			}
			else {
			}
		}
		
		
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
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal + "\n����: " + Subject1 + "\n������ �ð�: " + TargetStudyTime);
	}

}
