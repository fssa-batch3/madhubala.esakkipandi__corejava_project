package day06.practice;


import java.util.List;
import java.util.ArrayList;

public class TaskList {
    private String name;
    private int priority;
    
    public TaskList(String name,  int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    public String getName() {
        return name;
    }
    
    
    public int getPriority() {
        return priority;
    }
    
    public static void main(String[] args) {
    	
        ArrayList<TaskList> taskList = new ArrayList<TaskList>();
        
        taskList.add(new TaskList("Task 1 : excercise",  1));
        taskList.add(new TaskList("Task 2 : yoga",  2));
        taskList.add(new TaskList("Task 3 : jogging",  3));
        
        for (TaskList task : taskList) {
        	
            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getPriority());
           
        }
    }
}


