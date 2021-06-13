package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.TimeFormatException;
import management2.Holiday2;
import management2.StudyKind;
import management2.Studyinput2;
import mangament.StudyManager;

public class TodayAdderListener implements ActionListener {
	JTextField fieldSubject;
	JTextField fieldTime;
	StudyManager studymanager; 


	public TodayAdderListener(JTextField fieldSubject, JTextField fieldTime, StudyManager studymanager) {
		super();
		this.fieldSubject = fieldSubject;
		this.fieldTime = fieldTime;
		this.studymanager = studymanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldSubject.getText());
		System.out.println(fieldTime.getText());
		
		Studyinput2 study = new Holiday2(StudyKind.πÊ«–);
		try {
			study.setTodayStudyTime(fieldTime.getText());
			study.setSubject2(fieldSubject.getText());
			studymanager.TodayStudy(study);
		} catch (TimeFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(StudyManager studymanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(studymanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

} 
