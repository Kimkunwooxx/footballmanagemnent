package footballplayer;

import java.util.Scanner;

public class YouthPlayer extends FootballPlayer{
	
	protected String footballManager;
	protected String coach;
	
	public YouthPlayer(FootballTeam footballTeam) {
		super(footballTeam);
	}
	
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
			System.out.print("Are you a member of the National Youth football Team? [Y/N] ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Youth Team Nationality : ");
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
	
	public void printInfo() {
		String footballTeam1 = "none";
		switch(this.footballTeam) {
		case Arsenal :
			footballTeam1 = "Arsenal";
			break;
		case ManchesterUnited :
			footballTeam1 = "ManchesterUnited";
			break;
		case Tottenham :
			footballTeam1 = "Tottenham";
			break;
		case Liverpool :
			footballTeam1 = "Liverpool";
			break;
		case Youth :
			footballTeam1 = "Youth";
			break;
		default :	
		}
		System.out.printf("Football Team : %s\n", footballTeam1);
		System.out.printf("Player ID: %d\t", id);
		System.out.printf("Player Name: %s\t", name);
		System.out.printf("Player Age: %d\n", age);
		System.out.printf("National Youth Team: %s\t", nationality);
		System.out.printf("Player Height: %.2f\t", height);
		System.out.printf("Player Weight: %.2f\n", weight);
		System.out.println();

	}

}
