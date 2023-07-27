package day08.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Namescount {

    public Map<String, Integer> processAndReturnMap(Scanner scanner) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine().toLowerCase();

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        return map;
    }
}
