package HospitalSimulation;

public enum Severity 
{
	//Valid severities
	//Each severity has a related integer value used for the priority queue.
	CRITICAL("Critical", 5), 
	VERYURGENT("Very Urgent", 4), 
	URGENT("Urgent", 3), 
	STANDARD("Standard", 2), 
	MINOR("Minor", 1),
	DEFAULT("Default", 0);
	
	//Local variables
	private String name;
	private int severity;
	
	//Constructor
	private Severity(String name, int severity)
	{
		this.name = name;
		this.severity = severity;
	}
	
	//Return the enumerated type as a string
	public String toString()
	{
		return this.name;
	}
	
	//Return the severity index of the enumerated type
	public int getSeverityIndex()
	{
		return this.severity;
	}
}
