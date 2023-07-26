package Mypractice;

import java.util.ArrayList;
import java.util.List;

class TaskList {
	private static final TaskList[] TaskList = null;
	String name;
	int age;

	public TaskList(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;

	}
	
	public static boolean findtaskname(String name,List <TaskList> tasks) {
		
		
		for(TaskList task:tasks) {
			
			
			if(name.equals(task.getName())) {
				return true;
				
			}
		}
		return false;
		
		
	}

}

public class arrays2 {

	public static void main(String[] args) {

		ArrayList<TaskList> arr = new ArrayList<TaskList>();
		
		arr.add(new TaskList("task1",21) );
		
		arr.add(new TaskList("task2",21));
		
		boolean s=TaskList.findtaskname("task1",arr);
System.out.println(s);

	}

	
}
