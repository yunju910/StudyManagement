package mangament;

import java.util.ArrayList;
import java.util.Scanner;

import management2.Holiday;
import management2.Holiday2;
import management2.Semester;
import management2.Semester2;
import management2.Study;
import management2.Study2;
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
		while (kind	!= 1 && kind != 2) {
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
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. ��ǥ ���η� ���� ���� ");
			System.out.println("2. ���� ���η� ���� ����");
			System.out.println("3. ��ǥ ���η� �ð� ����");
			System.out.println("4. ���� ���η� �ð� ����");
			System.out.println("5. ����");
			num = input.nextInt();

			if(num == 1) {
				System.out.print("�����ϰ� ���� (��zǥ)������� �Է��ϼ���.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput studyinput = Target.get(i);
					if (studyinput.getSubject1().equals(Subject1)  ) {
						System.out.println("������ ������� �Է��ϼ���.");
						String subject1 = input.next();
						studyinput.setSubject1(subject1);						
					}
				}
			}
			else if(num == 2) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject2 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput2 studyinput2 = Today.get(i);
					if (studyinput2.getSubject2().equals(Subject2)  ) {
						System.out.println("������ ������� �Է��ϼ���.");
						String subject2 = input.next();
						studyinput2.setSubject2(subject2);
					}
				}
			}
			else if(num == 3) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput studyinput = Target.get(i);
					if (studyinput.getSubject1().equals(Subject1)  ) {
						System.out.println("������ �ð��� �Է��ϼ���.");
						int targetstudy = input.nextInt();
						studyinput.setTargetStudyTime(targetstudy);	
					}
				}
			}
			else if(num == 4) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject2 = input.next();
				for(int i = 0; i< Today.size(); i++) {
					Studyinput2 studyinput2 = Today.get(i);
					if (studyinput2.getSubject2().equals(Subject2)  ) {
						System.out.println("������ �ð��� �Է��ϼ���.");
						int todaystudy = input.nextInt();
						studyinput2.setTodayStudyTime(todaystudy);	
					}
				}
			}
			else {
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
}
