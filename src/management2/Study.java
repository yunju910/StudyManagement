package management2;


public abstract class Study {
	protected StudyKind kind = StudyKind.«–±‚¡ﬂ;
	protected String Subject1;
	protected int Goal;	
	protected int TargetStudyTime; 
	
	public Study(StudyKind kind) {
	}
	
	public Study(String Subject1, int TargetStudyTime) {
		this.Subject1 = Subject1;
		this.TargetStudyTime = TargetStudyTime;
		
	}
	
	public int getGoal() {
		return Goal;
	}
	public void setGoal(int Goal) {
		this.Goal= Goal;
	}
	public String getSubject1() {
		return Subject1;
	}

	public void setSubject1(String subject1) {
		this.Subject1 = subject1;
	}

	public int getTargetStudyTime() {
		return TargetStudyTime;
	}

	public void setTargetStudyTime(int targetStudyTime) {
		this.TargetStudyTime = targetStudyTime;
	}
	
	
	public abstract void printInfo();
	
}
