package day03.practice;

 class Employee {
int id;
String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;       
      
    }
}

public class TestEmployee {	 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");  
        System.out.println("id="+e1.id+","+"   name="+e1.name);
        System.out.println("id="+e2.id+","+"   name="+e2.name);


    }
}