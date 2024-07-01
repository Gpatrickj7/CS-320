

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;





class TaskTest extends Task {
	







	@Test
	void testTaskClassSetTaskID(){
		
		
		Task task = new Task();           // task object
		
		
		task.setTaskID("1234567");        //set task ID
		
		
		assertTrue(task.getTaskID().equals("1234567"));    //verifies task ID is set correctly
		

		
		}
	
	
	@Test 
	void testTaskClassGetTaskID() {
		
		Task task = new Task();              						//task object
		
		task.setTaskID("1234567890");       					 //set task ID
		
		
		System.out.println(task.getTaskID());   				//Uses the Getter for TaskId and prints task id 
		
		
		assertTrue(task.getTaskID().equals("1234567890"));    //verifies task ID is set correctly
		
		
		
	}
	
	@Test
	void testTaskClassSetTaskName() {
		
		Task task = new Task();           						//task object
		
		task.setTaskName("Appointment") ;   					//set task name
		
		
		assertTrue(task.getTaskName().equals("Appointment"));    //verifies task name is set correctly 
		
	}
	
	
	@Test 
	void testTaskClassGetTaskName() {
		
		Task task = new Task();       					//task object
		
		
		task.setTaskName("Appointment");        	//set task name
		
		
		System.out.println(task.getTaskName());          //Uses the Getter for Task Name and prints task name
		
		
		assertTrue(task.getTaskName().equals("Appointment"));    //verifies task name is set correctly
		
		
		
	}
	
	
	
	
	@Test
	void testTaskClassSetTaskDescription() {
		
		Task task = new Task();       													//task object
		
		
		task.setTaskDescription("Meeting with Dr. X at 2:30 PM");           			//Set task Description  
		
		
		assertTrue(task.getTaskDescription().equals("Meeting with Dr. X at 2:30 PM"));   //verifies task description is set correctly
		
	}

	
	@Test 
	void testTaskClassGetTaskDescription() {
		
		Task task = new Task();                                            //task object
		
		
		task.setTaskDescription("Meeting with Dr. X at 2:30 PM");        //set task description
		
		
		System.out.println(task.getTaskDescription());						//Uses Getter for task description
		
		
		assertTrue(task.getTaskDescription().equals("Meeting with Dr. X at 2:30 PM"));    //verifies task description is set correctly
		
		
		
	}
	
	
	
	
	
	
	
	@Test
	void testTaskIdTooLong() {
		
		Task task = new Task();
		
		
		
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			task.setTaskID("OverTenCharacters");  
			                                                  								// task ID too long
		}); 
	}
	
	
	
	@Test
	void testTaskNameTooLong() {
		
		Task task = new Task();
		
		
		
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			task.setTaskName("OverTwentyCharacters  ");  
			                                                  								// task Name too long
		}); 
	}
	
	
	
	@Test
	void testTaskDescriptionTooLong() {
		
		Task task = new Task();                           								//task object 
		
		
		
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			task.setTaskDescription("Task Description is not allowed to be over fifty characters in length. "
					+ "That includes whitespace for spaces which the .length method counts as a character.");
					
			                                                  															// task description too long
		}); 
	}
	
	@Test
	void testTaskIdNULL( ) {
		
		Task task = new Task();                                                   //task object 
		
		
		
		Assertions.assertThrows(NullPointerException.class, ()-> {
																					//Task ID set to NULL
			
			task.setTaskID(null);
			
		}); 
		
	}
	
	
	@Test
	void testTaskNameNULL( ) {
		
		Task task = new Task();
		
		
		
		Assertions.assertThrows(NullPointerException.class, ()-> {
																					//Task Name set to NULL
			
			task.setTaskName(null);
			
		}); 
		
	}
	
	
	
	
	@Test
	void testTaskDescriptionNULL( ) {
		
		Task task = new Task();
		
		
		
		Assertions.assertThrows(NullPointerException.class, ()-> {
																					//Task Description set to NULL
			
			task.setTaskDescription(null);
			
		}); 
		
	}
	
	
	
	


}
