package day09.practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsorting {
		
public static void main(String[] args) {
	
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a interger value");
	int n=num.nextInt();
	int count=0;
	ArrayList<Integer> arr=new ArrayList<Integer>();
	while(count<n) {
		int number=num.nextInt();
	arr.add(number);

		count++;
	}
	
	Collections.sort(arr);
	for(int n1:arr) {
		System.out.println(n1);
		
	}
	
}
	
}
