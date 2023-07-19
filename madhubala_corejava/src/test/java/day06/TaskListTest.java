package day06;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import day06.practice.TaskList;

public class TaskListTest {

    @Test
    public void testTaskListCreation() {
        TaskList task1 = new TaskList("Task 1 : exercise", 1);
        TaskList task2 = new TaskList("Task 2 : yoga", 2);
        TaskList task3 = new TaskList("Task 3 : jogging", 3);

        assertEquals("Task 1 : exercise", task1.getName());
        assertEquals(1, task1.getPriority());

        assertEquals("Task 2 : yoga", task2.getName());
        assertEquals(2, task2.getPriority());

        assertEquals("Task 3 : jogging", task3.getName());
        assertEquals(3, task3.getPriority());
    }

    @Test
    public void testTaskListPrint() {
        List<TaskList> taskList = new ArrayList<>();
        taskList.add(new TaskList("Task 1 : exercise", 1));
        taskList.add(new TaskList("Task 2 : yoga", 2));
        taskList.add(new TaskList("Task 3 : jogging", 3));

        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Name: Task 1 : exercise\n");
        expectedOutput.append("Description: 1\n");
        expectedOutput.append("Name: Task 2 : yoga\n");
        expectedOutput.append("Description: 2\n");
        expectedOutput.append("Name: Task 3 : jogging\n");
        expectedOutput.append("Description: 3\n");

        StringBuilder actualOutput = new StringBuilder();
        for (TaskList task : taskList) {
            actualOutput.append("Name: ").append(task.getName()).append("\n");
            actualOutput.append("Description: ").append(task.getPriority()).append("\n");
        }

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }
}
