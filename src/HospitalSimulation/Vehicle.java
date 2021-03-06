package HospitalSimulation;

public abstract class Vehicle 
{
	//Private variables
	private Location location;
	private int speed;
	private Location destination;
	private UserAccount passenger;
	
	//Default constructor
	public Vehicle()
	{
		this.location = Location.DEFAULT;
		this.speed = 0;
		this.destination = Location.DEFAULT;
		this.passenger = null;
	}	
	
	//Initializing constructor
	public Vehicle(Location location, int speed)
	{
		this.location = location;
		this.speed = speed;
		this.destination = Location.DEFAULT;
		this.passenger = null;
	}
	
	//Set the vehicle's destination
	public void setDestination(Location destination)
	{
		this.destination = destination;
	}
	
	//Set the vehicle's destination
	public void setPassenger(UserAccount passenger)
	{
		this.passenger = passenger;
	}
	
	//Determine if the vehicle is available for transport
	public boolean isAvailable()
	{
		return (this.passenger == null);
	}
	
	//Allow the vehicle to travel
	public void travel()
	{
		if(this.destination == null)
		{
			//If no new destination is set, inform the user and do nothing
			System.out.println("No destination has been set.");
		}
		
		else if(this.destination == this.location)
		{
			//If the vehicle is already at the destination
			System.out.println("The vehicle is already in the " + this.destination.toString() + " part of the city.");
		}
		else
		{
			//Move the vehicle to the destination
			System.out.println("Moving from " + location.toString() + " to " + destination.toString() + ".");
			this.location = this.destination;
			this.destination = null;			
			
			//If a passenger was along for the ride, drop them off
			if(this.passenger != null)
			{
				this.passenger.setLocation(this.location);
				this.passenger = null;
			}
		}
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
	
	//Destination getter
	public Location getDestination()
	{
		return this.destination;
	}
}
