package footballplayer;

import java.util.Scanner;

import exception.NationalFormatException;

public abstract class NationalFootballPlayer extends FootballPlayer {
	
	public NationalFootballPlayer(FootballTeam footballTeam) {
		super(footballTeam);
	}

	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String footballTeam1 = getFootballTeam();
		System.out.printf("Football Team : %s\n", footballTeam1);
		System.out.printf("Player ID: %d\t", id);
		System.out.printf("Player Name: %s\t", name);
		System.out.printf("Player Age: %d\n", age);
		System.out.printf("Player Nationality/abbreviation: %s\t", nationality);
		System.out.printf("Player Height: %.2f\t", height);
		System.out.printf("Player Weight: %.2f\n", weight);
		System.out.println();

	}
	
	public void setPlayerNationalTeamWithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Are you a member of the National Team? [Y/N] ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setPlayerNationally(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setNationality("");
					break;
				}
				else {
					
				}
			}
			catch(NationalFormatException e) {
				System.out.println("Incorrect Nationality Format. put the Nationality that contains National abbreviation ");
				
			}
		}
	}

}
