package HospitalSimulation;

import java.util.List;

public class UserAccount
{
	/*Attributes*/
	private int age;
	private String name;
	private Location currentLocation;
	private Gender gender;
	private String medicalInfo; // Change to List<Symptom> when implemented
	
	/*Methods*/
	/*Default Constructor*/
	public UserAccount()
	{
		this.age = 0;
		this.name = "Default User";
		this.currentLocation = Location.DEFAULT;
		this.gender = Gender.OTHER;
		this.medicalInfo = "No pre-existing symptoms";
		
	}
	
	/*Constructor*/
	public UserAccount(int age, String name, Location currentLocation, Gender gender, String medicalInfo)
	{
		this.age = age;
		this.name = name;
		this.currentLocation = currentLocation;
		this.gender = gender;
		this.medicalInfo = "No pre-existing symptoms";
	}
	
	/*showSymptoms():void*/
	/*Display the medicalInfo Symptoms*/
	public void showSymptoms()
	{
		System.out.println("Pre-existing medical history: " + this.medicalInfo);
	}
}
