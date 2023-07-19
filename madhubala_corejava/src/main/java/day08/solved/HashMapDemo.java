package day08.solved;

import java.util.TreeMap;

public class HashMapDemo {
public static void main(String[] args) {
	

			TreeMap<String, Integer> deptMap = new TreeMap<String, Integer>();
			deptMap.put("HR", 5);
			deptMap.put("ADMIN", 10);
			deptMap.put("DEVELOPERS", 300);

	
			for (String deptName : deptMap.keySet()) {

				Integer count = deptMap.get(deptName);
				System.out.println("Department Name:" + deptName + " and Employee Count :" + count);
			}


}
}
