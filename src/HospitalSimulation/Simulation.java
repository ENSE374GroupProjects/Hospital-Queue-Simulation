package HospitalSimulation;
import java.util.ArrayList;
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
			+ "|\t1. Determine the facility nearest to your location                 |\n"
			+ "|\t2. Determine the facility that can treat your symptom the quickest |\n"
			+ "|\t3. Determine the travel time to a specific facility                |\n"
			+ "|\t4. Determine the wait time for a specific facility                 |\n"
			+ "|\t5. Add myself to a hospital's emergency queue                      |\n"
			+ "|\t6. Request an ambulance to take me to a hospital                   |\n"
			+ "|\t7. Add myself to a clinic's waitlist                               |\n"
			+ "|\t8. Request a shuttle to take me to a hospital or clinic            |\n"
			+ "|\t9. Update your symptom                                             |\n"
			+ "|\t0. Exit the program                                                |\n"
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
				case '8':
				case '9':
				case '0':
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
	
	//Function to determine the user's hospital choice
	public Hospital determineHospitalChoice(ArrayList<Hospital> Hospitals)
	{
		//Declaring local variables
		String inputString;
		
		//Create a loop to obtain a valid integer value
		do
		{
			//Prompt the user and store their input
			System.out.print("Please enter a hospital: ");
			inputString = input.nextLine();
						
			//Try to match the string input to a valid hospital name.
			for (int i=0; i<Hospitals.size(); i++)
			{
				if (inputString.toUpperCase().equals(Hospitals.get(i).getName().toUpperCase()))
				{
					return Hospitals.get(i);
				}
			}
			//Inform the user if their selection is invalid
			System.out.print("Invalid hospital. ");
		}while(true);
	}
		
	//Main function
	public static void main(String[] args) 
	{
		//Declaring the user interface, user, hospital list and vehicle list
		Simulation userInterface = new Simulation();
		UserAccount user = new UserAccount();	
		ArrayList<Hospital> Hospitals = new ArrayList<Hospital>();
		ArrayList<Ambulance> Ambulances = new ArrayList<Ambulance>();
		ArrayList<Shuttle> Shuttles = new ArrayList<Shuttle>();
		
		//Declaring local variables
		String userName;
		int userAge;
		Gender userGender;
		Symptom userSymptom;
		Location userLocation;
		char menuChoice;
		boolean anotherSelection = true;
		
		//Instantiate the list of hospitals
		Hospitals.add(0, new Hospital("General", Location.CENTRAL)); //General is index 0
		Hospitals.add(1, new Hospital("Pasqua", Location.WEST));	 //Pasqua is index 1
		
		//Create some dummy accounts to represent current patients in the queue
		UserAccount dummyPatient1 = new UserAccount(20, "Quinn", Location.NORTH, Gender.MALE, "Quinn's Medical History", Symptom.STUBBEDTOE);				//MINOR severity
		UserAccount dummyPatient2 = new UserAccount(20, "Tristan", Location.SOUTHEAST, Gender.MALE, "Tristan's Medical History", Symptom.CARDIACARREST);	//CRITICAL severity
		UserAccount dummyPatient3 = new UserAccount(21, "Jon", Location.SOUTHWEST, Gender.MALE, "Jon's Medical History", Symptom.CHESTPAIN);				//VERYURGENT severity	
		UserAccount dummyPatient4 = new UserAccount(78, "Leanne", Location.CENTRAL, Gender.FEMALE, "Leanne's Medical History", Symptom.FEVER);				//URGENT severity
		UserAccount dummyPatient5 = new UserAccount(19, "Armin", Location.NORTHWEST, Gender.MALE, "Armin's Medical History", Symptom.SPRAIN);				//STANDARD severity
		
		//Add the dummy users to the General hospital
		Hospitals.get(0).getQueue().addPatient(dummyPatient1);
		Hospitals.get(0).getQueue().addPatient(dummyPatient2);
		
		//Add the dummy users to the Pasqua hospital
		Hospitals.get(1).getQueue().addPatient(dummyPatient3);
		Hospitals.get(1).getQueue().addPatient(dummyPatient4);
		Hospitals.get(1).getQueue().addPatient(dummyPatient5);
		
		//Instantiate the list of vehicles
		Ambulances.add(new Ambulance(Location.NORTHWEST));
		Shuttles.add(new Shuttle(Location.SOUTHEAST));
		
		System.out.println("Ambulance Test: " + Ambulances.get(0).getLocation() + " " + Ambulances.get(0).getSpeed());
		System.out.println("Shuttle Test: " + Shuttles.get(0).getLocation() + " " + Shuttles.get(0).getSpeed());
				
		System.out.println("Available?" + Ambulances.get(0).isAvailable());
		Ambulances.get(0).setDestination(Location.CENTRAL);		
		Ambulances.get(0).siren();
		Ambulances.get(0).travel();
		Ambulances.get(0).setPassenger(dummyPatient5);
		Ambulances.get(0).saveLife();
		System.out.println("Available?" + Ambulances.get(0).isAvailable());
		Ambulances.get(0).travel();
		Ambulances.get(0).setDestination(Location.EAST);
		Ambulances.get(0).travel();
		Ambulances.get(0).siren();
		System.out.println("Available?" + Ambulances.get(0).isAvailable());
				
		//Welcome the user to the program
		System.out.println("Welcome to the hospital emergency queue management system.");
		System.out.println("For simplicity's sake, this app will only utilize the General and Pasqua hospitals.\n");
		
		//Obtain and set the user's name
		System.out.print("Please enter your name: ");
		userName = userInterface.input.nextLine();
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
				//Determine the nearest facility
				case '1':
				{
					//Set the default hospital to the General
					Hospital nearestHospital = Hospitals.get(0);
					for (int i=1; i<Hospitals.size(); i++)
					{
						//Loop through the remaining hospitals in the list to determine if they are closer.
						if (Hospitals.get(i).determineTravelTime(user.getLocation()) < nearestHospital.determineTravelTime(user.getLocation()))
						{
							nearestHospital = Hospitals.get(i);		//Update the nearest
						}
					}
					System.out.println("The nearest hospital is the " + nearestHospital.getName() + " Hospital.");
					break;
				}
					
				//Determine the facility that can treat the user's symptom the quickest				
				case '2':
				{
					//Default to the first hospital
					Hospital fastestTreatment = Hospitals.get(0);
					int travelTime = Hospitals.get(0).determineTravelTime(user.getLocation());			//Determine the travel time to the hospital from the user's location
					int waitTime = Hospitals.get(0).getQueue().getTotalWait(user.getCurrentSymptom());	//Determine the specific hospital's wait time
					int totalWaitTime =  waitTime + travelTime;
					int fastestWaitTime = totalWaitTime;												//Default fastest wait time.
					
					//Analyze the remaining hospitals in the list
					for (int i=1; i<Hospitals.size(); i++)
					{
						travelTime = Hospitals.get(i).determineTravelTime(user.getLocation());			//Determine the travel time to the hospital from the user's location
						waitTime = Hospitals.get(i).getQueue().getTotalWait(user.getCurrentSymptom());	//Determine the specific hospital's wait time
						totalWaitTime =  waitTime + travelTime;
						
						if (totalWaitTime < fastestWaitTime)
						{
							fastestTreatment = Hospitals.get(i);
							fastestWaitTime = totalWaitTime;
						}
					}
					System.out.println("The hospital that can treat your symptom the fastest is the " + fastestTreatment.getName() + " Hospital.");
					break;
				}
					
				//Determine the travel time to a specific facility
				case '3':
				{
					Hospital desiredHospital = userInterface.determineHospitalChoice(Hospitals);
					System.out.println("It will take " + desiredHospital.determineTravelTime(user.getLocation()) + " minutes to get to the " + desiredHospital.getName() + " Hospital.");
					break;
				}
					
				//Determine the wait time for a specific facility
				case '4':
				{
					Hospital desiredHospital = userInterface.determineHospitalChoice(Hospitals);
					System.out.println("It will take " + desiredHospital.getQueue().getTotalWait(user.getCurrentSymptom()) + " minutes for the " + desiredHospital.getName() + " Hospital to help you.");
					break;
				}
					
				//Add the user to a hospital's emergency queue
				case '5':
				{
					Hospital desiredHospital = userInterface.determineHospitalChoice(Hospitals);
					desiredHospital.getQueue().addPatient(user);
					System.out.println("You were added to the " + desiredHospital.getName() + " hospital's Queue! See you in " + desiredHospital.determineTravelTime(user.getLocation()) + " minutes!");
					break;
				}
				
				//Request an ambulance
				case '6':
				{
					System.out.println("Implement ambulance request here.");
					break;
				}
				
				//Add the user to a clinic's waitlist
				case '7':
				{
					System.out.println("Implement clinic waitlist here.");
					break;
				}
				
				//Request a shuttle
				case '8':
				{
					System.out.println("Implement shuttle request here.");
					break;
				}
					
				//Update the user's symptom
				case '9':
				{
					userSymptom = userInterface.determineUserSymptom();
					user.setCurrentSymptom(userSymptom);
					break;
				}
					
				//Exit the program
				case '0':
				{
					System.out.println("Goodbye!");
					anotherSelection = false;
				}
			}
		}while(anotherSelection);
	}
}
