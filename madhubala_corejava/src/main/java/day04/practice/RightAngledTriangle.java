package day04.practice;

public class RightAngledTriangle extends Polygon {
	
	protected double a;
	protected double b;
	protected double c;

	
	public RightAngledTriangle(double a, double b,double c) throws Exception {
		super(4);
		if(a <= 0 || b <= 0 ||c<=0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	
	
	public double calculateArea() {
		return this.a + this.b+this.c;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	
	public double calculateCircumstance() {
		return this.a + this.b+this.c;
	}

}