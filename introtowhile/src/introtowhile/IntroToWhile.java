package introtowhile;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 11/6/20
 * Purpose: Take inputs of positive numbers until a negative numbers is given. Then, output the number of positive values given and their sum.
 */

public class IntroToWhile {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int numbersEntered = -1;
		double userNumber = 0;
		double sum = 0;
		
		while (userNumber >= 0) {
			sum += userNumber;
			numbersEntered++;
			System.out.print("Please enter a positive number: ");
			userNumber = userInput.nextDouble();
		}
		System.out.println("\nYou entered " + numbersEntered + " positive numbers.");
		System.out.print("The sum of the positive numbers you entered is " + sum + ".");
		
		userInput.close();

	}

}
