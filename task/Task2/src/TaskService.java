import java.util.ListIterator;

public class TaskService extends Task {                                 
	
	java.util.Scanner scnr = new java.util.Scanner(System.in);         //scanner for user inputs

	public TaskService(String taskID, String taskName, String taskDescription) {
		
		super(taskID, taskName, taskDescription);
		
		// TODO Auto-generated constructor stub
	}
	
	public TaskService() {
		
	}
	
	public TaskService AddTask(String taskID, String taskName, String taskDescription) {
		
		TaskService newTask = new TaskService(this.taskID, this.taskName, this.taskDescription);          //similar fucntion to AddContact from contactService
		
		
		newTask.setTaskID(taskID);
		
		newTask.setTaskName(taskName);
		
		newTask.setTaskDescription(taskDescription);
		
		taskList.add(newTask);
		
		System.out.print("New Task Added. Task ID: ");
		
		System.out.println(taskID + ". ");
		
		System.out.println("---------------------------------"
				+ 		 "-------------------------------------");
		
		return newTask;
	}
	
	
	
	public TaskService RemoveTask(String taskID) {
		
		System.out.println("Removing Task (" + taskID + ") ");
		
		
		for (ListIterator<Task> iter = taskList.listIterator(); iter.hasNext();) {         //for loop to iterate over contactList if it is populated 
			
			

			
			
			if (iter.next().getTaskID().compareTo(taskID) == 0) {            // if statement to check if next elements ID matches the specified contactId
				
				iter.remove();             //removes the element that matches the specified contactID
				
			}
		}
		
		
		
		
		return null;
	}
	
	
	
	public TaskService UpdateTask(String taskID) {                                             //essentially the same code from contactService. Tests correctly here
		
		
		TaskService task = new TaskService(this.taskID, this.taskName, this.taskDescription);
		
		String newtaskName;
		
		String newtaskDescription;
		
		System.out.println("Updating task information for " + taskID + ". ");
		
		System.out.println("");
		
		
		
		
		System.out.println("Enter updated Task Name:   ");
		
		newtaskName = scnr.next();
		
		System.out.println("Enter updated Task Description:  ");
		
		newtaskDescription = scnr.next();
		
		
		
		
		System.out.println("Updated Task Name: " + newtaskName);
		
		
		System.out.println("Updated Task Description: " + newtaskDescription);
		
		
		
		
		for (ListIterator<Task> iter = taskList.listIterator(); iter.hasNext();) {       //same for loop to iterate over taskList
			
			

			
			
			if (iter.next().getTaskID().compareTo(taskID) == 0) {        				//if statement to check if next elements taskID matches the specified taskID
				
				//task.RemoveTask(taskID);
				
				//task.AddTask(taskID, newtaskName, newtaskDescription);
				
				//taskID = this.taskID;
				
				//taskName = newtaskName;
				
				//taskDescription = newtaskDescription;
				
				//taskID = this.taskID;
				
				//task.setTaskName(newtaskName);
				
				//task.setTaskDescription(newtaskDescription);
				
				int i = taskList.indexOf(iter.previous());     								//index of matching taskID
				
				taskList.remove(i);                            								//removes the entire element from this list
				
				taskList.add(i, this.AddTask(taskID, newtaskName, newtaskDescription));    //adds it right back in its old position with the same taskID but new info
				
				

				
				System.out.println("Task Information updated for " + taskID + ". ");
				
				System.out.println("");
				
				System.out.println("---------------------------------"
						+ 		 "-------------------------------------");
				
				
				
				break;
				
			}
		
		
		
		
		
		
		
		
		
		}
		return task;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

	public TaskService getTask(String taskID) {                                             //Getter for Task directly from ArrayList. Keeps exposure to the actual list limited to setting and getting a specific task. 
																							// This comes directly from your feedback so let me know if it what you had in mind. 
		
		
		TaskService task = new TaskService();
		
		
		for (ListIterator<Task> iter = taskList.listIterator(); iter.hasNext();) {         //for loop to iterate over taskList if it is populated 
			
			

			
			
			if (iter.next().getTaskID().compareTo(taskID) == 0) {  							//checks next element of array list for a match to taskID
				
				int i = taskList.indexOf(iter.previous());        							 //if it is a match, iterate back to matching taskId and set i to that elements index
				
				//System.out.println(taskList.get(i));
				
				this.taskID = taskID;
				
				System.out.println("Getting Task: " + this.taskID);
				
				System.out.println("Task found... ");
				
				System.out.println("---------------------------------"
						+ 		 "-------------------------------------");
				
				System.out.println("Task ID:  "  + this.taskID);
				
				System.out.print("Task Name: ");
				
				System.out.println(taskList.get(i).getTaskName());               			//uses i to access the taskLast at index i and gets taskName and taskDescription 
				
				System.out.print("Task Description:  ");
				
				System.out.println(taskList.get(i).getTaskDescription());        
				
				System.out.println("---------------------------------"
						+ 		 "-------------------------------------");         			//basic console formatting 
				task.taskID = taskID;
				
				task.taskName = taskList.get(i).getTaskName();
				
				task.taskDescription = taskList.get(i).getTaskDescription();
				
				
				break;
				
				
				
				
				
			} else {
				
				if(taskList.size() == iter.nextIndex()) {             					//loop to check if size of taskList equals the index of the next element 
															
																						//I struggled a bit with this section, did not research outside sources much but came to this solution. I am sure there is a better way
					
					System.out.println("Task not found...");
					
					System.out.println("---------------------------------"
							+ 		 "-------------------------------------");
				}
			}
		}
		return task;
		
	}
	
	
	
	
	
	
	public TaskService removeTask(String taskID) {
	
	
		for (ListIterator<Task> iter = taskList.listIterator(); iter.hasNext();) {         //for loop to iterate over taskList if it is populated 
		
		

		
		
			if (iter.next().getTaskID().compareTo(taskID) == 0) {                //same loop and comparison as all taskService methods for iterating over the taskList
				
				
				System.out.print("Removing Task:  ");
				
				System.out.println(taskID);
			
				int i = taskList.indexOf(iter.previous());          //uses i to store index of matching taskId
				
				taskList.remove(i);                         //removes the element at index i
				
				
			
				
			
				
				System.out.println("---------------------------------"
					+ 		 "-------------------------------------");
			
				break;
			
			
			
			
			
			
		} else {
			
			if(taskList.size() == iter.nextIndex()) {
				
			
			
				System.out.println("Task not found...");
			}
		}
	}
		
	return null;
}
}
		
	
	
	

	
	
	
	
	
	
	


