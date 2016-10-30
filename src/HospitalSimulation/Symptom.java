package HospitalSimulation;

public enum Symptom {
	/*CRITICAL Symptoms*/
	CARDIACARREST(Severity.CRITICAL, "Cardiac Arrest"),
	RESPIRATORYARREST(Severity.CRITICAL, "Respiratory Arrest"),
	
	/*VERYURGENT Symptoms*/
	SHORTBREATH(Severity.VERYURGENT, "Shortness of Breath"),
	CHESTPAIN(Severity.VERYURGENT, "Chest Pain"),
	
	/*URGENT Symptoms*/
	FEVER(Severity.URGENT, "Fever"),
	ABDOMINALPAIN(Severity.URGENT, "Abdominal Pain"),
	
	/*STANDARD Symptoms*/
	SPRAIN(Severity.STANDARD, "Sprain"),
	BROKENFINGER(Severity.STANDARD, "Broken Finger"),
	
	/*MINOR Symptoms*/
	STUBBEDTOE(Severity.MINOR, "Stubbed Toe"),
	COUGH(Severity.MINOR, "Cough");
	
	private Severity severity;
	private String name;
	
	/*Constructor*/
	private Symptom(Severity severity, String name)
	{
		this.severity = severity;
		this.name= name;
	}
	
	public int getSeverityIndex()
	{
		return this.severity.getSeverityIndex();
	}
	
	public String getSeverity()
	{
		return this.severity.toString();
	}
	
	public String toString()
	{
		return name;
	}
}
