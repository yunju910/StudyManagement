package management2;

import java.util.Scanner;

public class Semester extends TargetStudy1 implements Studyinput {
	public Semester(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("총 공부할 시간을 입력하기를 원하시나요? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("총 공부할시간을 입력하세요.");
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
		
		
		System.out.println("공부할 과목을 입력하세요.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
		
		System.out.println("공부할 시간을 입력하세요.");
		int TargetStudyTime = input.nextInt();
		this.setTargetStudyTime(TargetStudyTime);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case 학기중:
			skind = "학기중";
			break; 
		case 방학: 
			skind = "방학";
			break; 
		default:
		}
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal + "\n과목: " + Subject1 + "\n공부할 시간: " + TargetStudyTime);
	}

}
