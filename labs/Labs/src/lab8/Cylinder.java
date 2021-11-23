package lab8;

public class Cylinder extends ThreeDShape {
	
	private double radius;
	private double height;
	
	public Cylinder(String name, String colour, double radius, double height) {
		super(name,colour);
		this.radius = radius;
		this.height = height;
	}
	public double area() {
		return 2 * radius * Math.PI * radius + 2 * radius * radius; 
	}
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
}
