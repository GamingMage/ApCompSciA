package unit4circle;

/*
 * Name: Joseph Liang
 * Date: 1/25/21
 * Purpose: Create multiple circle objects and execute methods to compare and change them
 */

public class CircleRunner {

	public static void compareRadii(Circle circ1, Circle circ2) {
		double x = circ1.getRadius();
		double y = circ2.getRadius();
		if (x > y) {
			System.out.println("The larger radius of the two circles is: " + x);
			return;
		}
		System.out.println("The larger radius of the two circles is: " + y);
	}
	public static void compareAreas(Circle circ1, Circle circ2) {
		double x = circ1.getArea();
		double y = circ2.getArea();
		if (x > y) {
			System.out.printf("The larger area of the two circles is: %.2f\n", x);
			return;
		}
		System.out.printf("The larger area of the two circles is: %.2f\n", y);
	}
	public static void compareCircumferences(Circle circ1, Circle circ2) {
		double x = circ1.getCircumference();
		double y = circ2.getCircumference();
		if (x > y) {
			System.out.printf("The larger circumference of the two circles is: %.2f\n", x);
			return;
		}
		System.out.printf("The larger circumference of the two circles is: %.2f\n", y);
	}
	
	public static void main(String[] args) {
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(3);
		Circle circ3 = new Circle(-1);
		
		System.out.println(circ1);
		System.out.println(circ2);
		
		compareRadii(circ1, circ2);
		compareAreas(circ1, circ2);
		compareCircumferences(circ1, circ2);
		
		circ2.setRadius(10);
		System.out.println(circ2);
		
		compareRadii(circ1, circ2);
		compareAreas(circ1, circ2);
		compareCircumferences(circ1, circ2);
		
		System.out.println(circ3);
		
	}

}
