package unit2activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/19/20
 * Purpose: Take inputs from the user, and use if statements to branch the code for different inputs
 */

public class Unit2SmallActivities {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int x, y;
		int score;
		int testInt;
		String evenOdd = "ODD";
		String posNegZero = "ZERO";
		final int SECRET = 14;
		int guess;
		double a, b, c;
		double x1, x2;
		
		//Activity 1: Enter two integers and print the larger of the two. If they are equal, say so
		System.out.print("Please enter two integer values: ");
		x = userInput.nextInt();
		y = userInput.nextInt();
		if (x > y) {
			System.out.println(x + " is the larger value.");
		} else if (y > x) {
			System.out.println(y + " is the larger value.");
		} else {
			System.out.println("The two numbers are euqal!");
		}
		
		//Activity 2: Print VALID for any test score on [0,100] and INVALID for any other value
		System.out.print("\n\nPlease input your test score from 0 to 100: ");
		score = userInput.nextInt();
		if (score >= 0 && score <= 100) {
			System.out.println("\nVALID");
		} else {
			System.out.println("\nINVALID");
		}
		
		//Activity 3: Take an integer and output if it is even/odd, positive/negative
		System.out.print("\n\nPlease enter an integer: ");
		testInt = userInput.nextInt();
		if (testInt%2 == 0) {
			evenOdd = "EVEN";
		}
		if (testInt > 0) {
			posNegZero = "POSITIVE";
		} else if (testInt < 0) {
			posNegZero = "NEGATIVE";
		}
		System.out.println(testInt + " is " + evenOdd + " and " + posNegZero + ".");
		
		//Activity 4: Ask the user to guess a secret constant on [0,20]
		System.out.print("\n\nPick an integer between 1 and 20: ");
		guess = userInput.nextInt();
		if (guess >= 1 && guess <= 20) {
			if (guess == SECRET) {
				System.out.println("Congratulations! You guessed my number!");
			} else if (Math.abs(SECRET - guess) <= 2) {
				System.out.println("So close! Try again!");
			} else {
				System.out.println("Wow... That's not even close.");
			}
		} else {
			System.out.println("What are you doing?! That value is not even in the range I asked for!");
		}
		
		//Activity 5: Take inputs for a quadratic and output the solutions. Be able to deal with a negative (b^2 - 4ac) term
		System.out.print("\n\nPlease input the the coefficients of your quadractic in the form of ax^2 + bx + c\na = ");
		a = userInput.nextDouble();
		System.out.print("b = ");
		b = userInput.nextDouble();
		System.out.print("c = ");
		c = userInput.nextDouble();
		
		if ((Math.pow(b, 2) - 4*a*c) >= 0) {
			//calculate the two solutions of the given quadratic
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			
			System.out.println("\nYour equation is: " + a + "x^2 + " + b + "x + " + c);
			System.out.print("The solutions for your equation are: " + x1 + ", " + x2);
		} else {
			System.out.println("\nYour equation is: " + a + "x^2 + " + b + "x + " + c);
			System.out.println("There are no real solutions to your quadratic.");
		}
		
		userInput.close();

	}

}
