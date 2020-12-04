package unit2activitiespt3;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 11/18/20
 * Purpose: Take a menu input and run the indicated activity.
 */

public class ActivitiesMenu2 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int switchFlow = 0;
		int x, y;
		int sum = 0;
		int large = 0;
		int small = 0;
		final int height = 3;
		final int length = 8;
		final int base = 8;
		
		System.out.println("Welcome!");
		while (switchFlow != 7) {
			System.out.println("Please choose which activity you want to run:\n1\t2\t3\n4\t5\t6\n7(exit)");
			switchFlow = userInput.nextInt();
			
			switch (switchFlow) {
				case 1:
					/*Print the squares and cubes of the first 10 positive integers.*/
					System.out.println("\nActivity 1:\nNumber\tSquare\tCube");
					for (int i = 1; i <= 10; i++) {
						System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
					}
					System.out.println("");
					break;
				case 2: 
					/*Take user input of two integers. Add all of the integers between the two
					(including the numbers themselves) and output the result.*/
					System.out.println("\nActivity 2:");
					System.out.print("Please enter the starting number: ");
					x = userInput.nextInt();
					System.out.print("Please enter the ending number: ");
					y = userInput.nextInt();
					sum = 0;
					for (int i = x; i <= y; i++) {
						sum += i;
					}
					System.out.println("\nThe sum of the numbers between " + x + " and " + y + " is " + sum + ".\n");
					break;
				case 3:
					/*Ask the user how many values will be entered. Take input of that many
					values. Output the largest value entered, smallest value entered, and sum of
					the values entered.*/
					System.out.println("\nActivity 3:\nHow many numbers will be entered?");
					x = userInput.nextInt();
					System.out.println("");
					for (int i = 1; i <= x; i++) {
						System.out.print("Please enter number " + i + ": ");
						y = userInput.nextInt();
						if (i == 1) {
							sum = y;
							large = y;
							small = y;
						} else {
							if (y > large) {
								large = y;
							} else if (y < small) {
								small = y;
							}
							sum += y;
						}
						
					}
					System.out.println("\nThe largest number was " + large + ".\n"
							+ "The smallest number was " + small + ".\n"
							+ "The sum of the numbers was " + sum + ".\n");
					break;
				case 4:
					/*Use nested for loops to print a box made of X’s with a length of 8 and a
					height of 3. Store 8 and 3 as constants.*/
					System.out.println("\nActivity 4:\n");
					for (int i = 1; i <= height; i++) {
						for (int j = 1; j <= length; j++) {
							System.out.print("X");
						}
						System.out.println("");
					}
					System.out.println("");
					break;
				case 5:
					/*Use nested for loops to print a right triangle made of X’s with a height of 8
					and a base of 8. Store 8 as a constant.*/
					System.out.println("\nActivity 5:\n");
					for (int i = 1; i <= base; i++) {
						for (int j = 1; j <= i; j++) {
							System.out.print("X");
						}
						System.out.println("");
					}
					System.out.println("");
					break;
				case 6:
					/*Use nested for loops to create a multiplication table that goes up to 5.*/
					System.out.println("\nActivity 6:\n");
					for (int i = 0; i <= 5; i++) {
						if (i == 0) {
							System.out.print(" \t");
						}
						for (int j = 1; j <= 5; j++) {
							if (j == 1 && i != 0) {
								System.out.print(i + "\t");
							}
							if (i == 0) {
								System.out.print(j + "\t");
							} else {
								System.out.print(j*i + "\t");
							}
						}
						System.out.println("");
					}
					System.out.println("");
					break;
				case 7:
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
