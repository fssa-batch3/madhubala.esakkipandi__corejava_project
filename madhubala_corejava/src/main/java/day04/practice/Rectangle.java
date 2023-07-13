package day04.practice;



public class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	
	

	
	
	
	public double calculateCircumstance() {
		return 2*(this.length+this.breadth) ;
	}

}