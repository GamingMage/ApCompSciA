package unit4circle;

/*
 * Name: Joseph Liang
 * Date: 1/25/21
 * Purpose: Create multiple circle objects and execute methods to compare and change them
 */

public class CircleRunner {

	public static double compareRadii(double x, double y) {
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
	public static double compareCircumferences(double x, double y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	
	public static void main(String[] args) {
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(3);
		
		System.out.println(circ1.toString());
		System.out.println(circ2.toString());
		
		System.out.println("The larger radius of the two circles is: " + compareRadii(circ1.getRadius(), circ2.getRadius()));
		System.out.println();

	}

}
