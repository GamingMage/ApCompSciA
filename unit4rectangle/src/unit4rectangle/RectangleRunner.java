package unit4rectangle;

/*
 * Name: Joseph Liang
 * Date: 1/25/21
 * Purpose: Create multiple rectangle objects and execute methods to compare and change them
 */

public class RectangleRunner {

	public static double compareLengths(double x, double y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	public static double compareAreas(double x, double y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	public static double comparePerimeters(double x, double y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 9.5);
		Rectangle rect3 = new Rectangle(-7, -1);
		
		System.out.println(rect1.toString());
		System.out.println(rect2.toString());
		
		System.out.println("The larger length of the two rectangles is: " + compareLengths(rect1.getLength(), rect2.getLength()));
		System.out.println("The larger area of the two rectangles is: " + compareAreas(rect1.getArea(), rect2.getArea()));
		System.out.println("The larger perimeter of the two rectangles is: " + comparePerimeters(rect1.getPerimeter(), rect2.getPerimeter()));
		
		rect2.setLength(1);
		rect2.setWidth(.5);
		System.out.println(rect2.toString());
		
		System.out.println("The larger length of the two rectangles is: " + compareLengths(rect1.getLength(), rect2.getLength()));
		System.out.println("The larger area of the two rectangles is: " + compareAreas(rect1.getArea(), rect2.getArea()));
		System.out.println("The larger perimeter of the two rectangles is: " + comparePerimeters(rect1.getPerimeter(), rect2.getPerimeter()));
		
		System.out.println(rect3.toString());

	}

}
