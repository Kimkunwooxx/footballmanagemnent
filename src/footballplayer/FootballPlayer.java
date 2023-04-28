package footballplayer;

import java.util.Scanner;

public class FootballPlayer {
	//선수들의 정보
	protected int id;
	protected String name;
	protected int age;
	protected String nationality;
	protected double weight;
	protected double height;
	
	
	public FootballPlayer() {
	}
	
	//constructor
	public FootballPlayer(int id , 
			String name, int age, String nationality, double height, double weight) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}
	
	protected FootballTeam team = FootballTeam.Tottenham;
	public FootballTeam getTeam() {
		return team;
	}

	public void setTeam(FootballTeam team) {
		this.team = team;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
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

	//선수들의 정보를 출력하는 메소드
	public void printInfo() {
		System.out.printf("Player ID: %d\t", id);
		System.out.printf("Player Name: %s\t", name);
		System.out.printf("Player Age: %d\n", age);
		System.out.printf("Player Nationality: %s\t", nationality);
		System.out.printf("Player Height: %.2f\t", height);
		System.out.printf("Player Weight: %.2f\n", weight);
		System.out.println();

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
		System.out.println("Football Player Nationality :");
		String nationality = input.next();
		this.setNationality(nationality);
		System.out.println("Football Player Height :");
		double height = input.nextDouble();
		this.setHeight(height);
		System.out.println("Football Player Weight :");
		double weight = input.nextDouble();
		this.setWeight(weight);
		
	}
	
}
