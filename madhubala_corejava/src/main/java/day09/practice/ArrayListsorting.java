package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListsorting {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number of integers to sort:");
        int n = num.nextInt();
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (count < n) {
            System.out.println("Enter an integer:");
            int number = num.nextInt();
            arr.add(number);
            count++;
        }

        ArrayList<Integer> sortedArr = sortArrayList(arr);
        for (int n1 : sortedArr) {
            System.out.println(n1);
        }
    }

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> input) {
        Collections.sort(input);
        return input;
    }
}
