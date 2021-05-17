package management2;

import java.util.Scanner;

public interface Studyinput2 {
	
	public void getUserInput(Scanner input);
	
	public String getSubject2();
	
	public void setSubject2(String subject2);
	
	public String getTodayStudyTime();
	
	public void setTodayStudyTime(String todayStudyTime);
	
	public void printInfo();
	
	public void setTodaySubject(Scanner input);

	public void setTodayStudy(Scanner input);
	
	public void setTodaySubject(Scanner input, String Subject);
	
	public void setTodayStudy(Scanner input, String Subject);
	
}
