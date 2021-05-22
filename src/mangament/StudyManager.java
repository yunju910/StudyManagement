package mangament;

import java.io.Serializable;
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

public class StudyManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1163469073322325922L;
	
	ArrayList<Studyinput> Target = new ArrayList<Studyinput>();
	ArrayList<Studyinput2> Today = new ArrayList<Studyinput2>();
	transient Scanner input;
	StudyManager(Scanner input){
		this.input = input;
	}
	public int kind;
	public void TargetStudy() {
		Studyinput studyinput;
		while (kind	!= 1 || kind != 2) {
			try {
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
			catch(InputMismatchException e){
				System.out.println("정수로 1과 2중에 하나를 입력해주세요!");
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

	
	public String TargetInputSubject() {
		System.out.print("변경하고 싶은 (목표)과목명을 입력하세요.");
		String Subject = input.next();
		return Subject;
	}
	
	public String TodayInputSubject() {
		System.out.print("변경하고 싶은 (오늘)과목명을 입력하세요.");
		String Subject = input.next();
		return Subject; 
	}
	
	public void showEditMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. 목표 공부량 과목 수정 ");
		System.out.println("2. 오늘 공부량 과목 수정");
		System.out.println("3. 목표 공부량 시간 수정");
		System.out.println("4. 오늘 공부량 시간 수정");
		System.out.println("5. 종료");
	}
}
