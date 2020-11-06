package whilehomework;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 11/6/20
 * Purpose: Take inputs of test scores until a negative is received. Then, print the average.
 * 			Take two integers and print the evens between them including the given values if they are even.
 */

public class WhileHomework {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		double score = 0, scoreSum = 0, scoreMean;
		int scoresEntered = -1;
		int x, y, z;
		
		//Take in test scores until a -1 is given and output their mean
		while (score >= 0) {
			scoreSum += score;
			scoresEntered++;
			System.out.print("Enter a test score: ");
			score = userInput.nextDouble();
			System.out.println("");
		}
		scoreMean = scoreSum/scoresEntered;
		System.out.println("The mean of the test scores is: " + scoreMean);
		
		//Take 2 ints and print the even values between them including the given values if applicable
		System.out.print("\n\nPlease enter two integers: ");
		x = userInput.nextInt();
		y = userInput.nextInt();
		System.out.println("");
		if (x > y) {
			z = x;
			x = y;
			y = z;
		}
		if (x % 2 != 0) {
			x++;
		}
		if (y % 2 != 0) {
			y--;
		}
		while (x <= y) {
			System.out.print(x + " ");
			x += 2;
		}
		
	}

}
