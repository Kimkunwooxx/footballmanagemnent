package footballplayer;

import java.util.Scanner;

public class YouthTeam extends NationalFootballPlayer {
	
	protected String footballManager;
	protected String coach;
	
	public YouthTeam(FootballTeam footballTeam) {
		super(footballTeam);
	}
	 
	public void getUserInput(Scanner input){
		setPlayerID(input);
		setPlayerName(input);
		setPlayerAge(input);
		setPlayerNationalTeamWithYN(input);
		setPlayerWeight(input);
		setPlayerHeight(input);
		
	}
	
	public void printInfo() {
		String footballTeam1 = getFootballTeam();
		System.out.printf("Football Team : %s\n", footballTeam1);
		System.out.printf("Player ID: %d\t", id);
		System.out.printf("Player Name: %s\t", name);
		System.out.printf("Player Age: %d\n", age);
		System.out.printf("National Youth Team/abbreviation: %s\t", nationality);
		System.out.printf("Player Height: %.2f\t", height);
		System.out.printf("Player Weight: %.2f\n", weight);
		System.out.println();

	}
}
