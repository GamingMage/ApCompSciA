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
		Circle circ3 = new Circle(-1);
		
		System.out.println(circ1);
		System.out.println(circ2);
		
		System.out.println("The larger radius of the two circles is: " + compareRadii(circ1.getRadius(), circ2.getRadius()));
		System.out.printf("The larger area of the two circles is: %.2f\n", compareAreas(circ1.getArea(), circ2.getArea()));
		System.out.printf("The larger circumference of the two circles is: %.2f\n", compareCircumferences(circ1.getCircumference(), circ2.getCircumference()));
		
		circ2.setRadius(10);
		System.out.println(circ2);
		
		System.out.println("The larger radius of the two circles is: " + compareRadii(circ1.getRadius(), circ2.getRadius()));
		System.out.printf("The larger area of the two circles is: %.2f\n", compareAreas(circ1.getArea(), circ2.getArea()));
		System.out.printf("The larger circumference of the two circles is: %.2f\n", compareCircumferences(circ1.getCircumference(), circ2.getCircumference()));
		
		System.out.println(circ3);
		
	}

}
