package day06.solved;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day06.practice.Arraylistone;

public class ArraylistoneTest {

    @Test
    public void testRemoveDuplicates() {
        List<String> cityList = new ArrayList<String>(Arrays.asList("Chennai", "Bangalore", "Mumbai", "Mumbai"));
        List<String> expected = new ArrayList<String>(Arrays.asList("Chennai", "Bangalore", "Mumbai"));

        List<String> actual = Arraylistone.removeDuplicates(cityList);

        Assert.assertEquals(expected, actual);
    }
}
