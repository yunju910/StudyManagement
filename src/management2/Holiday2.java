package management2;

import java.util.Scanner;

public class Holiday2 extends TodayStudy  {
	
	public Holiday2(StudyKind kind2) {
		super(kind2);
	}
	
	public void getUserInput(Scanner input) {
		setTodaySubject(input);
		setTodayStudy(input);
	}
	
	public void printInfo() {	
		String skind = getkindString();
		System.out.println( "����: "+ skind + "\n����: " + Subject2 + "\n�����ѽð�: " + TodayStudyTime);
	}

}
