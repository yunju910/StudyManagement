package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.TodayStudyAdder;
import gui.WindowFrame;

public class ButtonAddTodayListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddTodayListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getToday());
		frame.revalidate();
		frame.repaint();
	}

}
