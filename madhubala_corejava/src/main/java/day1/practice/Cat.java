package day1.practice;

import java.util.Scanner;

import java.util.Scanner;

public class Cat {
   
    private int Stripes;
    private String color;
    private String speaks;

    public int getStripes() {
        return Stripes;
    }

    public void setStripes(int Stripes) {
        this.Stripes = Stripes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String setspeaks() {
        return speaks;
    }

    public void setspeaks(String speaks) {
        this.speaks = speaks;
    }
    

    public static void main(String[] args) {
      
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setStripes(4);
        cat1.setspeaks("Meow!");
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setStripes(3);
        cat2.setspeaks("Meow!");

        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getStripes());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.setspeaks());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getStripes());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat2.setspeaks());
    }
    
}
    
    
    
    