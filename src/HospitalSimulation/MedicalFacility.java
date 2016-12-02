package HospitalSimulation;

public abstract class MedicalFacility {
	
	private Location location;
	private String name;
	private PriorityQueue queue;

	public MedicalFacility() 
	{
		//Set up a Priority Queue for the facility.
		queue = new PriorityQueue();
	}
	
	public MedicalFacility(String name, Location location)
	{
		//Construct a facility with a given location and give it a queue
		this.name = name;
		this.location = location;
		queue = new PriorityQueue();
	}
	
	public void setName(String newName)
	{
		name = newName;	//Set the facility name.
	}
	
	public void setLocation(Location newLocation)
	{
		location = newLocation;	//Set the facility location.
	}
	
	public String getName()
	{
		return name;	//return the facility name.
	}
	public Location getLocation()
	{
		return location;	//return the facility location.
	}
	
	public PriorityQueue getQueue()
	{
		return queue;		//return the facility queue.
	}
}
