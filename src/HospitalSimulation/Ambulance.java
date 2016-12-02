package HospitalSimulation;

public class Ambulance extends Vehicle 
{
	//Initializing constructor
	public Ambulance(Location location)
	{
		//Pass along specific ambulance information to the super constructor
		super(location, 2);		//Ambulances travel faster due to emergencies
	}
}
