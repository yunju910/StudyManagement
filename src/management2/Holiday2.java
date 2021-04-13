package management2;

import java.util.Scanner;

public class Holiday2 extends Study2 {
	public void getUserInput(Scanner input) {
		System.out.println("공부할 과목을 입력하세요.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
		
		System.out.println("공부할 시간을 입력하세요.");
		int TodayStudyTime = input.nextInt();
		this.setTodayStudyTime(TodayStudyTime);
	}

}
