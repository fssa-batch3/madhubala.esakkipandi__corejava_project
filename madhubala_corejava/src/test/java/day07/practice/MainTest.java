package day07.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class MainTest {

    @Test
    public void testDeduplication() {
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Task 1", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 2", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 1", LocalDate.parse("2023-07-15")));
        tasksList.add(new Task("Task 3", LocalDate.parse("2023-07-16")));
        tasksList.add(new Task("Task 2", LocalDate.parse("2023-07-15")));

        HashSet<Task> uniqueTasksSet = new HashSet<>(tasksList);
        tasksList = new ArrayList<>(uniqueTasksSet);

        Assertions.assertEquals(3, tasksList.size());

        Task task1 = new Task("Task 1", LocalDate.parse("2023-07-15"));
        Task task2 = new Task("Task 2", LocalDate.parse("2023-07-15"));
        Task task3 = new Task("Task 3", LocalDate.parse("2023-07-16"));

        Assertions.assertTrue(tasksList.contains(task1));
        Assertions.assertTrue(tasksList.contains(task2));
        Assertions.assertTrue(tasksList.contains(task3));
    }
}
