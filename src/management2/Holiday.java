package management2;

import java.util.Scanner;

public class Holiday extends TargetStudy{
	
	public Holiday(StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setTargetSubject(input);
		setTargetStudy(input);
	}

	public void printInfo() {
		String skind = getkindString();
		System.out.println( "종류: "+ skind + "\n과목: " + Subject1 + "\n공부할 시간: " + TargetStudyTime);
	}
}
