package management2;

import java.util.Scanner;

public interface Studyinput {
	
	public void getUserInput(Scanner input);
	
	public String getSubject1();
	public void setSubject1(String subject1);
	public int getTargetStudyTime();
	public void setTargetStudyTime(int targetStudyTime);
	public void printInfo();
}
