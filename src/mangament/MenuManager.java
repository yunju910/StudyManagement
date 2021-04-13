package mangament;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudyManager studymanager = new StudyManager(input);
		
		int num = -1; 
		while (num != 5) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. 목표 공부량 ");
			System.out.println("2. 오늘 공부량 ");
			System.out.println("3. 공부량 수정하기");
			System.out.println("4. 공부량 확인하기");
			System.out.println("5. 종료");
			num = input.nextInt();
			if(num == 1) {
				studymanager.TargetStudy();
			}
			else if(num == 2) {
				studymanager.TodayStudy();
			}
			else if(num == 3) {
				studymanager.EditStudy();
			}
			else if(num == 4) {
				studymanager.ViewStudy();
			}
			else if(num ==5) {
				break;
			}
		}
	}
}
