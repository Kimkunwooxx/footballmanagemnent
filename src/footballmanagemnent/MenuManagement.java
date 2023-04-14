package footballmanagemnent;

import java.util.Scanner;

public class MenuManagement {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlayerManager manager = new PlayerManager(input);
		int num = 0;

		while (num != 5){		
		System.out.println("1.Add Football Player");
		System.out.println("2.Delete Football Player");
		System.out.println("3.Edit Football Player");
		System.out.println("4.View Football Players");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5 : ");
		
		num = input.nextInt();
		if (num ==1) {
			manager.addFootballPlayer();
		}
		if (num ==2) {
			manager.deleteFootballPlyaer();
		}
		if (num ==3) {
			manager.editFootballPlayer();
		}
		if (num ==4) {
			manager.viewFootballPlayers();
		}
		
		}
	}
	

}
