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
		int x, y, z;
		int sum = 0;
		
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
					for (int i = 1; i <= x; i++) {
						System.out.print("Please enter number " + i + ": ");
						y = userInput.nextInt();
						z = 0;
						sum += y;
						if (x != 1) {
							if (y > z)
							z = y;
						}
					}
					break;
				case 4:
					/**/
					break;
				case 5:
					/**/
					break;
				case 6:
					/**/
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
