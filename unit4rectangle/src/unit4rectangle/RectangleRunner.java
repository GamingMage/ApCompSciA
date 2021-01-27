package unit4rectangle;

/*
 * Name: Joseph Liang
 * Date: 1/25/21
 * Purpose: Create multiple rectangle objects and execute methods to compare and change them
 */

public class RectangleRunner {

	public static void compareLengths(Rectangle rect1, Rectangle rect2) {
		double x = rect1.getLength(); 
		double y = rect2.getLength();
		if (x > y) {
			System.out.println("The larger length of the two rectangles is: " + x);
			return;
		}
		System.out.println("The larger length of the two rectangles is: " + y);
	}
	public static void compareAreas(Rectangle rect1, Rectangle rect2) {
		double x = rect1.getArea(); 
		double y = rect2.getArea();
		if (x > y) {
			System.out.println("The larger area of the two rectangles is: " + x);
			return;
		}
		System.out.println("The larger area of the two rectangles is: " + y);
	}
	public static void comparePerimeters(Rectangle rect1, Rectangle rect2) {
		double x = rect1.getPerimeter(); 
		double y = rect2.getPerimeter();
		if (x > y) {
			System.out.println("The larger perimeter of the two rectangles is: " + x);
			return;
		}
		System.out.println("The larger perimeter of the two rectangles is: " + y);
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 9.5);
		Rectangle rect3 = new Rectangle(-7, -1);
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		compareLengths(rect1, rect2);
		compareAreas(rect1, rect2);
		comparePerimeters(rect1, rect2);
		
		rect2.setLength(1);
		rect2.setWidth(.5);
		System.out.println(rect2);
		
		compareLengths(rect1, rect2);
		compareAreas(rect1, rect2);
		comparePerimeters(rect1, rect2);
		
		System.out.println(rect3);

	}

}
