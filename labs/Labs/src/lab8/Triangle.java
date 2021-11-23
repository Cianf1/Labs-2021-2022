package lab8;

public class Triangle extends TwoDShape{

	private double base, height;
	
	public Triangle(String name, String colour, double base, double height) {
		super(name, colour);
		this.base = base;
		this.height = height;
	}
	public double area() { 
		return 0.5 * base * height;
	}
	public String toString() { 
		return super.toString() + "Base: " + base + "Height: " + height;
	}
}
