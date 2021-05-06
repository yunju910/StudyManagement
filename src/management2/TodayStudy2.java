package management2;

import java.util.Scanner;

public abstract class TodayStudy2 { // 오늘 방학
	protected int Goal2; 
	protected StudyKind kind = StudyKind.방학; 
	protected String Subject2;
	protected int TodayStudyTime; 
	
	public TodayStudy2(StudyKind kind2) {
	}
	
	public TodayStudy2(String Subject2, int TodayStudyTime) { 
		this.Subject2 = Subject2;
		this.TodayStudyTime = TodayStudyTime;
	}
	public int getGoal() {
		return Goal2;
	}
	public void setGoal(int Goal) {
		this.Goal2= Goal;
	}
	public String getSubject2() {
		return Subject2;
	}

	public void setSubject2(String subject2) {
		Subject2 = subject2;
	}

	public int getTodayStudyTime() {
		return TodayStudyTime;
	}

	public void setTodayStudyTime(int todayStudyTime) {
		TodayStudyTime = todayStudyTime;
	}

	public abstract void printInfo();

}
