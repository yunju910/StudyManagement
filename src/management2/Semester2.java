package management2;

import java.util.Scanner;

public class Semester2 extends TodayStudy1 implements Studyinput2 {
	public Semester2 (StudyKind kind2) {
		super(kind2);
	}
	public void getUserInput(Scanner input) {
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("총 공부한 시간을 입력하기를 원하시나요? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("총 공부한 시간을 입력하세요.");
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
		
		System.out.println("공부한 과목을 입력하세요.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
		
		System.out.println("공부한 시간을 입력하세요.");
		int TodayStudyTime = input.nextInt();
		this.setTodayStudyTime(TodayStudyTime);
		
		
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
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal2 + "\n과목: " + Subject2 + "\n공부한시간: " + TodayStudyTime);
	}

	
}
