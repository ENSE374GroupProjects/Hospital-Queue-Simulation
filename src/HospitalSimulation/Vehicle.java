package HospitalSimulation;

public abstract class Vehicle 
{
	//Private variables
	private Location location;
	private int speed;
	
	//Default constructor
	public Vehicle()
	{
		this.location = Location.DEFAULT;
		this.speed = 0;
	}	
	
	//Initializing constructor
	public Vehicle(Location location, int speed)
	{
		this.location = location;
		this.speed = speed;
	}
	
	//Location getter
	public Location getLocation()
	{
		return this.location;
	}
	
	//Speed getter
	public int getSpeed()
	{
		return this.speed;
	}
}
