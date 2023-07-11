package day04.practice;

public class DemoOfPlogon {

	
	public static void main(String[] args) {
		
		
		try {
			Polygon rectangle=new Rectangle(8.3,20.3);
			Polygon rightangletri=new RightAngledTriangle(15,20,30);
System.out.println(rectangle.calculateArea());
System.out.println(rectangle.calculateCircumstance());

System.out.println(rightangletri.calculateCircumstance());

			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
