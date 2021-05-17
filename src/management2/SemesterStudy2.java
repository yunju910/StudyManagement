package management2;

import java.util.Scanner;

public abstract class SemesterStudy2 extends TodayStudy {
	public static int Goal2;

	public int getGoal() {
		return Goal2;
	}
	public void setGoal(int Goal) {
		SemesterStudy2.Goal2= Goal;
	}
	
	public SemesterStudy2(StudyKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
	
	public void setStudyGoalwithYN(Scanner input) {
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
				SemesterStudy2.Goal2 = 0; 
				break;
			}
			else {
			}
		}
	}
	
	@Override
	public void printInfo() {
		String skind = getkindString();
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal2 + "\n과목: " + Subject2 + "\n공부한시간: " + TodayStudyTime);
	}

}
