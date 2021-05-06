package management2;

import java.util.Scanner;

public class Holiday2 extends TodayStudy2 implements Studyinput2 {
	
	public Holiday2(StudyKind kind2) {
		super(kind2);
	}
	
	public void getUserInput(Scanner input) {
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
		System.out.println( "종류: "+ skind + "\n과목: " + Subject2 + "\n공부한시간: " + TodayStudyTime);
	}

}
