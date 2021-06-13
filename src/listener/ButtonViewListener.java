package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.StudyViewer;
import gui.WindowFrame;
import mangament.StudyManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StudyViewer studyviewer = frame.getStudyviewer();
		StudyManager studymanager = getObject("studymanager.ser");
		studyviewer.setStudymanager(studymanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(studyviewer);
		frame.revalidate();
		frame.repaint();
	}

	
	public static StudyManager getObject(String filename) {
		StudyManager studymanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			studymanager = (StudyManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return studymanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studymanager; 
		
	}
}
