package management2;

import java.util.Scanner;

public class Study {
	protected String Subject1;
	protected int TargetStudyTime; 
	
	public Study() {
	}
	
	public Study(String Subject1, int TargetStudyTime) {
		this.Subject1 = Subject1;
		this.TargetStudyTime = TargetStudyTime;
	}
	
	public String getSubject1() {
		return Subject1;
	}

	public void setSubject1(String subject1) {
		Subject1 = subject1;
	}

	public int getTargetStudyTime() {
		return TargetStudyTime;
	}

	public void setTargetStudyTime(int targetStudyTime) {
		TargetStudyTime = targetStudyTime;
	}
	
	public void printInfo() {
		System.out.println("과목: " + Subject1 + "\n공부한시간: " + TargetStudyTime);
	}
	public void getUserInput(Scanner input) {
		System.out.println("공부할 과목을 입력하세요.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
		
		System.out.println("공부할 시간을 입력하세요.");
		int TargetStudyTime = input.nextInt();
		this.setTargetStudyTime(TargetStudyTime);
	}

}
