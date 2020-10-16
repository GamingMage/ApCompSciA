package ifhomework;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/14/20
 * Purpose: take input, compare with vales in boolean statements, and output a response
 */

public class IfHomework {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int temp;
		int x, y;
		int grade;
		
		//Ask user for temperature, and tell them if it will snow
		System.out.print("Please enter today's temperature: ");
		temp = userInput.nextInt();
		
		if (temp <= 32) {
			System.out.println("\nPrepare for snow!");
		} else {
			System.out.println("\nNo snow today!");
		}
		System.out.println("\nThank you for using APCS.com.");
		
		//Ask user for two integers, and tell them if they are equal
		System.out.print("\n\nPlease enter two integers: ");
		x = userInput.nextInt();
		y = userInput.nextInt();
		
		if (x == y) {
			System.out.println("\nYour numbers are equal!\n\n" + x + " and " + y + " are the same.");
		} else {
			System.out.println("\nYour numbers are not equal.\n\n" + x + " and " + y + " are not the same.");
		}
		
		//Ask user for an integer representing a grade (4 = A, 3 = B, etc) and output the grade
		System.out.print("\n\nPlease enter the grade as a number: ");
		grade = userInput.nextInt();
		
		if (grade == 4) {
			System.out.print("\nA");
		} else if (grade == 3) {
			System.out.print("\nB");
		} else if (grade == 2) {
			System.out.print("\nC");
		} else if (grade == 1) {
			System.out.print("\nD");
		} else if (grade == 0) {
			System.out.print("\nF");
		} else {
			System.out.print("\nDunno ... Q?");
		}

		userInput.close();
		
	}

}
