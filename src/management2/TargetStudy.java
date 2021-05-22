package management2;

import java.io.Serializable;
import java.util.Scanner;

import exception.TimeFormatException;

public abstract class TargetStudy implements Studyinput, Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 2895035033030369326L;
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

	public void setTargetStudyTime(String TargetStudyTime) throws TimeFormatException{
		if(!TargetStudyTime.contains("�ð�")) {
			throw new TimeFormatException();
		}
		this.TargetStudyTime = TargetStudyTime;
	}

	public abstract void printInfo();
	
	public void setTargetSubject(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
	}	
	
	public void setTargetStudy(Scanner input) {
		String TargetStudyTime = "";
		while (!TargetStudyTime.contains("�ð�")){
			System.out.println("������ �ð��� �Է��ϼ���.");
			TargetStudyTime = input.next();
			try {
				this.setTargetStudyTime(TargetStudyTime);
			} catch (TimeFormatException e) {
				System.out.println("�߸��� �ð��� �Է��߽��ϴ�. XX�ð��̶�� �Է����ּ���."); 
			}
		}
		
	}
	
	public void setTargetSubject(Scanner input, String Subject) {
		if (this.getSubject1().equals(Subject)  ) {
			System.out.println("������ ������� �Է��ϼ���.");
			String subject1 = input.next();
			this.setSubject1(subject1);						
		}
	}
	
	public void setTargetStudy(Scanner input, String Subject) {
		String Targetstudy = "";
		if (this.getSubject1().equals(Subject)) {
			while(!TargetStudyTime.contains("�ð�")) {
				System.out.println("������ �ð��� �Է��ϼ���.");
				Targetstudy = input.next();
				try {
					this.setTargetStudyTime(Targetstudy);
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
