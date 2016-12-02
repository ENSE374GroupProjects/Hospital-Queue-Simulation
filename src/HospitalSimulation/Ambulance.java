package HospitalSimulation;

public class Ambulance extends Vehicle 
{
	//Private variables
	private boolean sirenOn;
	
	//Initializing constructor
	public Ambulance(Location location)
	{		
		//Pass along specific ambulance information to the super constructor
		super(location, 2);		//Ambulances travel faster due to emergencies
		
		//Siren should be off by default
		sirenOn = false;
	}
	
	//Function to model saving a patient's life
	public void saveLife()
	{
		System.out.println("The ambulance is saving your life!");
	}
	
	//Function to toggle the siren
	public void siren()
	{
		//Inform the user of the change
		System.out.print("The ambulance's siren has been turned ");
		
		if(sirenOn == true)
		{
			System.out.println("off.");
		}
		else
		{
			System.out.println("on.");
		}
		
		//Toggle the siren
		sirenOn = !sirenOn;
	}
}
