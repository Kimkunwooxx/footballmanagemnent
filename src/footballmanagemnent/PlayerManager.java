package footballmanagemnent;

import java.util.ArrayList;
import java.util.Scanner;

import footballplayer.FootballPlayer;
import footballplayer.TottenhamPlayer;

public class PlayerManager {
	//개체
	ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
	Scanner input;
	
	//constructor
	PlayerManager(Scanner input){
		this.input = input;
	}
	//선수들의 정보를 입력받는 메소드
	public void addFootballPlayer() {
		int team = 0;
		FootballPlayer player;
		while(team !=1 && team !=2) {
			System.out.print("1 for Manchester United");
			System.out.println("\t2 for Tottenham");
			System.out.println("Select num for Football Team between 1 and 2 :");
			team = input.nextInt();
			if(team == 1) {
				player = new FootballPlayer();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if(team ==2){
				player = new TottenhamPlayer();
				players.add(player);
				player.getUserInput(input);
				break;
			}
			else {
				System.out.println("Select num for Football Team between 1 and 2 :");
			}
		}
	}

	//선수를 삭제하는 메소드
	public void deleteFootballPlyaer() {
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		int index = -1;
		for (int i=0; i <players.size(); i++) {
			if (players.get(i).getId() == inNumber) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			players.remove(index);
			System.out.println("the student " + inNumber + "is deleted" );
		}
		else {
			System.out.println("the student has nor been registered");
		}
			
	}
	
	//선수의 정보를 수정하는 메소드
	public void editFootballPlayer() {
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		for (int i=0; i <players.size(); i++) {
			FootballPlayer player = players.get(i);
			if(player.getId() == inNumber) { 
				int num = -1;
				while (num != 5) {
					System.out.println("** Football Plyaer Info Edit Menu **");
					System.out.println("1. Edit ID");
					System.out.println("2. Edid Name");
					System.out.println("3. Edit Age");
					System.out.println("4. Edit Nationality");
					System.out.println("5. Edit Weight");
					System.out.println("6. Edit Height");
					System.out.println("7. EXIT");
					System.out.println("Selet one number between 1 ~ 7");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Player ID :");
						int id = input.nextInt();
						player.setId(id);
					}
					else if (num == 2) {
						System.out.print("Player Name :");
						String name = input.next();
						player.setName(name);
					}
					else if (num == 3) {
						System.out.print("Player Age :");
						int age = input.nextInt();
						player.setAge(age);
					}
					else if (num == 4) {
						System.out.print("Player Nationality :");
						String nationality = input.next();
						player.setNationality(nationality);
					}
					else if (num == 5) {
						System.out.print("Player Weight :");
						double weight = input.nextDouble();
						player.setWeight(weight);
					}
					else if (num == 6) {
						System.out.print("Player Height :");
						double height = input.nextDouble();
						player.setHeight(height);
					}
					else {
						break;
					}
				}//while
				break;
			}//if
		}//for
	}
	
	//현재 저장된 선수들을 출력하는 메소드
	public void viewFootballPlayers(){
		System.out.println("# of registered Players :" + players.size());
		for (int i=0; i <players.size(); i++) {
			players.get(i).printInfo();
		}
	}
}
