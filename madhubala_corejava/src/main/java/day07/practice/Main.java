package day07.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {
    private String name;
    private LocalDate deadline;

    public Task(String name, LocalDate deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

  
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task otherTask = (Task) obj;
        return name.equals(otherTask.name) && deadline.equals(otherTask.deadline);
    }

   
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + deadline.hashCode();
        return result;
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasksList = new ArrayList<Task>();
        tasksList.add(new Task("Task 1", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 2", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 1", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 3", LocalDate.parse("2023-07-16")));
        tasksList.add(new Task("Task 2", LocalDate.parse("2023-07-15")));

        System.out.println("Duplicates Tasks:");
        for (Task task : tasksList) {
        	
            System.out.println(task.getName() + " - " + task.getDeadline());
        }

        HashSet<Task> uniqueTasksSet = new HashSet<Task>(tasksList);
        tasksList = new ArrayList<Task>(uniqueTasksSet);

        System.out.println("Unique Tasks:");
        for (Task task : tasksList) {
            System.out.println(task.getName() + " - " + task.getDeadline());
        }
    }
}












