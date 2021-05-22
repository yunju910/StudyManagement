package management2;

import java.io.Serializable;
import java.util.Scanner;

import exception.TimeFormatException;

public abstract class TodayStudy implements Studyinput2, Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5188958932276205290L;
	protected StudyKind kind = StudyKind.방학; 
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
		if(!TodayStudyTime.contains("시간")) {
			throw new TimeFormatException();
		}
		this.TodayStudyTime = TodayStudyTime;
	}

	public abstract void printInfo();

	
	public void setTodaySubject(Scanner input) {
		System.out.println("공부한 과목을 입력하세요.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
	}	
	
	public void setTodayStudy(Scanner input) {
		String TodayStudyTime = "";
		while(!TodayStudyTime.contains("시간")) {
			System.out.println("공부한 시간을 입력하세요.");
			TodayStudyTime = input.next();
			try {
				this.setTodayStudyTime(TodayStudyTime);
			} catch (TimeFormatException e) {
				System.out.println("잘못된 시간을 입력했습니다. XX시간이라고 입력해주세요."); 
			}
		}
	}
	
	public void setTodaySubject(Scanner input, String Subject) {
		if (this.getSubject2().equals(Subject)  ) {
			System.out.println("변경할 과목명을 입력하세요.");
			String subject2 = input.next();
			this.setSubject2(subject2);
		}
	}
	
	public void setTodayStudy(Scanner input, String Subject) {
		if (this.getSubject2().equals(Subject)  ) {
			while(!TodayStudyTime.contains("시간")) {
				System.out.println("변경할 시간을 입력하세요.");
				String todaystudy = input.next();
				try {
					this.setTodayStudyTime(todaystudy);
				} catch (TimeFormatException e) {
					System.out.println("잘못된 시간을 입력했습니다. XX시간이라고 입력해주세요."); 
				}	
			}
		}
	}
	
	public String getkindString() {
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
		return skind;
	}
	
}
