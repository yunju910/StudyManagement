package management2;

import java.util.Scanner;

public abstract class SemesterStudy1 extends TargetStudy {
	public static int Goal;

	public int getGoal() {
		return Goal;
	}
	public void setGoal(int Goal) {
		SemesterStudy1.Goal= Goal;
	}
	
	public SemesterStudy1(StudyKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
	
	public void setStudyGoalwithYN(Scanner input){
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
				SemesterStudy1.Goal = 0; 
				break;
			}
			else {
			}
		}
	}
	
	
	@Override
	public void printInfo() {
		String skind = getkindString();
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal + "\n과목: " + Subject1 + "\n공부할 시간: " + TargetStudyTime);
	}

}
