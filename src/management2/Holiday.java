package management2;

import java.util.Scanner;

public class Holiday extends Study {
	public void getUserInput(Scanner input) {
		System.out.println("공부할 과목을 입력하세요.");
		String Subject1 = input.next();
		this.setSubject1(Subject1);
		
		System.out.println("공부할 시간을 입력하세요.");
		int TargetStudyTime = input.nextInt();
		this.setTargetStudyTime(TargetStudyTime);
	}

}
