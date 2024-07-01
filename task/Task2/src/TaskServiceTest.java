


import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class TaskServiceTest {
	@Test
	void testAddTask( ) {
		
		TaskService task = new TaskService("Testing", "Appointment", "Testing the adding of a new task to the arraylist, taskList.");
		
		
		
		task.AddTask("Testing", "Appointment", "Testing the adding of a new task to the taskList.");
		
		//this assertion checks that the taskList is not empty following the adding of a new task. It is by default empty
		assertFalse(task.taskList.isEmpty());
	}
	

	
	@Test
	void testgetTask() {
		
		TaskService task = new TaskService("Testing", "Appointment", "Testing the adding of a new task to the arraylist, taskList.");
		
		task.AddTask("Testing0", "Appointment", "Testing the adding of a new task to the taskList.0");
		
		task.AddTask("Testing1", "Appointment1", "Testing the adding of a new task to the taskList.1");
		
		task.AddTask("Testing2", "Appointment2", "Testing the adding of a new task to the taskList.2");
		
		
		
		assertFalse(task.taskList.isEmpty());
		
		
		
		
		task.getTask("Testing0");
		
		task.getTask("Testing1");
		
		task.getTask("Testing2");
		
		task.getTask("NotInList");
		
		
		assertFalse(task.getTask("Testing0")==null);
		
		
		
	}
	
	@Test
	void testremoveTask() {
		
		TaskService task = new TaskService("Testing", "Appointment", "Testing the adding of a new task to the arraylist, taskList.");
		
		task.AddTask("Testing0", "Appointment", "Testing the adding of a new task to the taskList.0");
		
		task.AddTask("Testing1", "Appointment1", "Testing the adding of a new task to the taskList.1");
		
		task.AddTask("Testing2", "Appointment2", "Testing the adding of a new task to the taskList.2");
		
		
		
		
		task.getTask("Testing0");
		
		task.getTask("Testing1");
		
		task.getTask("Testing2");
		
		
		task.removeTask("Testing1");
		
		task.getTask("Testing1");
		
		assertTrue(task.getTask("Testing1")==null);
		
	}
	
	
	
	@Test
	void testUpdateTask() {
		
		TaskService task = new TaskService("Testing", "Appointment", "Testing the adding of a new task to the arraylist, taskList.");
		
		
		//adds tasks 
		task.AddTask("Testing0", "Appointment", "Testing the adding of a new task to the taskList.0");
		
		task.AddTask("Testing1", "Appointment1", "Testing the adding of a new task to the taskList.1");
		
		task.AddTask("Testing2", "Appointment2", "Testing the adding of a new task to the taskList.2");
		
		//gets task for manual verification
		task.getTask("Testing0");
		
		//this assertion calls get task first which is the old info and asserts that the objects for that taskID are not the same following the call for UpdateTask
		assertFalse(task.getTask("Testing0") == task.UpdateTask("Testing0"));
		
		
		
	}
	
	
		
	

	

}
