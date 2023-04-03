package footballmanagemnent;

import java.util.Scanner;

public class footballmanagemnent2 {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num != 6){		
		System.out.println("1.Add Football Player");
		System.out.println("2.Delete Football Player");
		System.out.println("3.Edit Football Player");
		System.out.println("4.View Football Player");
		System.out.println("5.Show a menu");
		System.out.println("6.Exit");
		System.out.println("Select one number between 1-6 : ");
		
		num = input.nextInt();
		if (num ==1) {
			addFootballPlayer();
		}
		if (num ==2) {
			deleteFootballPlyaer();
		}
		if (num ==3) {
			editFootballPlayer();
		}
		if (num ==4) {
			viewFootballPlayer();
		}
		
		}

	}
	public static void addFootballPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Football Player ID Number :");
		int idNumber = input.nextInt();
		
		System.out.print("Football Player Name : ");
		String playerName1 = input.next();
		
		System.out.print("Football Player Age : ");
		int playerAge1 = input.nextInt();
		
		System.out.print("Football Player Nationality : ");
		String playerNationality1 = input.next();
		
		System.out.print("Football Player Height : ");
		double playerHeight1 = input.nextDouble();
		
		System.out.print("Football Player Weight : ");
		double playerWeight1 = input.nextDouble();
	}
	
	public static void deleteFootballPlyaer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		
		System.out.println("Are you sure you want to delete this player?");
		String answer = input.next();
		
	}
	
	public static void editFootballPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
	}
	
	public static void viewFootballPlayer(){
		Scanner input = new Scanner(System.in);
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
	}
}
