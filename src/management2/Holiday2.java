package management2;

import java.util.Scanner;

public class Holiday2 extends Study2 {
	public void getUserInput(Scanner input) {
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = input.next();
		this.setSubject2(Subject2);
		
		System.out.println("������ �ð��� �Է��ϼ���.");
		int TodayStudyTime = input.nextInt();
		this.setTodayStudyTime(TodayStudyTime);
	}

}
