package unit4circle;

public class Circle {
	private double radius;
	private final double PI = Math.PI;
	
	public Circle(double r) {
		setRadius(r);
	}
	public Circle() {
		this(5);
	}
	
	public String toString() {
		return "The circle has a radius of " + radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if (r > 0) {
			radius = r;
		}else {
			radius = 5;
		}
	}
}
