package day08.practice;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.junit.Test;

public class NameCountTest {

    @Test
    public void testNamesCount() {
        String input = "John\nalice\nBob\nALICE\nAlice\nMary\nmary\nMary\nBOB\njohn";
        Scanner scanner = new Scanner(input);

        Namescount namescount = new Namescount();

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("john", 2);
        expectedMap.put("alice", 4);
        expectedMap.put("bob", 2);
        expectedMap.put("mary", 3);

        assertEquals(expectedMap, namescount.processAndReturnMap(scanner));
    }
}
