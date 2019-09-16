package chapter10.exercise10_13;

public class Triangle extends TwoDimensionalShape{

	private int length;
	private int breadth;
	
	public Triangle(int length, int breadth) {
		super(length, breadth);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public double getArea() {
		return super.getLength() * super.getBreadth();
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f%n", 
				"The area of a Triangle",
				getArea());
	}
}
