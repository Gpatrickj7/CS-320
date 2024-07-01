import java.util.ArrayList;



public class Task {
	
	
	public  Task() {
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String taskID;                                        //variables for holding task information
	
	public String taskName;
	
	public String taskDescription;
	
	protected ArrayList<Task> taskList = new ArrayList<Task>();           // ArrayList for storing task information internally. Protected variable so it is only directly accessible by Task Service
	
	
	
	public Task(String taskID, String taskName, String taskDescription) {
		
		//Validate.notNull(taskID, "Task ID cannot be NULL. ");            //commons.lang Validate function to add redundancy and disallows NULL values for any object parameters in this class or subclasses
		
		//Validate.notNull(taskName, "Task Name cannot be NULL. ");
		
		//Validate.notNull(taskDescription, "Task Description cannot be NULL. ");
		
		
		
	}
	
	
	
	
	
	
	
	public String setTaskID(String taskID) {      								 			//Setter for Task ID 
		
		
		if (getTaskID() != null) {              											 //checks if task ID is not null (meaning already set) and returns the task ID
			
			
			taskID = getTaskID();               											// this ensures that the task ID once set is unable to be updated
			
			
			return taskID;
			
			
			
			
		}
		
		
		this.taskID = taskID;       															//if the taskID passes the first check, sets the task ID for this to the user specified task ID
		
		
		
		if (taskID == null) {
			
			
			throw new NullPointerException("Invalid Task ID. ");            					//check for user input for task ID being null 
			
		}
		
		
		if (taskID.length() > 10) {
			
			
			
			throw new IllegalArgumentException("Invalid Task ID: Task ID too long. ");         //check for user input for task ID being too long
			
			
			
		}
		
		
		return taskID;
		
	}
	
	
	
	
	public String getTaskID( ) {             														//getter to get TaskID
		
		
		return taskID;
		
	}
	
	

	
	
	
	public String setTaskName(String taskName) {
		
		this.taskName = taskName;
		
		
		if (taskName == null) {                									 //checks if input task name is null and throws exception                                     
			
			
			throw new NullPointerException("Invalid input: Please enter a Task Name. ");
			
		}
		
		
		 
		
		
		
		if (taskName.length() > 20) {                                                //checks if input task name length is > 20 and throws exception
			
			
			throw new IllegalArgumentException("Invalid Task Name: Task Name too long. ");  
			
			
		}
		
		taskName = this.taskName;
		

		
		
		        // if checks are passed, sets taskName to user input
		
		
		
		
		return taskName;
		
		
	}
	
	
	
	public String getTaskName( ) {        //getter for task Name
		
		return taskName;
		
		
	}
	
	
	
	
	public String setTaskDescription(String taskDescription) {
		
		this.taskDescription = taskDescription;
		
		
		if (this.taskDescription.length() > 50) {                                    // checks if input task description is too long and throws exception
			
			
			throw new IllegalArgumentException("Invalid Task Description: Task Description too long. ");
			
			
			
		}
		
		
		
		if (this.taskDescription == null) {                                        // checks if input task description is null and throws exception
			
			
			throw new NullPointerException("Invalid Task Description: Please enter a Task Desciption. ");
			
			
			
		}
		
		this.taskDescription = taskDescription;                           // if checks are passed, sets Task Description to user input 
		
		
		return taskDescription;
	}

	
	
	public String getTaskDescription() {
		
		return this.taskDescription;
	}
	
	
	
	
	
	
	
	
	
	
	

}
