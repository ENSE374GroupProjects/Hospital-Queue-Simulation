package HospitalSimulation;

public class UserAccount
{
	/*==================ATTRIBUTES=================*/
	private int age;
	private String name;
	private Location currentLocation;
	private Gender gender;
	private String medicalHistory; // Change to List<Symptom> when implemented
	private Symptom currentSymptom;
	/*=============================================*/

	/*====================METHODS==================*/
	/*-----------------CONSTRUCTORS----------------*/
	/*Default*/
	public UserAccount()
	{
		this.age = 0;
		this.name = "Default User";
		this.currentLocation = Location.DEFAULT;
		this.gender = Gender.OTHER;
		this.medicalHistory = "No medical history";
		this.currentSymptom = Symptom.DEFAULT;
		
	}
	
	/*Initializer*/
	public UserAccount(int age, String name, Location currentLocation, Gender gender, String medicalHistory, Symptom currentSymptom)
	{
		this.age = age;
		this.name = name;
		this.currentLocation = currentLocation;
		this.gender = gender;
		this.medicalHistory = medicalHistory;
		this.currentSymptom = currentSymptom;
	}
	/*---------------------------------------------*/

	/*--------------------GETTERS------------------*/
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public Location getLocation()
	{
		return currentLocation;
	}
	
	public Symptom getCurrentSymptom()
	{
		return currentSymptom;
	}
	
	public String getMedicalHistory()
	{
		return medicalHistory;
	}
	/*---------------------------------------------*/
	
	/*--------------------SETTERS------------------*/
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	public void setLocation(Location location)
	{
		this.currentLocation = location;
	}
	
	public void setCurrentSymptom(Symptom symptom)
	{
		this.currentSymptom = symptom;
	}
	
	public void setMedicalHistory(String medicalHistory)
	{
		this.medicalHistory = medicalHistory;
	}
	/*---------------------------------------------*/

	/*showSymptoms()*/
	/*Display the medicalInfo Symptoms*/
	public void showMedicalHistory()
	{
		System.out.println("Pre-existing medical history: " + this.medicalHistory);
	}
	
	/*=============================================*/
	
	
}
