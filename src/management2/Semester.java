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
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal + "\n����: " + Subject1 + "\n������ �ð�: " + TargetStudyTime);
	}

}
