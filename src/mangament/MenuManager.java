package mangament;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudyManager studymanager = getObject("studymanager.ser");
		if(studymanager == null)
			studymanager = new StudyManager(input);
		selectMenu(input, studymanager);
		
	}
	
	public static void selectMenu(Scanner input, StudyManager studymanager) {
		int num = -1; 
		while (num != 5) {
			try {
				showMenu();
				putObject(studymanager, "studymanager.ser");
				num = input.nextInt();
				switch(num) {
				case 1: 
					studymanager.TargetStudy();
					logger.log("add a Target Study");
					break;
				case 2:
					studymanager.TodayStudy();
					logger.log("add a Today Study");
					break;
				case 3:
					studymanager.EditStudy();
					logger.log("Edit a Study");
					break;
				case 4:
					studymanager.ViewStudy();
					logger.log("View a list of Study");

					break;
				default: 
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("정수로 1부터 5사이 값을 입력해주세요!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1; 
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. 목표 공부량 ");
		System.out.println("2. 오늘 공부량 ");
		System.out.println("3. 공부량 수정하기");
		System.out.println("4. 공부량 확인하기");
		System.out.println("5. 종료"); 
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
