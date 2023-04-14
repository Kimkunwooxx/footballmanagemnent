package footballmanagemnent;

import java.util.ArrayList;
import java.util.Scanner;

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
		FootballPlayer playerInformation = new FootballPlayer();
		System.out.println("Football player ID Number :");
		playerInformation.id = input.nextInt();
		
		System.out.println("Football Player Name :");
		playerInformation.name = input.next();
		
		System.out.println("Football Player Age :");
		playerInformation.age = input.nextInt();
		
		System.out.println("Football Player Nationality :");
		playerInformation.nationality = input.next();
		
		System.out.println("Football Player Height :");
		playerInformation.height = input.nextDouble();
		
		System.out.println("Football Player Weight :");
		playerInformation.weight = input.nextDouble();
		players.add(playerInformation);
	}

	//선수를 삭제하는 메소드
	public void deleteFootballPlyaer() {
		System.out.println("Football player ID Number :");
		int inNumber = input.nextInt();
		int index = -1;
		for (int i=0; i <players.size(); i++) {
			if (players.get(i).id == inNumber) {
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
			if(players.get(i).id == inNumber) { 
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
						players.get(i).id = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Player Name :");
						players.get(i).name = input.next();
					}
					else if (num == 3) {
						System.out.print("Player Age :");
						players.get(i).age = input.nextInt();
					}
					else if (num == 4) {
						System.out.print("Player Nationality :");
						players.get(i).nationality = input.next();
					}
					else if (num == 5) {
						System.out.print("Player Weight :");
						players.get(i).weight = input.nextDouble();
					}
					else if (num == 6) {
						System.out.print("Player Height :");
						players.get(i).height = input.nextDouble();
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
		for (int i=0; i <players.size(); i++) {
			players.get(i).printInfo();
		}
	}
}
