package overloadingmethods;

/*
 * Name: Joseph Liang
 * Date: 12/22/20
 * Purpose: Create overloaded methods and output their results in a clear way
 */

public class OverloadingMethods {
	
	public static double findMean(int a, int b, int c) {
		return (a + b + c)/3.0;
	}
	public static double findMean(int a, int b, int c, int d) {
		return (a + b + c + d)/4.0;
	}
	public static int changeNumOrNot(int x) {
		return Math.abs(x);
	}
	public static int changeNumOrNot(double x) {
		return (int)x;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 20;
		int d = 25;
		int x = -5;
		double y = 3.14159;
		
		System.out.println("The mean with three values is: " + findMean(a, b, c));
		System.out.println("The mean with four values is: " + findMean(a, b, c, d));
		
		System.out.println("\nThe absolute value of " + x + " is: " + changeNumOrNot(x));
		System.out.println("The truncated integer version of " + y + " is: " + changeNumOrNot(y));

	}

}
