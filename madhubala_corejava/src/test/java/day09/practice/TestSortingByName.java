package day09.practice;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortingByName {

    @Test
    public void testTaskSortingByName() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task C", LocalDate.of(2023, 7, 15)));
        tasks.add(new Task(2, "Task B", LocalDate.of(2023, 7, 10)));
        tasks.add(new Task(3, "Task A", LocalDate.of(2023, 7, 12)));

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("3,Task A,2023-07-12");
        expectedOutput.add("2,Task B,2023-07-10");
        expectedOutput.add("1,Task C,2023-07-15");

        Collections.sort(tasks, new NameComparator());

        List<String> actualOutput = new ArrayList<>();
        for (Task task : tasks) {
            actualOutput.add(task.getId() + "," + task.getName() + "," + task.getDeadline());
        }

        assertEquals(expectedOutput, actualOutput);
    }
}
