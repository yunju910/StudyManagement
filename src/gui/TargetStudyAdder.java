package gui;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.StudyCancelListener;
import listener.TargetAdderListener;
import mangament.StudyManager;

public class TargetStudyAdder extends JPanel {
	
	WindowFrame frame;
	StudyManager studymanager;

	public TargetStudyAdder(WindowFrame frame, StudyManager studymanager) {
		this.frame = frame;
		this.studymanager = studymanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("Target Subject: ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelTime = new JLabel("Study Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelSubject.setLabelFor(fieldTime);
		
		JButton saveButton = (new JButton("save"));
		saveButton.addActionListener(new TargetAdderListener(fieldSubject, fieldTime, studymanager));
		
		JButton cancelButton = (new JButton("cancel"));
		cancelButton.addActionListener(new StudyCancelListener(frame));
		
		panel.add(labelTime);
		panel.add(fieldTime);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
}

