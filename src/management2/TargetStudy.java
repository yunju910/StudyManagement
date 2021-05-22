package management2;

import java.io.Serializable;
import java.util.Scanner;

import exception.TimeFormatException;

public abstract class TargetStudy implements Studyinput, Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 2895035033030369326L;
	protected StudyKind kind = StudyKind.방학;
	protected String Subject1;
	protected String TargetStudyTime; 
	
	public TargetStudy(StudyKind kind) {
	}
	
	public TargetStudy(String Subject1, String TargetStudyTime) {
		this.Subject1 = Subject1;
		this.TargetStudyTime = TargetStudyTime;
	}
	
	public String getSubject1() {
		return Subject1;
	}

	public void setSubject1(String subject1) {
		this.Subject1 = subject1;	
	}

	public String getTargetStudyTime() {
		return TargetStudyTime;
	}

	public void setTargetStudyTime(String TargetStudyTime) throws TimeFormatException{
		if(!TargetStudyTime.contains("시간")) {
			throw new TimeFormatException();
		}
		this.TargetStudyTime = TargetStudyTime;
	}

	public abstract void printInfo();
	
	public void setTargetSubject(Scanner input) {
		System.out.println("공부할 과목을 입력하세요.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
	}	
	
	public void setTargetStudy(Scanner input) {
		String TargetStudyTime = "";
		while (!TargetStudyTime.contains("시간")){
			System.out.println("공부할 시간을 입력하세요.");
			TargetStudyTime = input.next();
			try {
				this.setTargetStudyTime(TargetStudyTime);
			} catch (TimeFormatException e) {
				System.out.println("잘못된 시간을 입력했습니다. XX시간이라고 입력해주세요."); 
			}
		}
		
	}
	
	public void setTargetSubject(Scanner input, String Subject) {
		if (this.getSubject1().equals(Subject)  ) {
			System.out.println("변경할 과목명을 입력하세요.");
			String subject1 = input.next();
			this.setSubject1(subject1);						
		}
	}
	
	public void setTargetStudy(Scanner input, String Subject) {
		String Targetstudy = "";
		if (this.getSubject1().equals(Subject)) {
			while(!TargetStudyTime.contains("시간")) {
				System.out.println("변경할 시간을 입력하세요.");
				Targetstudy = input.next();
				try {
					this.setTargetStudyTime(Targetstudy);
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
