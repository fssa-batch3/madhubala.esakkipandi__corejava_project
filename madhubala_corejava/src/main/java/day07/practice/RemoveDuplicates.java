package day07.practice;
import  java.util.ArrayList;
import  java.util.HashSet;


public class RemoveDuplicates {

	
	
	
	public static void main(String[] args) {

		
		
		
		ArrayList<Integer> listofint=new ArrayList<Integer>();
		listofint.add(2);
		listofint.add(2);
		listofint.add(4);
		listofint.add(4);
		listofint.add(5);
		listofint.add(6);
		listofint.add(4);

		System.out.println(listofint);
		
		
		HashSet<Integer> setint=new HashSet<Integer>();
		setint.add(2);
		setint.add(2);
		setint.add(3);
		setint.add(4);
		setint.add(5);
		setint.add(6);
		setint.add(7);
		System.out.println(setint);
		
	}
}
