package management2;

import java.util.Scanner;

public abstract class TargetStudy implements Studyinput { // ��ǥ ���� 
	protected StudyKind kind = StudyKind.����;
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

	public void setTargetStudyTime(String targetStudyTime) {
		this.TargetStudyTime = targetStudyTime;
	}

	public abstract void printInfo();
	
	public void setTargetSubject(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
	}	
	
	public void setTargetStudy(Scanner input) {
		System.out.println("������ �ð��� �Է��ϼ���.");
		String TargetStudyTime = input.next();
		this.setTargetStudyTime(TargetStudyTime);
	}
	
	public void setTargetSubject(Scanner input, String Subject) {
		if (this.getSubject1().equals(Subject)  ) {
			System.out.println("������ ������� �Է��ϼ���.");
			String subject1 = input.next();
			this.setSubject1(subject1);						
		}
	}
	
	public void setTargetStudy(Scanner input, String Subject) {
		if (this.getSubject1().equals(Subject)  ) {
			System.out.println("������ �ð��� �Է��ϼ���.");
			String targetstudy = input.next();
			this.setTargetStudyTime(targetstudy);	
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
