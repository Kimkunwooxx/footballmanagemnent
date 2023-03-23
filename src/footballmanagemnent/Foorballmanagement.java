package footballmanagemnent;

import java.util.Scanner;

public class Foorballmanagement {
	
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
		switch(num) {
		case 1:
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
		break;
	   	case 2:
	    	case 3:
	    	case 4:
	  	System.out.print("Football Player Name : ");
		String playerName2 = input.next();
		
		}
	
		}

	}

}
