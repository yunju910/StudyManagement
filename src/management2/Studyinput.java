package management2;

import java.util.Scanner;

import exception.TimeFormatException;

public interface Studyinput {
	
	public void getUserInput(Scanner input);
	
	public String getSubject1();
	
	public void setSubject1(String subject1);
	
	public String getTargetStudyTime();
	
	public void setTargetStudyTime(String targetStudyTime) throws TimeFormatException;
	
	public void printInfo();
	
	public void setTargetSubject(Scanner input);
	
	public void setTargetStudy(Scanner input);
	
	public void setTargetSubject(Scanner input, String Subject);
	
	public void setTargetStudy(Scanner input, String Subject);
	
}
