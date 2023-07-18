package day08.practice;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class employee {
    public static void main(String[] args) {
        String n = "HR,Ram\n" + "HR,Suresh\n" + "IT,Basker\n" + "IT,Joseph\n" + "Admin,Sundar";

        HashMap<String, TreeSet<String>> listOfEmployee = new HashMap<String, TreeSet<String>>();

        String[] lines = n.split("\n");

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                String dep = parts[0].trim();
                String empName = parts[1].trim();

                TreeSet<String> empDet = listOfEmployee.get(dep);
                if (empDet == null) {
                    empDet = new TreeSet<String>();
                    listOfEmployee.put(dep, empDet);
                }

                empDet.add(empName);
            }
        }

        TreeMap<String, TreeSet<String>> sortedListOfEmployee = new TreeMap<String, TreeSet<String>>(listOfEmployee);

        for (String dep : sortedListOfEmployee.keySet()) {
            TreeSet<String> employees = sortedListOfEmployee.get(dep);
            System.out.println(dep + ": " + String.join(", ", employees));
        }
    }
}
