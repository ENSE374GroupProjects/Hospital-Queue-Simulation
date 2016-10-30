package HospitalSimulation;

public enum Gender {
	MALE("Male"), FEMALE("Female"), OTHER("Other");
	private String gender;
	
	private Gender(String gender)
	{
		this.gender = gender;
	}
	
	public String toString()
	{
		return gender;
	}
}
