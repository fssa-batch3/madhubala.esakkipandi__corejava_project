package day06.practice;
import java.util.ArrayList;
import java.util.List;

 class Task {
    private String name;
    
    public Task(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public static boolean findTaskByName(String name, List<Task> tasks) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));

        String nameToFind = "Task 2";
        boolean found = Task.findTaskByName(nameToFind, tasks);
        System.out.println("Task '" + nameToFind + "' found: " + found);
    }


}
