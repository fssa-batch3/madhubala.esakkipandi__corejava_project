package day06.practice;
import java.util.ArrayList;
import java.util.List;

public class Arraylistone {

public static void main(String[] args) {
	
	
	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
	List<String> cityList2 = new ArrayList<String>();
	
	
	
for(String element:cityList) {
	
	if(!cityList2.contains(element)) {
		
		cityList2.add(element);
		
	}
	
}

System.out.println(cityList2);
	
	
}

	
	
}
