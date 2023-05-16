package footballplayer;

import java.util.Scanner;

import exception.NationalFormatException;

public interface FootballPlayerInput {
	
	public int getId();
	
	public void setId(int id);

	public String getName();

	public void setName(String name);

	public int getAge();

	public void setAge(int age);

	public String getNationality();

	public void setNationality(String nationality) throws NationalFormatException;

	public double getWeight();

	public void setWeight(double weight);

	public double getHeight();

	public void setHeight(double height);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setPlayerID(Scanner input);
	
	public void setPlayerName(Scanner input);
	
	public void setPlayerAge(Scanner input);
	
	public void setPlayerNationally(Scanner input);
	
	public void setPlayerWeight(Scanner input);
	
	public void setPlayerHeight(Scanner input);
}
