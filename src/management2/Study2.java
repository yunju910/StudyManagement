package management2;

import java.util.Scanner;

public class Study2 {
	protected String Subject2;
	protected int TodayStudyTime; 
	
	public Study2() {
	}
	
	public Study2(String Subject2, int TodayStudyTime) {
		this.Subject2 = Subject2;
		this.TodayStudyTime = TodayStudyTime;
	}
	
	public String getSubject2() {
		return Subject2;
	}

	public void setSubject2(String subject2) {
		Subject2 = subject2;
	}

	public int getTodayStudyTime() {
		return TodayStudyTime;
	}

	public void setTodayStudyTime(int todayStudyTime) {
		TodayStudyTime = todayStudyTime;
	}
	
	public void printInfo() {
		System.out.println("����: " + Subject2 + "\n�����ѽð�: " + TodayStudyTime);
	}
	public void getUserInput(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
		
		System.out.println("������ �ð��� �Է��ϼ���.");
		int TodayStudyTime = input.nextInt();
		this.setTodayStudyTime(TodayStudyTime);
	}

}
