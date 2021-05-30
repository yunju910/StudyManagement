package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudyViewer extends JFrame{

	public StudyViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Target Study");
		model.addColumn("Study Time");
		model.addColumn("Today Study");
		model.addColumn("Study Time");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
		
	}

}
