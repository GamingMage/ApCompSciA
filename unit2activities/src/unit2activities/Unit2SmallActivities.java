package unit2activities;

import java.util.Scanner;

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
		
		//Enter two integers and print the larger of the two. If they are equal, say so
		System.out.print("Please enter two integer values: ");
		x = userInput.nextInt();
		y = userInput.nextInt();
		if (x > y) {
			System.out.println("\n" + x + " is the larger value.");
		} else if (y > x) {
			System.out.println("\n" + y + " is the larger value.");
		} else {
			System.out.println("\nThe two numbers are euqal!");
		}
		
		//Print VALID for any test score on [0,100] and INVALID for any other value
		System.out.print("\n\nPlease input your test score from 0 to 100: ");
		score = userInput.nextInt();
		if (score >= 0 && score <= 100) {
			System.out.println("\nVALID");
		} else {
			System.out.println("\nINVALID");
		}
		
		//Take an integer and output if it is even/odd, positive/negative
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
		
		//Ask the user to guess a secret constant on [0,20]
		System.out.print("\n\nPick a number between 1 and 20: ");
		guess = userInput.nextInt();
		if (guess >= 1 && guess <= 20) {
			if (guess == SECRET) {
				System.out.println("Congratulations! You guessed my number!");
			} else if (Math.abs(SECRET - guess) <= 2) {
				System.out.print("So close! Try again!");
			} else {
				System.out.print("Wow... That's not even close.");
			}
		} else {
			System.out.println("That value is not in the range I asked for.");
		}
		
		
		userInput.close();

	}

}
