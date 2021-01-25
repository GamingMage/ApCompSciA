package unit4rectangle;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	public Rectangle() {
		this(3, 2);
	}
	
	public String toString() {
		return "The rectangle has a length of " + length + " and a width of " + width + ".";
	}
	
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return length + length + width + width;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double l) {
		if (l > 0) {
			length = l;
		}else {
			length = 3;
		}
	}
	public void setWidth(double w) {
		if (w > 0) {
			width = w;
		}else {
			width = 2;
		}
	}
}
