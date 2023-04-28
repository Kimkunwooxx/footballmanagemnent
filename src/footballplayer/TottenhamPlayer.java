package footballplayer;

import java.util.Scanner;

public class TottenhamPlayer extends FootballPlayer {
	
	public void getUserInput(Scanner input){
		System.out.println("Football player ID Number :");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.println("Football Player Name :");
		String name = input.next();
		this.setName(name);
		
		System.out.println("Football Player Age :");
		int age = input.nextInt();
		this.setAge(age);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Are you a member of the National Team? [Y/N] ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Nationality : ");
				String nationality = input.next();
				this.setNationality(nationality);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setNationality("");
				break;
			}
			else {
				
			}
		}
		
		System.out.println("Football Player Height :");
		double height = input.nextDouble();
		this.setHeight(height);
		
		System.out.println("Football Player Weight :");
		double weight = input.nextDouble();
		this.setWeight(weight);
		
	}

}
