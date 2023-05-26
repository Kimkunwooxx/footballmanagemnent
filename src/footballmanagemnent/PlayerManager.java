package footballmanagemnent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import footballplayer.YouthTeam;
import footballplayer.FootballPlayerInput;
import footballplayer.FootballTeam;
import footballplayer.ManchesterUnited;
import footballplayer.Tottenham;

public class PlayerManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2206290546272504316L;
	
	//개체
	ArrayList<FootballPlayerInput> players = new ArrayList<FootballPlayerInput>();
	transient Scanner input;
	
	//constructor
	PlayerManager(Scanner input){
		this.input = input;
	}
	//선수들의 정보를 입력받는 메소드
	public void addFootballPlayer() {
		int team = 0;
		FootballPlayerInput playerInput;
		while(team < 1 || team > 3) {
			try {
				System.out.println("==============================================");
				System.out.println("Select 1 for Manchester United");
				System.out.println("Select 2 for Tottenham");
				System.out.println("Select 3 for Youth");
				System.out.println("Select num for Football Team between 1 and 3 :");
				System.out.println("==============================================");
				team = input.nextInt();
				//맨유 선수 선택
				if(team == 1) {
					playerInput = new ManchesterUnited(FootballTeam.ManchesterUnited);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				//토트넘 선수 선택
				else if(team == 2){
					playerInput = new Tottenham(FootballTeam.Tottenham);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				//유소년 선수 선택
				else if(team == 3) {
					playerInput = new YouthTeam(FootballTeam.YouthTeam);
					playerInput.getUserInput(input);
					players.add(playerInput);
				}
				else {
					System.out.println("Select num for Football Team between 1 and 3 :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				team = -1;
			}
		}
	}

	//선수를 삭제하는 메소드
	public void deleteFootballPlyaer() {
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		int index = findIndex(inNumber);
		removefromPlayer(index, inNumber);
	}
	
	public int findIndex(int inNumber) {
		int index = -1;
		for (int i=0; i <players.size(); i++) {
			if (players.get(i).getId() == inNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromPlayer(int index, int inNumber) {
		if (index >= 0) {
			players.remove(index);
			System.out.println("the student " + inNumber + "is deleted" );
			return 1;
		}
		else {
			System.out.println("the student has nor been registered");
			return -1;
		}
	}
	
	//선수의 정보를 수정하는 메소드
	public void editFootballPlayer() {
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		for (int i=0; i <players.size(); i++) {
			FootballPlayerInput playerInput = players.get(i);
			if(playerInput.getId() == inNumber) { 
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						playerInput.setPlayerID(input);
						break;
					case 2:
						playerInput.setPlayerName(input);
						break;
					case 3:
						playerInput.setPlayerAge(input);
						break;
					case 4:
						playerInput.setPlayerNationally(input);
						break;
					case 5:
						playerInput.setPlayerWeight(input);
						break;
					case 6:
						playerInput.setPlayerHeight(input);
						break;
					default :
						continue;
					}
				}//if
			}//for
		}
	}
	
	//현재 저장된 선수들을 출력하는 메소드
	public void viewFootballPlayers(){
		System.out.println("# of registered Players :" + players.size());
		for (int i=0; i <players.size(); i++) {
			players.get(i).printInfo();
		}
	}

	public  void showEditMenu() {
		System.out.println("*** Football Plyaer Info Edit Menu ***");
		System.out.println("1. Edit ID");
		System.out.println("2. Edid Name");
		System.out.println("3. Edit Age");
		System.out.println("4. Edit Nationality/abbreviation");
		System.out.println("5. Edit Weight");
		System.out.println("6. Edit Height");
		System.out.println("7. EXIT");
		System.out.println("Selet one number between 1 ~ 7");
		System.out.println("**************************************");
	}
}
