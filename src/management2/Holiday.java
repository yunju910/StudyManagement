package management2;

import java.util.Scanner;

public class Holiday extends TargetStudy2 implements Studyinput {
	
	public Holiday(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
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
		System.out.println( "종류: "+ skind + "\n과목: " + Subject1 + "\n공부할 시간: " + TargetStudyTime);
	}
}
