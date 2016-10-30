package HospitalSimulation;
import java.util.*;

public class PriorityQueue 
{
	
	private ArrayList<UserAccount> queue = new ArrayList();
	private int currentSize;
	
	public PriorityQueue() 
	{
		currentSize = 0;
	}
	
	public void addPatient(UserAccount Patient)
	{
		if (currentSize == 0)
		{
			currentSize++;
			queue[currentSize] = Patient;
		}
		else
		{
			currentSize++;
			queue[currentSize] = Patient;
			perculateUp(currentSize);
		}
		return;
	}
	
	private void perculateUp(int index)
	{
		if(index > 0 && (queue[index] > queue[(int)Math.floor(index/2)]))
		{
			int temp = queue[index];
			queue[index] = queue[(int)Math.floor(index/2)];
			queue[(int)Math.floor(index/2)] = temp;
			perculateUp((int)Math.floor(index/2));
		}
		else
			return;
	}
	
	public int getTotalPriority()
	{
		int totalPriority = 0;
		for (int i=1; i<currentSize; i++)
		{
			//Assume each patient has approximately 5 minute wait time.
			totalPriority += 1;
		}
		return totalPriority;
	}
	
	public int getTotalWait

}
