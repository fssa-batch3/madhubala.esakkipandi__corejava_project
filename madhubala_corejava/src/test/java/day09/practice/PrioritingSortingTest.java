package day09.practice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrioritingSortingTest {

    @Test
    public void testPrioritySorting() {
        List<CustomTask> tasks = new ArrayList<>();
        tasks.add(new CustomTask(1, "Task A", LocalDate.of(2023, 7, 15), 3));
        tasks.add(new CustomTask(2, "Task B", LocalDate.of(2023, 7, 10), 2));
        tasks.add(new CustomTask(3, "Task C", LocalDate.of(2023, 7, 12), 1));

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("2,Task B,2,2023-07-10");
        expectedOutput.add("3,Task C,1,2023-07-12");
        expectedOutput.add("1,Task A,3,2023-07-15");

        Collections.sort(tasks, new TaskComparator());

        List<String> actualOutput = new ArrayList<>();
        for (CustomTask task : tasks) {
            actualOutput.add(task.getId() + "," + task.getName() + "," + task.getPriority() + "," + task.getDeadline());
        }

        assertEquals(expectedOutput, actualOutput);
    }
}
