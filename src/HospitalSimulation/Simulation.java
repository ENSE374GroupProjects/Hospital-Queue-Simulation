package HospitalSimulation;
import java.util.Scanner;

public class Simulation 
{
	public static Scanner input;
	
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
	
	//Function for obtaining a valid gender
	public Gender determineUserGender()
	{
		//Declaring local variables
		String userGender;
		
		//Present the possible genders to the user
		System.out.print("Valid genders are Male, Female and Other.\n");
		
		//Create a loop to obtain a valid gender
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter your gender: ");
			userGender = input.nextLine();
			
			//Analyze the given gender
			switch(userGender.toUpperCase())
			{
				//If the gender is valid, return the appropriate gender enum
				case("MALE"): 		return Gender.MALE;
				case("FEMALE"): 	return Gender.FEMALE;
				case("OTHER"): 		return Gender.OTHER;
				//If the gender is invalid, inform the user and prompt them again
				default: 			System.out.print("Invalid gender. ");		
			}
		}while(true);
	}
	
	//Function for obtaining a valid symptom
	public Symptom determineUserSymptom()
	{
		//Declaring local variables
		String userSymptom;
		
		//Present the possible symptoms to the user
		System.out.print("Valid symptoms are CardiacArrest, RespiratoryArrest, ShortBreath, ChestPain, Fever, AbdominalPain, Sprain, BrokenFinger, StubbedToe and Cough.\n");
		
		//Create a loop to obtain a valid location
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter your symptom: ");
			userSymptom = input.nextLine();
			
			//Analyze the given symptom
			switch(userSymptom.toUpperCase())
			{
				//If the symptom is valid, return the appropriate symptom enum
				case("CARDIACARREST"): 		return Symptom.CARDIACARREST;
				case("RESPIRATORYARREST"): 	return Symptom.RESPIRATORYARREST;
				case("SHORTBREATH"): 		return Symptom.SHORTBREATH;
				case("CHESTPAIN"):			return Symptom.CHESTPAIN;
				case("FEVER"): 				return Symptom.FEVER;
				case("ABDOMINALPAIN"): 		return Symptom.ABDOMINALPAIN;
				case("SPRAIN"): 			return Symptom.SPRAIN;
				case("BROKENFINGER"): 		return Symptom.BROKENFINGER;
				case("STUBBEDTOE"): 		return Symptom.STUBBEDTOE;
				case("COUGH"): 				return Symptom.COUGH;
				//If the symptom is invalid, inform the user and prompt them again
				default: 			System.out.print("Invalid symptom. ");		
			}
		}while(true);
	}
	
	//Function for obtaining a valid location
	public Location determineUserLocation()
	{
		//Declaring local variables
		String userLocation;
		
		//Present the possible locations to the user
		System.out.print("Valid locations in Regina are Northwest, North, Northeast, West, Central, East, Southwest, South and Southeast.\n");
		
		//Create a loop to obtain a valid location
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter your current location: ");
			userLocation = input.nextLine();
			
			//Analyze the given location
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
	
	//Function for obtaining a menu choice from the user
	public char obtainMenuChoice()
	{
		//Declaring local variables
		String inputString;
		char choice;
		boolean validChoice = false;

		//Present the possible choices to the user in a menu
		System.out.print("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\\n"
			+ "|Please indicate what you would like to do next:                           |\n"
			+ "|\t1. Determine the hospital nearest to your location                 |\n"
			+ "|\t2. Determine the hospital that can treat your symptom the quickest |\n"
			+ "|\t3. Determine the travel time to a specific hospital                |\n"
			+ "|\t4. Determine the wait time for a specific hospital                 |\n"
			+ "|\t5. Add myself to a hospital's emergency queue                      |\n"
			+ "|\t6. Update your symptom                                             |\n"
			+ "|\t7. Exit the program                                                |\n"
			+ "\\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/\n\n");
		
		//Create a loop that will run until the user enters a valid choice
		do
		{
			//Obtain the first character of the input string and ignore the rest of the string
			System.out.print("Please enter your selection: ");
			inputString = input.nextLine();
			choice = inputString.charAt(0);	
			
			//Evaluate the choice that was made
			switch(choice)
			{
				//If the given choice is permitted, exit the loop
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					validChoice = true;
					break;
				//If the given choice is not permitted, inform the user and prompt them again
				default:
					System.out.print("Invalid selection. ");
					break;
			}			
		}while(!validChoice);		
		
		//Return the user's valid choice		
		return choice;
	}
	
	//Main function
	public static void main(String[] args) 
	{
		//Declaring local variables
		Simulation userInterface = new Simulation();
		UserAccount user = new UserAccount();	
		String userName;
		int userAge;
		Gender userGender;
		Symptom userSymptom;
		Location userLocation;
		char menuChoice;
		boolean anotherSelection = true;
		
		//Welcome the user to the program
		System.out.println("Welcome to the hospital emergency queue management system.");
		System.out.println("For simplicity's sake, this app will only utilize the General and Pasqua hospitals.\n");
		
		//Obtain and set the user's name
		System.out.print("Please enter your name: ");
		userName = input.nextLine();
		user.setName(userName);
		
		//Obtain and set the user's age
		userAge = userInterface.determineUserAge();
		user.setAge(userAge);
		
		//Obtain and set the user's gender		
		userGender = userInterface.determineUserGender();
		user.setGender(userGender);
		
		//Obtain and set the user's symptom
		userSymptom = userInterface.determineUserSymptom();
		user.setCurrentSymptom(userSymptom);
		
		//Obtain and set the user's location
		userLocation = userInterface.determineUserLocation();
		user.setLocation(userLocation);	
		
		//Print the user's information to the console
		System.out.println("\nYour information is as follows: " + user.getName() + ", " + user.getAge() + ", " + user.getGender() + ". Experiencing " + user.getCurrentSymptom() + " in the " + user.getLocation() + " region of Regina.");
	
		//Create a loop that will allow the user to interact with the application for as long as they require
		do
		{			
			//Present a menu of options to the user and obtain the result
			menuChoice = userInterface.obtainMenuChoice();
			
			//Call the appropriate function based on the user's response
			switch(menuChoice)
			{
				//Determine the nearest hospital
				case '1':
					break;
					
				//Determine the hospital that can treat the user's symptom the quickest				
				case '2':
					break;
					
				//Determine the travel time to a specific hospital
				case '3':
					break;
					
				//Determine the wait time for a specific hospital
				case '4':
					break;
					
				//Add the user to a hospital's emergency queue
				case '5':
					break;
					
				//Update the user's symptom
				case '6':
					break;
					
				//Exit the program
				case '7':
					System.out.println("Goodbye!");
					anotherSelection = false;
			}
		}while(anotherSelection);
	}
}
