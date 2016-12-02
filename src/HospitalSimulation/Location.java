package HospitalSimulation;

public enum Location 
{
	//Valid locations
	NORTHWEST("Northwest", 1, 1), 
	NORTH("North", 1, 2), 
	NORTHEAST("Northeast", 1, 3), 
	WEST("West", 2, 1), 
	CENTRAL("Central", 2, 2), 
	EAST("East", 2, 3), 
	SOUTHWEST("Southwest", 3, 1), 
	SOUTH("South", 3, 2), 
	SOUTHEAST("Southwest", 3, 3),
	DEFAULT("Default location", 0, 0);
	
	//Local variable
	private String location;
	private int xCoordinate, yCoordinate;
	
	//Constructor
	private Location(String location, int xCoordinate, int yCoordinate)
	{
		this.location = location;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	//Return the enumerated type as a string
	public String toString()
	{
		return this.location;
	}
	
	//Return xCoordinate
	public int getXCoordinate()
	{
		return this.xCoordinate;
	}
	
	//Return yCoordinate
	public int getYCoordinate()
	{
		return this.yCoordinate;
	}
}
