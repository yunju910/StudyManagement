package management2;

import java.util.Scanner;

public abstract class TodayStudy implements Studyinput2{ // ���� ����
	protected int Goal2; 
	protected StudyKind kind = StudyKind.����; 
	protected String Subject2;
	protected String TodayStudyTime; 
	
	public TodayStudy(StudyKind kind2) {
	}
	
	public TodayStudy(String Subject2, String TodayStudyTime) { 
		this.Subject2 = Subject2;
		this.TodayStudyTime = TodayStudyTime;
	}
	public String getSubject2() {
		return Subject2;
	}

	public void setSubject2(String subject2) {
		Subject2 = subject2;
	}

	public String getTodayStudyTime() {
		return TodayStudyTime;
	}

	public void setTodayStudyTime(String todayStudyTime) {
		TodayStudyTime = todayStudyTime;
	}

	public abstract void printInfo();

	
	public void setTodaySubject(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
	}	
	
	public void setTodayStudy(Scanner input) {
		System.out.println("������ �ð��� �Է��ϼ���.");
		String TodayStudyTime = input.next();
		this.setTodayStudyTime(TodayStudyTime);
	}
	
	public void setTodaySubject(Scanner input, String Subject) {
		if (this.getSubject2().equals(Subject)  ) {
			System.out.println("������ ������� �Է��ϼ���.");
			String subject2 = input.next();
			this.setSubject2(subject2);
		}
	}
	
	public void setTodayStudy(Scanner input, String Subject) {
		if (this.getSubject2().equals(Subject)  ) {
			System.out.println("������ �ð��� �Է��ϼ���.");
			String todaystudy = input.next();
			this.setTodayStudyTime(todaystudy);	
		}
	}
	
	public String getkindString() {
		String skind = "none";
		switch(this.kind) {
		case �б���:
			skind = "�б���";
			break; 
		case ����: 
			skind = "����";
			break; 
		default:
		}
		return skind;
	}
	
}
