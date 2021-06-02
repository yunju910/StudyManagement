package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.TargetStudyAdder;
import gui.WindowFrame;

public class ButtonAddTargetListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddTargetListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		TargetStudyAdder target = frame.getTarget();
		frame.setupPanel(target);
	}

}
