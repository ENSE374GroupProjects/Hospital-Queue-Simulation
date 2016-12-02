package HospitalSimulation;

public class Shuttle extends Vehicle 
{
	//Initializing constructor
	public Shuttle(Location location)
	{
		//Pass along specific shuttle information to the super constructor
		super(location, 1);		//Shuttles travel at civilian speed
	}
}
