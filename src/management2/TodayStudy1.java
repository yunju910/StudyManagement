package management2;

public abstract class TodayStudy1 { // ���� �б��� 
	protected int Goal2; 
	protected StudyKind kind = StudyKind.�б���; 
	protected String Subject2;
	protected int TodayStudyTime; 
	
	public TodayStudy1(StudyKind kind2) {
	}
	
	public TodayStudy1(String Subject2, int TodayStudyTime) { 
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
