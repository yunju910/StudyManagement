package mangament;

import java.util.ArrayList;
import java.util.Scanner;

import management2.Holiday;
import management2.Holiday2;
import management2.Study;
import management2.Study2;

public class StudyManager {
	ArrayList<Study> Target = new ArrayList<Study>();
	ArrayList<Study2> Today = new ArrayList<Study2>();
	Scanner input;
	StudyManager(Scanner input){
		this.input = input;
	}
	public int kind;
	public void TargetStudy() {
		Study study;
		while (kind	!= 1 && kind != 2) {
			System.out.println("���͵� ������ �������ּ���.");
			System.out.println("1. �б���");
			System.out.println("2. ����");
			kind = input.nextInt();
			if(kind == 1) {
				study = new Study();
				study.getUserInput(input);
				Target.add(study);
				break;
			}
			else if(kind == 2) {
				study = new Holiday();
				study.getUserInput(input);
				Target.add(study);
				break;
			}
			else {
				System.out.print("1���� 2�� �߿��� �����ϼ���.");
			}
		
		}
	}
	public void TodayStudy(){
		Study2 study2;
		if(kind == 1) {
			study2 = new Study2();
			study2.getUserInput(input);
			Today.add(study2);
		}
		else if(kind == 2) {
			study2 = new Holiday2();
			study2.getUserInput(input);
			Today.add(study2);
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
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Study study = Target.get(i);
					if (study.getSubject1().equals(Subject1)  ) {
						System.out.println("������ ������� �Է��ϼ���.");
						String subject1 = input.next();
						study.setSubject1(subject1);						
					}
				}
			}
			else if(num == 2) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject2 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Study2 study2 = Today.get(i);
					if (study2.getSubject2().equals(Subject2)  ) {
						System.out.println("������ ������� �Է��ϼ���.");
						String subject2 = input.next();
						study2.setSubject2(subject2);
					}
				}
			}
			else if(num == 3) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Study study = Target.get(i);
					if (study.getSubject1().equals(Subject1)  ) {
						System.out.println("������ �ð��� �Է��ϼ���.");
						int targetstudy = input.nextInt();
						study.setTargetStudyTime(targetstudy);	
					}
				}
			}
			else if(num == 4) {
				System.out.print("�����ϰ� ���� (��ǥ)������� �Է��ϼ���.");
				String Subject2 = input.next();
				for(int i = 0; i< Today.size(); i++) {
					Study2 study2 = Today.get(i);
					if (study2.getSubject2().equals(Subject2)  ) {
						System.out.println("������ �ð��� �Է��ϼ���.");
						int todaystudy = input.nextInt();
						study2.setTodayStudyTime(todaystudy);	
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
