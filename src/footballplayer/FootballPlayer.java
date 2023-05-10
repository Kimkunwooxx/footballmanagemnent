package footballplayer;

import java.util.Scanner;

public abstract class FootballPlayer {
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

	public abstract void printInfo();
	
}
