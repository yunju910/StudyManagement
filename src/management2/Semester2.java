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
		System.out.println( "����: "+ skind + "\n�� ���� ��ǥ: " + Goal2 + "\n����: " + Subject2 + "\n�����ѽð�: " + TodayStudyTime);
	}

	
}
