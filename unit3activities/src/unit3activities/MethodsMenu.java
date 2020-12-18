package unit3activities;

import java.util.Scanner;
import java.lang.Math;

/*
 * Name: Joseph Liang
 * Date: 12/15/20
 * Purpose: Take a menu input and run the indicated activity method
 */

public class MethodsMenu {

	/**
	 * Take user input of the length and width of a rectangle. Pass the input to a
	 * method that returns the perimeter of the rectangle. Output the result.
	 * @param length
	 * @param width
	 * @return perimeter of given rectangle
	 */
	public static double rectPerimeter(double length, double width) {
		return (length*2 + width*2);
	}
	/**
	 * Take user input of the number of X’s that they would like to print. Pass this
	 * number to a method that prints that number of X’s.
	 * @param number
	 */
	public static void printX(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print("X");
		}
	}
	/**
	 * Take user input of the x and y coordinates of two different points. Pass the
	 * input to a method that returns the distance between the points. Output the
	 * result.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return distance between given points
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		double deltaX = Math.abs(x1 - x2);
		double deltaY = Math.abs(y1 - y2);
		double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
		return distance;
	}
	/**
	 * Take user input of a positive integer. Pass the input to a method that prints
	 * all of the divisors (factors) of that number.
	 * @param x
	 */
	public static void factor(int x) {
		System.out.print("The divisors of " + x + " are: ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	/**
	 * Print a triangle with a base indicated by the constant stored in this method
	 */
	public static void printTriangle() {
		//This constant should be odd
		final int BASE = 9;
		int n = 0;
		for (int i = 0; i <= BASE/2; i++) {
			for (int j = BASE/2 - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n; k++) {
				System.out.print("X");
			}
			n += 2;
			System.out.println("");
		}
	}
	/**
	 * Take user input of a number of seconds, and output the equivalent time in hours, mins, and seconds.
	 * @param sec
	 */
	public static void timeFromSec(int sec) {
		int hours = sec/60/60;
		sec -= hours*60*60;
		int mins = sec/60;
		sec -= mins*60;
		System.out.println("Hours: " + hours + "\nMinutes: " + mins + "\nSeconds: " + sec);
	}
	/**
	 * Take an integer and approximate the square root using an iterative method
	 * @param n
	 */
	public static void sqrtApprox(int n) {
		double x = 500;
		double y;
		int count = 0;
		boolean closeEnough = false;
		while (!closeEnough) {
			y = .5 * (x + (n/x));
			count++;
			System.out.println("Approximation " + count + " of the square root of " + n + " is " + y);
			if ((int)(y*1000000) == (int)(x*1000000)) {
				closeEnough = true;
				System.out.printf("The square root of " + n + " is approximately %.3f", y);
			}
			x = y;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int switchFlow = 0;
		double perim;
		double distance;
		
		System.out.println("Welcome!");
		while (switchFlow != 8) {
			System.out.println("Please choose which activity you want to run:\n1\t2\t3\n4\t5\t6\n7\t8(exit)");
			switchFlow = userInput.nextInt();
			
			switch (switchFlow) {
				case 1:
					System.out.print("\nActivity 1:\nPlease input the length and width of a rectangle: ");
					perim = rectPerimeter(userInput.nextDouble(), userInput.nextDouble());
					System.out.println("The perimeter of your rectangle is: " + perim + "\n");
					break;
				case 2: 
					System.out.print("\nActivity 2:\nPlease input the number of X's you wish to be printed: ");
					printX(userInput.nextInt());
					System.out.println("\n");
					break;
				case 3:
					System.out.print("\nActivity 3:\nPlease input two x y coordinate points in the form x y x y: ");
					distance = distance(userInput.nextDouble(), userInput.nextDouble(), userInput.nextDouble(), userInput.nextDouble());
					System.out.println("The distance between your points is " + distance + "\n");
					break;
				case 4:
					System.out.print("\nActivity 4:\nPlease enter a positive integer: ");
					factor(userInput.nextInt());
					System.out.println("\n");
					break;
				case 5:
					System.out.print("\nActivity 5:\n");
					printTriangle();
					System.out.println("");
					break;
				case 6:
					System.out.print("\nActivity 6:\nPlease enter a number of seconds: ");
					timeFromSec(userInput.nextInt());
					System.out.println("");
					break;
				case 7:
					System.out.print("\nActivity 7:\nPlease input a positive integer: ");
					sqrtApprox(userInput.nextInt());
					System.out.println("\n");
					break;
				case 8:
					//exit case
					System.out.print("Thank you for coming!");
					break;
				default:
					//if an input is given that is not on the menu
					System.out.println("\nThat is not a valid input. Try again.\n");
					break;	
			}
			
		}	
		
		userInput.close();

	}

}
