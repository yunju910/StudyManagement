package management2;

import java.io.Serializable;
import java.util.Scanner;

import exception.TimeFormatException;

public abstract class TodayStudy implements Studyinput2, Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5188958932276205290L;
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

	public void setTodayStudyTime(String TodayStudyTime) throws TimeFormatException{
		if(!TodayStudyTime.contains("�ð�")) {
			throw new TimeFormatException();
		}
		this.TodayStudyTime = TodayStudyTime;
	}

	public abstract void printInfo();

	
	public void setTodaySubject(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
	}	
	
	public void setTodayStudy(Scanner input) {
		String TodayStudyTime = "";
		while(!TodayStudyTime.contains("�ð�")) {
			System.out.println("������ �ð��� �Է��ϼ���.");
			TodayStudyTime = input.next();
			try {
				this.setTodayStudyTime(TodayStudyTime);
			} catch (TimeFormatException e) {
				System.out.println("�߸��� �ð��� �Է��߽��ϴ�. XX�ð��̶�� �Է����ּ���."); 
			}
		}
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
			while(!TodayStudyTime.contains("�ð�")) {
				System.out.println("������ �ð��� �Է��ϼ���.");
				String todaystudy = input.next();
				try {
					this.setTodayStudyTime(todaystudy);
				} catch (TimeFormatException e) {
					System.out.println("�߸��� �ð��� �Է��߽��ϴ�. XX�ð��̶�� �Է����ּ���."); 
				}	
			}
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
