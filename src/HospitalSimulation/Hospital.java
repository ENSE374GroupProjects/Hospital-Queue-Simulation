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
}
