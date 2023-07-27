package day09.practice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsortingTest {

    @Test
    public void testArrayListSorting() {
        int n = 5;
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4, 2, 1, 3, 5));

        ArrayList<Integer> actualOutput = ArrayListsorting.sortArrayList(input);

        ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expectedOutput, actualOutput);
    }
}
