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
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getTarget());
		frame.revalidate();
		frame.repaint();
	}

}
