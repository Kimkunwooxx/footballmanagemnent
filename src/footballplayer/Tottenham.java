package footballplayer;

import java.util.Scanner;

public class Tottenham extends NationalFootballPlayer {
	
	public Tottenham(FootballTeam footballTeam) {
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
}
