package HospitalSimulation;

public enum Gender 
{
	//Valid genders
	MALE("Male"), 
	FEMALE("Female"), 
	OTHER("Other");
	
	//Local variable
	private String gender;
	
	//Constructor
	private Gender(String gender)
	{
		this.gender = gender;
	}
	
	//Return the enumerated type as a string
	public String toString()
	{
		return gender;
	}
}
