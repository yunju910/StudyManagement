package gui;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TodayStudyAdder extends JPanel {

	WindowFrame frame;
	
	public TodayStudyAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("Today Subject: ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelTime = new JLabel("Study Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelSubject.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true); 	
		
	}
}

