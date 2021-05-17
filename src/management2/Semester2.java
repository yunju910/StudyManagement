package management2;

import java.util.Scanner;

public class Semester2 extends SemesterStudy2 {
	public Semester2 (StudyKind kind2) {
		super(kind2);
	}
	

	public void getUserInput(Scanner input) {	
		setTodaySubject(input);
		setTodayStudy(input);
		setStudyGoalwithYN(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal2 + "\n과목: " + Subject2 + "\n공부한시간: " + TodayStudyTime);
	}

	
}
