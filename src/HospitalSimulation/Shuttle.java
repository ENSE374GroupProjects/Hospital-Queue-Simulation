package HospitalSimulation;
import java.text.DecimalFormat;

public class Shuttle extends Vehicle 
{
	//Private variables
	double fare;
	private static DecimalFormat currencyFormat = new DecimalFormat("#0.00");
	
	//Default constructor
	public Shuttle()
	{		
		//Pass along specific shuttle information to the super constructor
		super(Location.DEFAULT, 1);		//Shuttles travel at civilian speed
		
		//Set the default cost to 0
		this.fare = 0;
	}	
	
	//Initializing constructor
	public Shuttle(Location location)
	{
		//Pass along specific shuttle information to the super constructor
		super(location, 1);		//Shuttles travel at civilian speed
		
		//Set the default cost to 0
		this.fare = 0;
	}
	
	//Set the shuttle's cost
	public void setFare(int travelTime)
	{
		this.fare = 1.5 * travelTime;
		System.out.println("The cost of the shuttle will be $" + currencyFormat.format(this.fare));
	}
	
	//Pay the shuttle's fare
	public void payFare()
	{
		System.out.println("You have arrived at your destination. Thank you for paying the fare.");
		this.fare = 0;
	}	
}
