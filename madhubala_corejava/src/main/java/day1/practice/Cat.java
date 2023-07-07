package day1.practice;

import java.util.Scanner;

import java.util.Scanner;

class Cat {
   
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

     
       int n = input.nextInt();

     
       int[] array = new int[n];

 System.out.println(n);
       int numOfInputs = input.nextInt();
       for (int i = 0; i < numOfInputs; i++) {
           array[i] = input.nextInt();
       }

       for (int i = 0; i < n; i++) {
           System.out.println(array[i]);
       }
   }
}
