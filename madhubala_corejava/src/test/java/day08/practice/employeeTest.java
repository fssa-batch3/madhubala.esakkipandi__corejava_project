package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class employeeTest {

    @Test
    public void testEmployeeSorting() {
        String n = "HR,Ram\n" + "HR,Suresh\n" + "IT,Basker\n" + "IT,Joseph\n" + "Admin,Sundar";

        HashMap<String, TreeSet<String>> expectedEmployeeMap = new HashMap<>();
        expectedEmployeeMap.put("Admin", new TreeSet<String>() {{ add("Sundar"); }});
        expectedEmployeeMap.put("HR", new TreeSet<String>() {{ add("Ram"); add("Suresh"); }});
        expectedEmployeeMap.put("IT", new TreeSet<String>() {{ add("Basker"); add("Joseph"); }});

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        employee.main(new String[0]);

        System.setOut(System.out); 

        String actualOutput = outputStream.toString().trim();
        String[] outputLines = actualOutput.split(System.lineSeparator());
        Map<String, TreeSet<String>> actualEmployeeMap = new HashMap<>();

        for (String line : outputLines) {
            String[] parts = line.split(":");
            String department = parts[0].trim();
            String employees = parts[1].trim();
            TreeSet<String> employeeSet = new TreeSet<>();
            for (String emp : employees.split(",")) {
                employeeSet.add(emp.trim());
            }
            actualEmployeeMap.put(department, employeeSet);
        }

        Assertions.assertEquals(expectedEmployeeMap, actualEmployeeMap);
    }
}
