package day1.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;
    private String speak;
    // Constructor
    public Cat(int age, String color,String speak) {
        this.age = age;
        this.color = color;
        this.speak = speak;
    }

   

	// Getters and setters
    public int age() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public String getspeak() {
    	
        return speak;
        
    }
    
   
		public void getspeak(String speak) {
			
			
			this.speak = speak;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat(12, "purple","Meow!");
        Cat cat2 = new Cat(14, "blue","Meow!");

        // Print the attributes of each Dog
        System.out.println("cat 1:");
        System.out.println("Age " + cat1.age());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.getspeak());
        System.out.println("cat 2:");
        System.out.println("Age " + cat2.age());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat2.getspeak());
    }
}