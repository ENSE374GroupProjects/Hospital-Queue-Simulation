package HospitalSimulation;
import java.util.Scanner;

public class Simulation 
{
	public Scanner input;
	
	//Default constructor to open a Scanner object
	public Simulation()
	{
		input = new Scanner(System.in);
	}
	
	//Function for obtaining a valid age
	public int determineUserAge()
	{		
		//Declaring local variables
		String inputString;
		int userAge = 0;
		boolean validChoice = false;
		
		//Create a loop to obtain a valid integer value
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter your age: ");
			inputString = input.nextLine();
						
			try
			{
				//Try to convert the string to an integer
				userAge = Integer.parseInt(inputString);
				
				//If no exception was thrown, determine if the age is reasonable
				if(userAge < 0 || userAge > 150)
				{
					System.out.print("Age must be in the range of 0 to 150. ");
					continue;
				}
				
				//If the age is reasonable, exit the loop
				validChoice = true;
			}
			catch(NumberFormatException ex)
			{
				//If the input cannot be expressed as an integer, inform the user and prompt them again
				System.out.print("Invalid age format. ");
			}	
		}while(!validChoice);
		
		//Return the valid result
		return userAge;
	}
	
	//Function for obtaining a valid location
	public Location determineUserLocation()
	{
		//Declaring local variables
		String userLocation;
		
		//Present the possible locations to the user
		System.out.print("\nValid locations in Regina are Northwest, North, Northeast, West, Central, East, Southwest, South and Southeast.\n");
		
		//Create a loop to obtain a valid location
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter your current location: ");
			userLocation = input.nextLine();
			
			//If the location is valid, return the correct location
			switch(userLocation.toUpperCase())
			{
				//If the location is valid, return the appropriate location enum
				case("NORTHWEST"): 	return Location.NORTHWEST;
				case("NORTH"): 		return Location.NORTH;
				case("NORTHEAST"): 	return Location.NORTHEAST;
				case("WEST"): 		return Location.WEST;
				case("CENTRAL"): 	return Location.CENTRAL;
				case("EAST"): 		return Location.EAST;
				case("SOUTHWEST"): 	return Location.SOUTHWEST;
				case("SOUTH"): 		return Location.SOUTH;
				case("SOUTHEAST"): 	return Location.SOUTHEAST;
				//If the location is invalid, inform the user and prompt them again
				default: 			System.out.print("Invalid location. ");		
			}
		}while(true);
	}
	
	public static void main(String[] args) 
	{
		//Declaring local variables
		Simulation userInterface = new Simulation();
		UserAccount user = new UserAccount();		
		int userAge;
		Location userLocation;
		
		//Welcome the user to the program
		System.out.println("Welcome to the hospital emergency queue management system.");
		System.out.println("For simplicity's sake, this app will only utilize the General and Pasqua hospitals.\n");
		
		//Obtain and set the user's age
		userAge = userInterface.determineUserAge();
		user.setAge(userAge);
		System.out.println(user.getAge());
		
		//Obtain and set the user's location
		userLocation = userInterface.determineUserLocation();
		user.setLocation(userLocation);
		System.out.println(user.getLocation());
	}
}
