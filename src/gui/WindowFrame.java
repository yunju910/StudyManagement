package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mangament.StudyManager;

public class WindowFrame extends JFrame{
	StudyManager studymanager;
	MenuSelection menuselection;		
	TargetStudyAdder target;
	TodayStudyAdder today;
	StudyViewer studyviewer;

	public WindowFrame(	StudyManager studymanager) {
		this.setTitle("My Frame");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.studymanager = studymanager;
		this.menuselection = new MenuSelection(this);		
		this.target = new TargetStudyAdder(this);
		this.today = new TodayStudyAdder(this);
		this.studyviewer = new StudyViewer(this, this.studymanager);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}	

	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public TargetStudyAdder getTarget() {
		return target;
	}

	public void setTarget(TargetStudyAdder target) {
		this.target = target;
	}

	public TodayStudyAdder getToday() {
		return today;
	}

	public void setToday(TodayStudyAdder today) {
		this.today = today;
	}

	public StudyViewer getStudyviewer() {
		return studyviewer;
	}

	public void setStudyviewer(StudyViewer studyviewer) {
		this.studyviewer = studyviewer;
	}

}
