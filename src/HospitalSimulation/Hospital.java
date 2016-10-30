package HospitalSimulation;

public class Hospital 
{
	
	private Location hospitalLocation;
	private String hospitalName;
	private PriorityQueue queue;

	public Hospital() 
	{
		//Set up a Priority Queue for the hospital.
		queue = new PriorityQueue();
	}
	
	public Hospital(String name, Location location)
	{
		//Construct a hospital with a given location and give it a queue
		hospitalName = name;
		hospitalLocation = location;
		queue = new PriorityQueue();
	}
	
	public void setName(String newName)
	{
		hospitalName = newName;	//Set the hospital name.
	}
	
	public void setLocation(Location newLocation)
	{
		hospitalLocation = newLocation;	//Set the hospital location.
	}
	
	public String getName()
	{
		return hospitalName;	//return the hospital name.
	}
	public Location getLocation()
	{
		return hospitalLocation;	//return the hospital location.
	}
	
	public PriorityQueue getQueue()
	{
		return queue;		//return the hospital queue.
	}
	
	public int determineTravelTime(Location userLocation)
	{
		//Assuming a 5 minute travel time between each district in the city.
		//This switch case will fall through the cases to determine how long the user would take
		//to get to the hospital.
		
		if(this.hospitalLocation == Location.CENTRAL)
		{
			//This determines the travel time to the general hospital based on the user's location.
			switch(userLocation)
			{
				case CENTRAL: return 0;
				case EAST:
				case NORTH:
				case WEST:
				case SOUTH: return 5;
				case NORTHEAST:
				case NORTHWEST:
				case SOUTHEAST:
				case SOUTHWEST: return 10;
			}	
		}
		//This determines the travel time to the pasqua hospital based on the user's location.
		else if(this.hospitalLocation == Location.WEST)
		{
			switch(userLocation)
			{
				case WEST: return 0;
				case NORTHWEST:
				case SOUTHWEST:
				case CENTRAL: return 5;
				case NORTH:
				case SOUTH:
				case EAST:return 10;
				case NORTHEAST:
				case SOUTHEAST: return 15;
			}	
		}
		return -1;
	}
}
