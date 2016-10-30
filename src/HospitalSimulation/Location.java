package HospitalSimulation;

public enum Location 
{
	//Valid locations
	NORTHWEST("northwest"), 
	NORTH("north"), 
	NORTHEAST("northeast"), 
	WEST("west"), 
	CENTRAL("central"), 
	EAST("east"), 
	SOUTHWEST("southwest"), 
	SOUTH("south"), 
	SOUTHEAST("southwest"),
	DEFAULT("default location");
	
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
