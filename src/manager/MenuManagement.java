package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlayerManager manager = getObject("PlayerManager.ser");
		if(manager == null) {
			manager = new PlayerManager(input);
		}
		
		WindowFrame frame = new WindowFrame(manager);
		selectMenu(input, manager);
		putObject(manager, "PlayerManager.ser");
		}

	
	public static void selectMenu(Scanner input, PlayerManager manager) {
		int num = 0;
		while (num != 5){
			try { 
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1: 
					manager.addFootballPlayer();
					logger.log("add a FootballPlayer");
					break;
				case 2: 
					manager.deleteFootballPlyaer();
					logger.log("delete a FootballPlayer");
					break;
				case 3: 
					manager.editFootballPlayer();
					logger.log("edit a FootballPlayer");
					break;
				case 4: 
					manager.viewFootballPlayers();
					logger.log("view a FootballPlayers");
					break;
				default:
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("============ MAIN MENU ============");
		System.out.println("1.Add Football Player");
		System.out.println("2.Delete Football Player");
		System.out.println("3.Edit Football Player");
		System.out.println("4.View Football Players");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5 : ");
		System.out.println("===================================");
	}
	
	public static PlayerManager getObject(String filename) {
		PlayerManager manager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			manager = (PlayerManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return manager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return manager;
	}

	public static void putObject(PlayerManager manager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(manager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
