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
			System.out.println("스터디 종류를 선택해주세요.");
			System.out.println("1. 학기중");
			System.out.println("2. 방학");
			kind = input.nextInt();
			if(kind == 1) {
				studyinput = new Semester(StudyKind.학기중);
				studyinput.getUserInput(input);
				Target.add(studyinput);
				break;
			}
			else if(kind == 2) {
				studyinput = new Holiday(StudyKind.방학);
				studyinput.getUserInput(input);
				Target.add(studyinput);
				break;
			}
			else {
				System.out.print("1번과 2번 중에서 선택하세요.");
			}
		
		}
	}
	public void TodayStudy(){
		Studyinput2 studyinput2;
		if(kind == 1) {
			studyinput2 = new Semester2(StudyKind.학기중);
			studyinput2.getUserInput(input);
			Today.add(studyinput2);
		}
		else if(kind == 2) {
			studyinput2 = new Holiday2(StudyKind.방학);
			studyinput2.getUserInput(input);
			Today.add(studyinput2);
		}
	}	
	public void EditStudy(){
		int num = -1;
		while (num != 5) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. 목표 공부량 과목 수정 ");
			System.out.println("2. 오늘 공부량 과목 수정");
			System.out.println("3. 목표 공부량 시간 수정");
			System.out.println("4. 오늘 공부량 시간 수정");
			System.out.println("5. 종료");
			num = input.nextInt();

			if(num == 1) {
				System.out.print("변경하고 싶은 (목z표)과목명을 입력하세요.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput studyinput = Target.get(i);
					if (studyinput.getSubject1().equals(Subject1)  ) {
						System.out.println("변경할 과목명을 입력하세요.");
						String subject1 = input.next();
						studyinput.setSubject1(subject1);						
					}
				}
			}
			else if(num == 2) {
				System.out.print("변경하고 싶은 (목표)과목명을 입력하세요.");
				String Subject2 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput2 studyinput2 = Today.get(i);
					if (studyinput2.getSubject2().equals(Subject2)  ) {
						System.out.println("변경할 과목명을 입력하세요.");
						String subject2 = input.next();
						studyinput2.setSubject2(subject2);
					}
				}
			}
			else if(num == 3) {
				System.out.print("변경하고 싶은 (목표)과목명을 입력하세요.");
				String Subject1 = input.next();
				for(int i = 0; i< Target.size(); i++) {
					Studyinput studyinput = Target.get(i);
					if (studyinput.getSubject1().equals(Subject1)  ) {
						System.out.println("변경할 시간을 입력하세요.");
						int targetstudy = input.nextInt();
						studyinput.setTargetStudyTime(targetstudy);	
					}
				}
			}
			else if(num == 4) {
				System.out.print("변경하고 싶은 (목표)과목명을 입력하세요.");
				String Subject2 = input.next();
				for(int i = 0; i< Today.size(); i++) {
					Studyinput2 studyinput2 = Today.get(i);
					if (studyinput2.getSubject2().equals(Subject2)  ) {
						System.out.println("변경할 시간을 입력하세요.");
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
		System.out.println("입력한 목표 과목 수: " + Target.size());
		System.out.println("오늘 공부한 과목 수: " + Today.size());
		System.out.println("목표 공부");
		for (int i = 0; i < Target.size(); i++) {
			Target.get(i).printInfo();
		}
		System.out.println("오늘 공부");
		for (int i = 0; i < Today.size(); i++) {
			Today.get(i).printInfo();
		}
	}
}
