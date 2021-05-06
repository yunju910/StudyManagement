package management2;


public abstract class TargetStudy2 { // 목표 방학 
	protected StudyKind kind = StudyKind.방학;
	protected String Subject1;
	protected int TargetStudyTime; 
	
	public TargetStudy2(StudyKind kind) {
	}
	
	public TargetStudy2(String Subject1, int TargetStudyTime) {
		this.Subject1 = Subject1;
		this.TargetStudyTime = TargetStudyTime;
		
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
