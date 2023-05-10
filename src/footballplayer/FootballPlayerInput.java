package footballplayer;

import java.util.Scanner;

public interface FootballPlayerInput {
	
	public int getId();
	
	public void setId(int id);

	public String getName();

	public void setName(String name);

	public int getAge();

	public void setAge(int age);

	public String getNationality();

	public void setNationality(String nationality);

	public double getWeight();

	public void setWeight(double weight);

	public double getHeight();

	public void setHeight(double height);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
