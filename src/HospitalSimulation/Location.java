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
	
	//Converting the enumerated type to a string
	public String toString()
	{
		return this.location;
	}
}
