package management2;

import java.util.Scanner;

public class Semester extends SemesterStudy1 {

	public Semester(StudyKind kind) {
		super(kind);
	}

	
	public void getUserInput(Scanner input) {
		setTargetSubject(input);
		setTargetStudy(input);
		setStudyGoalwithYN(input);
		
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println( "종류: "+ skind + "\n총 공부 목표: " + Goal + "\n과목: " + Subject1 + "\n공부할 시간: " + TargetStudyTime);
	}

}
