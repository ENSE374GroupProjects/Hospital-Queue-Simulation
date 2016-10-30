package HospitalSimulation;

public class Simulation 
{
	public static void main(String[] args) 
	{
		//Welcome the user to the program
		System.out.println("Welcome to the hospital emergency queue management system.");
		System.out.println("For simplicity's sake, this app will only utilize the General and Pasqua hospitals.");
		
		//Obtain the user's current location
		System.out.println("\nPlease enter your current location: ");
		
		//Test the location enum
		Location myLocation = Location.NORTH;		
		System.out.println(myLocation.toString());
	}
}
