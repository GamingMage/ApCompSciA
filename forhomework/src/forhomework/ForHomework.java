package forhomework;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 11/18/20
 * Purpose: Use for loops to print sequences of numbers
 */

public class ForHomework {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int x;
		
		/*Write a for loop that prints all of the numbers from 23 to 89 separated by a
		space. After you have done this successfully, edit your code so that exactly
		10 numbers are printed per line.*/
		for (int i = 23; i <= 89; i++) {
			if ((i - 23) % 10 == 0) {
				System.out.print("\n");
			}
			System.out.print(i + " ");
			
		}
		System.out.println("\n");
		
		/*Write a for loop that prints the even numbers between 1 and 50. Each
		number should be printed on a separate line.*/
		for (int i = 2; i <= 48; i += 2) {
			System.out.println(i);
		}
		System.out.println("");
		
		/*Take user input of an integer between 0 and 100 inclusive and print the
		integers between it and 100. If an invalid integer is entered, print ERROR.*/
		System.out.println("Enter a number between 0 and 100:");
		x = userInput.nextInt();
		System.out.println("");
		if (x <= 100 && x >= 0) {
			for (int i = x; i <= 100; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("ERROR");
		}
		
		userInput.close();
		
	}

}
