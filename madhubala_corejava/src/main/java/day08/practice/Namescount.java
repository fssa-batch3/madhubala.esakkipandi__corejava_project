package day08.practice;
import java.util.HashMap;
import java.util.Scanner;

public class Namescount {

	
	public static void main(String[] args) {
		
		
		Scanner name=new Scanner(System.in);
		System.out.println("lkjhgfdfgh");
		String[] arr=new String[10];
		
		
	
			for( int i=0;i<arr.length;i++) {
				
				arr[i]=name.nextLine().toLowerCase();
				
				
			}

		HashMap<String,Integer> maps=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(maps.get(arr[i])==null) {
				
				maps.put(arr[i], 1);
			}
			else {
				int coun=maps.get(arr[i]);
				coun++;
				maps.put(arr[i],coun );
			}
		}
		
		System.out.println(maps);
		
		
	}
}
