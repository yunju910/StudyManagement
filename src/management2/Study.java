package management2;

import java.util.Scanner;

public abstract class Study {
	protected StudyKind kind = StudyKind.«–±‚¡ﬂ;
	protected int Goal; 
	protected String Subject1;
	protected int TargetStudyTime; 
	
	public Study(StudyKind kind) {
	}
	
	public Study( int Goal, String Subject1, int TargetStudyTime) {
		this.Goal = Goal; 
		this.Subject1 = Subject1;
		this.TargetStudyTime = TargetStudyTime;
		
	}
	public int getGoal() {
		return Goal;
	}
	
	public void setGoal(int goal){
		Goal = goal;
	}
	
	public String getSubject1() {
		return Subject1;
	}

	public void setSubject1(String subject1) {
		Subject1 = subject1;
	}

	public int getTargetStudyTime() {
		return TargetStudyTime;
	}

	public void setTargetStudyTime(int targetStudyTime) {
		TargetStudyTime = targetStudyTime;
	}
	
	
	public abstract void printInfo();
	
	

}
