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
			System.out.println("�� ������ �ð��� �Է��ϱ⸦ ���Ͻó���? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("�� �����ҽð��� �Է��ϼ���.");
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
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal + "\n����: " + Subject1 + "\n������ �ð�: " + TargetStudyTime);
	}

}
