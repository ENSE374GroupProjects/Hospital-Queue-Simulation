package HospitalSimulation;

public enum Location 
{
	//Valid locations
	NORTHWEST("Northwest"), 
	NORTH("North"), 
	NORTHEAST("Northeast"), 
	WEST("West"), 
	CENTRAL("Central"), 
	EAST("East"), 
	SOUTHWEST("Southwest"), 
	SOUTH("South"), 
	SOUTHEAST("Southwest"),
	DEFAULT("Default location");
	
	//Local variable
	private String location;
	
	//Constructor
	private Location(String location)
	{
		this.location = location;
	}
	
	//Return the enumerated type as a string
	public String toString()
	{
		return this.location;
	}
}
