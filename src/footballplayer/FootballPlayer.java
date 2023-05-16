package footballplayer;

import java.util.Scanner;

import exception.NationalFormatException;

public abstract class FootballPlayer implements FootballPlayerInput {
	//선수들의 정보
	protected FootballTeam footballTeam = FootballTeam.ManchesterUnited;
	protected int id;
	protected String name;
	protected int age;
	protected String nationality;
	protected double weight;
	protected double height;
	
	
	public FootballPlayer() {
	}
	
	public FootballPlayer(FootballTeam footballTeam) {
		this.footballTeam = footballTeam;
	}
	
	public FootballPlayer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public FootballPlayer(FootballTeam footballTeam, int id , 
			String name, int age, String nationality, double height, double weight) {
		this.footballTeam = footballTeam;
		this.id = id;
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}
	
	protected FootballTeam team = FootballTeam.Tottenham;
	public FootballTeam getTeam() {
		return footballTeam;
	}

	public void setTeam(FootballTeam team) {
		this.footballTeam = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality(){
		return nationality;
	}

	public void setNationality(String nationality) throws NationalFormatException {
		if (!nationality.contains("/") && !nationality.equals("")) {
			throw new NationalFormatException();
		}
		this.nationality = nationality;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setPlayerID(Scanner input) {
		System.out.print("Player ID :");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setPlayerName(Scanner input) {
		System.out.print("Player Name :");
		String name = input.next();
		this.setName(name);
	}
	public void setPlayerAge(Scanner input) {
		System.out.print("Player Age :");
		int age = input.nextInt();
		this.setAge(age);
	}
	public void setPlayerNationally(Scanner input) {
		String nationality = "";
		while(!nationality.contains("/")) {
			System.out.print("Player Nationality/abbreviation :");
			nationality = input.next();
			try {
				this.setNationality(nationality);
			} catch (NationalFormatException e) {
				System.out.println("Incorrect Nationality Format. put the Nationality that contains National abbreviation ");
			}
		}
	}
	public void setPlayerWeight(Scanner input) {
		System.out.print("Player Weight :");
		double weight = input.nextDouble();
		this.setWeight(weight);
	}
	public void setPlayerHeight(Scanner input) {
		System.out.print("Player Height :");
		double height = input.nextDouble();
		this.setHeight(height);
	}
	
	public String getFootballTeam() {
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
		case YouthTeam :
			footballTeam1 = "Youth";
			break;
		default :	
		}
		return footballTeam1;
	}

	public abstract void printInfo();
	
}
