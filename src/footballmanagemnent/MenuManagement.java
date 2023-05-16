package footballmanagemnent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlayerManager manager = new PlayerManager(input);
		
		selectMenu(input, manager);
		}

	
	public static void selectMenu(Scanner input, PlayerManager manager) {
		int num = 0;
		while (num != 5){
			try { 
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1: manager.addFootballPlayer();
					break;
				case 2: manager.deleteFootballPlyaer();
					break;
				case 3: manager.editFootballPlayer();
					break;
				case 4: manager.viewFootballPlayers();
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
	

}
