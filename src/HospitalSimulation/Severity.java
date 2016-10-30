package HospitalSimulation;

public enum Severity 
{
	//Valid severities
	CRITICAL("Critical", 5), 
	VERYURGENT("Very Urgent", 4), 
	URGENT("Urgent", 3), 
	STANDARD("Standard", 2), 
	MINOR("Minor", 1);
	
	//Local variables
	private String gender;
	private int severity;
	
	//Constructor
	private Severity(String gender, int severity)
	{
		this.gender = gender;
		this.severity = severity;
	}
	
	//Return the enumerated type as a string
	public String toString()
	{
		return gender;
	}
	
	//Return the severity index of the enumerated type
	public int getSeverityIndex()
	{
		return severity;
	}
}
