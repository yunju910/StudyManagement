package gui;
	
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import management2.Studyinput;
import management2.Studyinput2;
import mangament.StudyManager;
	
public class StudyViewer extends JPanel{
	
	WindowFrame frame;
	StudyManager studymanager;
	
	public StudyViewer(WindowFrame frame, StudyManager studymanager) {
		this.frame = frame;
		this.studymanager = studymanager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Target Study");
		model.addColumn("Study Time");
		model.addColumn("Today Study");
		model.addColumn("Study Time");
		
		for(int i = 0; i< studymanager.Targetsize(); i++) {
			Vector row = new Vector();
			Studyinput st1 = studymanager.Target_get(i);
			row.add(st1.getSubject1());
			row.add(st1.getTargetStudyTime());
			Studyinput2 st2 = studymanager.Today_get(i);
			row.add(st2.getSubject2());
			row.add(st2.getTodayStudyTime());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
			
		this.add(sp);
			
	}
	
}
