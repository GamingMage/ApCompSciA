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
		
		System.out.print("Please enter today's temperature: ");
		temp = userInput.nextInt();
		
		if (temp <= 32) {
			System.out.println("\nPrepare for snow!");
		}
		System.out.println("\nThank you for using APCS.com.");
		
		System.out.print("\n\nPlease enter two integers: ");
		x = userInput.nextInt();
		y = userInput.nextInt();
		
		if (x == y) {
			System.out.print("\nYour numbers are equal!\n\n" + x + " and " + y + " are the same.");
		}

	}

}
