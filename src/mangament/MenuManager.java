package mangament;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudyManager studymanager = new StudyManager(input);
		selectMenu(input, studymanager);
		
	}
	
	public static void selectMenu(Scanner input, StudyManager studymanager) {
		int num = -1; 
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1: 
					studymanager.TargetStudy();
					break;
				case 2:
					studymanager.TodayStudy();
					break;
				case 3:
					studymanager.EditStudy();
					break;
				case 4:
					studymanager.ViewStudy();
					break;
				default: 
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("������ 1���� 5���� ���� �Է����ּ���!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1; 
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. ��ǥ ���η� ");
		System.out.println("2. ���� ���η� ");
		System.out.println("3. ���η� �����ϱ�");
		System.out.println("4. ���η� Ȯ���ϱ�");
		System.out.println("5. ����"); 
	}
}
