package HospitalSimulation;
import java.util.*;

public class PriorityQueue 
{
	//Creates an array list using the UserAccount data type.
	private ArrayList<UserAccount> queue = new ArrayList();
	private int currentSize;
	
	public PriorityQueue() 
	{
		//Initializes a default Priority Queue
		currentSize = 0;
		queue.add(0, new UserAccount());
	}
	
	public void addPatient(UserAccount Patient)
	{
		//Add the patient to the queue
		currentSize++;
		queue.add(currentSize, Patient);
		percolateUp(currentSize);
	}
	
	private void percolateUp(int index)
	{
		//Check if there is an element in the heap.
		//If there is, we compare the priority of the user's parent.
		//If the priority of the parent is greater less than the priority of the new patient,
		//swap them and percolate up.
		if(((int)Math.floor(index/2) > 0) 
			&& (queue.get(index).getCurrentSymptom().getSeverityIndex()) 
				> (queue.get((int)Math.floor(index/2)).getCurrentSymptom().getSeverityIndex()))
		{
			//If there should be a swap, swap the child with its parent
			UserAccount temp = queue.get(index);
			
			//Use (int)Math.floor to get an integer rounded down.
			queue.set(index, queue.get((int)Math.floor(index/2)));
			queue.set((int)Math.floor(index/2), temp);
			
			//continue to percolate up.
			percolateUp((int)Math.floor(index/2));
		}
		else
			return; //Either the index was 0 or the parent's priority was larger.
	}
	
	private void percolateDown(int index)
	{
		//check if the size is too large.
		if (index*2 >= currentSize)
		{
			if (queue.get(index).getCurrentSymptom().getSeverityIndex() < queue.get(index*2).getCurrentSymptom().getSeverityIndex())
			{
				int swapIndex = 0;
				if ((index*2)+1 > currentSize) //If the right child is past the capacity
				{
					swapIndex = index*2;
				}
				else
					swapIndex = (queue.get(index*2).getCurrentSymptom().getSeverityIndex() 
								> queue.get((index*2)+1).getCurrentSymptom().getSeverityIndex() 
								? index*2 : ((index*2)+1));
				//check both of the children's severity and determine which is greater.
				
				//Swap the two nodes.
				UserAccount temp = queue.get(swapIndex);
				queue.set(index, temp);
				queue.set(swapIndex, queue.get(index));
				
				//Continue to check the tree.
				percolateDown(swapIndex);
			}
			//No swapping necessary
		}
		//The index was larger than the heap.
		return;
	}
	
	public int getTotalPriority()
	{
		int totalPriority = 0;
		for (int i=1; i<currentSize; i++)
		{
			//Add the severity of each patient in the queue and get their severity.
			totalPriority += queue.get(i).getCurrentSymptom().getSeverityIndex();
		}
		return totalPriority;
	}
	
	public int getTotalWait(Symptom userSeverity)
	{
		//Assume 4 minutes for each level of severity in the queue.
		int totalWait = 0;
		for (int i=1; i<currentSize; i++)
		{
			if (queue.get(i).getCurrentSymptom().getSeverityIndex() >= (userSeverity.getSeverityIndex()))
				totalWait += queue.get(i).getCurrentSymptom().getSeverityIndex() * 4;
			
			//Add the total wait only if the patient in the queue has a higher severity because they will be first in line.
			//Assume that each level of severity takes approximately 4 minutes for the hospital staff.
			//A critical injury of severity 5 will take approximately a 20 minute wait.
		}
		return totalWait;
	}
	
	public UserAccount Pop()
	{
			//Removes a patient from the queue.
		UserAccount temp = queue.get(1);
			//Set the first node to the last and reduce the size.
		queue.set(1, queue.get(currentSize));
		queue.remove(currentSize);
		currentSize--;
		if (currentSize >1)
			percolateDown(1);
		return temp;	//return the info for the user that was removed if their patient info is needed for the doctor.
	}
	
	
	public UserAccount findPatient(UserAccount Patient)
	{
		//Loop through the array and check if there is a similar patient in the queue.
		for (int i=1; i<currentSize; i++)
		{
			if (queue.get(i).getName().equals(Patient.getName()))
				return queue.get(i);
		}
		
		return (new UserAccount());
	}
}
