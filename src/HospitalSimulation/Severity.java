package HospitalSimulation;

public enum Severity {
	CRITICAL("Critical", 5), VERYURGENT("Very Urgent", 4), URGENT("Urgent", 3), STANDARD("Standard", 2), MINOR("Minor", 1);
	private String gender;
	private int severity;
	
	private Severity(String gender, int severity)
	{
		this.gender = gender;
		this.severity = severity;
	}
	
	public String toString()
	{
		return gender;
	}
	
	public int toInt()
	{
		return severity;
	}
}
