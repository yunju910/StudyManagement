package mangament;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import management2.Holiday;
import management2.Holiday2;
import management2.Semester;
import management2.Semester2;
import management2.StudyKind;
import management2.Studyinput;
import management2.Studyinput2;

public class StudyManager {
	ArrayList<Studyinput> Target = new ArrayList<Studyinput>();
	ArrayList<Studyinput2> Today = new ArrayList<Studyinput2>();
	Scanner input;
	StudyManager(Scanner input){
		this.input = input;
	}
	public int kind;
	public void TargetStudy() {
		Studyinput studyinput;
		while (kind	!= 1 || kind != 2) {
			try {
				System.out.println("���͵� ������ �������ּ���.");
				System.out.println("1. �б���");
				System.out.println("2. ����");
				kind = input.nextInt();
				if(kind == 1) {
					studyinput = new Semester(StudyKind.�б���);
					studyinput.getUserInput(input);
					Target.add(studyinput);
					break;
				}
				else if(kind == 2) {
					studyinput = new Holiday(StudyKind.����);
					studyinput.getUserInput(input);
					Target.add(studyinput);
					break;
				}
				else {
					System.out.print("1���� 2�� �߿��� �����ϼ���.");
				}
				
			}
			catch(InputMismatchException e){
				System.out.println("������ 1�� 2�߿� �ϳ��� �Է����ּ���!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1; 
			}
		}	
	}
	
	public void TodayStudy(){
		Studyinput2 studyinput2;
		if(kind == 1) {
			studyinput2 = new Semester2(StudyKind.�б���);
			studyinput2.getUserInput(input);
			Today.add(studyinput2);
		}
		else if(kind == 2) {
			studyinput2 = new Holiday2(StudyKind.����);
			studyinput2.getUserInput(input);
			Today.add(studyinput2);
		}
	}	
	public void EditStudy(){
		int num = -1;
		while (num != 5) {
			showEditMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				String TargetSubject1 = TargetInputSubject();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput study = Target.get(i); 
					study.setTargetSubject(input, TargetSubject1);
				}
				break;
			case 2:
				String TodaySubject1 = TodayInputSubject();
				for(int i = 0; i< Today.size(); i++) {
					Studyinput2 study = Today.get(i);
					study.setTodaySubject(input, TodaySubject1);
				}
				break;
			case 3:
				String TargetSubject2 = TargetInputSubject();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput study = Target.get(i);
					study.setTargetStudy(input, TargetSubject2);
				}
				break;
			case 4:
				String TodaySubject2 = TodayInputSubject();
				for(int i = 0; i< Today.size(); i++) {
					Studyinput2 study = Today.get(i);
					study.setTodayStudy(input, TodaySubject2);
				}
				break;	
			default: 
				continue;
			}
		}
	}
	
	public void ViewStudy() {
		System.out.println("�Է��� ��ǥ ���� ��: " + Target.size());
		System.out.println("���� ������ ���� ��: " + Today.size());
		System.out.println("��ǥ ����");
		for (int i = 0; i < Target.size(); i++) {
			Target.get(i).printInfo();
		}
		System.out.println("���� ����");
		for (int i = 0; i < Today.size(); i++) {
			Today.get(i).printInfo();
		}
	}
	
	public void setTargetSubject(Studyinput target, Scanner input, String Subject) {
		if (target.getSubject1().equals(Subject)  ) {
			System.out.println("������ ������� �Է��ϼ���.");
			String subject1 = input.next();
			target.setSubject1(subject1);						
		}
	}
	
	public void setTodaySubject(Studyinput2 today, Scanner input, String Subject) {
		if (today.getSubject2().equals(Subject)  ) {
			System.out.println("������ ������� �Է��ϼ���.");
			String subject2 = input.next();
			today.setSubject2(subject2);
		}
	}
	
	public void setTargetStudy(Studyinput targettime, Scanner input, String Subject) {
		if (targettime.getSubject1().equals(Subject)  ) {
			System.out.println("������ �ð��� �Է��ϼ���.");
			String targetstudy = input.next();
			targettime.setTargetStudyTime(targetstudy);	
		}
	}
	
	public void setTodayStudy(Studyinput2 todaytime, Scanner input, String Subject) {
		if (todaytime.getSubject2().equals(Subject)  ) {
			System.out.println("������ �ð��� �Է��ϼ���.");
			String todaystudy = input.next();
			todaytime.setTodayStudyTime(todaystudy);	
		}
	}
	
	public String TargetInputSubject() {
		System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
		String Subject = input.next();
		return Subject;
	}
	
	public String TodayInputSubject() {
		System.out.print("�����ϰ� ���� (����)������� �Է��ϼ���.");
		String Subject = input.next();
		return Subject; 
	}
	
	public void showEditMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. ��ǥ ���η� ���� ���� ");
		System.out.println("2. ���� ���η� ���� ����");
		System.out.println("3. ��ǥ ���η� �ð� ����");
		System.out.println("4. ���� ���η� �ð� ����");
		System.out.println("5. ����");
	}
}
