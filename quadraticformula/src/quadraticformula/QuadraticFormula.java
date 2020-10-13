package quadraticformula;

import java.util.Scanner;
import java.lang.Math;

/*
 * Name: Joseph Liang
 * Date: 10/13/20
 * Purpose: Take inputs of the coefficients of a quadratic equation, and output the solutions of the quadratic
 */

public class QuadraticFormula {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double a, b, c;
		double x1, x2;
		
		//take inputs for the quadratic
		System.out.print("Please input the the coefficients of your quadractic in the form of ax^2 + bx + c\na = ");
		a = userInput.nextDouble();
		System.out.print("b = ");
		b = userInput.nextDouble();
		System.out.print("c = ");
		c = userInput.nextDouble();
		
		//calculate the two solutions of the given quadratic
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		System.out.println("\nYour equation is: " + a + "x^2 + " + b + "x + " + c);
		System.out.print("The solutions for your equation are: " + x1 + ", " + x2);
		
		userInput.close();

	}

}
