package day07.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        ArrayList<Integer> listofint = new ArrayList<Integer>();
        listofint.add(2);
        listofint.add(2);
        listofint.add(4);
        listofint.add(4);
        listofint.add(5);
        listofint.add(6);
        listofint.add(4);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(6);

        RemoveDuplicates remover = new RemoveDuplicates();
        remover.removeDuplicates(listofint);

        Assertions.assertEquals(expectedList, listofint);
    }
}
