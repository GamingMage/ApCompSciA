package unit2activitiespt2;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 11/11/20
 * Purpose: Take a menu input and run the indicated activity.
 */

public class ActivitiesMenu {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int switchFlow = 0;
		int x, y;
		int factorial;
		int primeCheck;
		int startTemp, endTemp;
		double celsius;
		int sumValue, sumAddition;
		int termNumber;
		double termDouble, approx;
		
		System.out.println("Welcome!");
		while (switchFlow != 7) {
			System.out.println("Please choose which activity you want to run:\n1\t2\t3\n4\t5\t6(challenge)\n7(exit)");
			switchFlow = userInput.nextInt();
			
			switch (switchFlow) {
				case 1:
					/*Take user input of an integer and compute the factorial of that integer.
					Output the result. A negative input should produce an error message.*/
					System.out.println("\nActivity 1:\nWhat number would you like to compute the factorial of?");
					x = userInput.nextInt();
					
					if (x >= 0) {
						factorial = x;
						y = x;
						
						while (x > 1) {
							x--;
							factorial *= x;
						}
						System.out.println(y + "! = " + factorial + "\n");
					} else {
						System.out.println("ERROR: INVALD INPUT\n");
					}
					break;
				case 2:	
					/*Take user input of a positive integer. Determine if the number is prime or
					not. Output is either PRIME or NOT PRIME.*/
					System.out.print("\nActivity 2:\nPlease enter a positive integer: ");
					x = userInput.nextInt();
					
					if (x >= 0) {
						primeCheck = 1;
						y = x;
						
						while (x != 0) {
							primeCheck++;
							x = y;
							x %= primeCheck;
						}
						
						if (primeCheck == y) {
							System.out.println(y + " is: PRIME\n");
						} else {
							System.out.println(y + " is: NOT PRIME\n");
						}
					} else {
						System.out.println("ERROR: INVALD INPUT\n");
					}
					break;
				case 3:
					/*Take user input of integers for as long as they choose to enter them. When a
					zero is entered, output the largest value entered.*/
					System.out.println("\nActivity 3:\nPlease enter integers to compare (use zero to finish)");
					x = 0;
					y = x;
					
					do {
						x = userInput.nextInt();
						if (x > y) {
							y = x;
						}
					} while (x != 0);
					System.out.println("The largest value you entered was: " + y + "\n");
					break;
				case 4:
					/*Take user input of integers that represent starting and ending Fahrenheit
					temperatures. Output a table that shows the Celsius equivalents of these
					values and all integer values between them.*/
					System.out.println("\nActivity 4:");
					System.out.print("Please enter the starting Fahrenheit temperature: ");
					startTemp = userInput.nextInt();
					System.out.print("Please enter the ending Fahrenheit temperature: ");
					endTemp = userInput.nextInt();
					
					System.out.println("Fahrenheit\tCelsius");
					if (startTemp <= endTemp) {
						while (startTemp <= endTemp) {
							celsius = ((startTemp - 32) * (5.0/9));
							System.out.printf("%d\t\t%.2f\n", startTemp, celsius);
							startTemp++;
						}
					} else {
						while (startTemp >= endTemp) {
							celsius = ((startTemp - 32) * (5.0/9));
							System.out.printf("%d\t\t%.2f\n", startTemp, celsius);
							startTemp--;
						}
					}
					
					System.out.println("");
					break;
				case 5:
					/*Take user input of an integer. Compute how many consecutive integers
					starting with 1 it takes to add to a value greater than the value entered.
					Output both the number of integers and the sum obtained. You may assume
					that the user enters a positive number.*/
					System.out.print("\nActivity 5:\nPlease enter the number you would like the sum to exceed: ");
					x = userInput.nextInt();
					sumValue = 0;
					sumAddition = 0;
					
					while (sumValue <= x) {
						sumAddition++;
						sumValue += sumAddition;
					}
					System.out.println("\nYou must add the " + sumAddition + " numbers between 1 and " + sumAddition + " to get " + 
							sumValue + " and exceed " + x + ".\n");
					break;
				case 6:
					/*The German mathematician Leibniz approximated pi/4 with an infinite sum.
					His formula was: pi/4 = 1 - 1/3 + 1/5 - 1/7...
					Take user input for the number of terms to use in the approximation. Output the result.*/
					System.out.println("\nActivity Challenge:\nHow many terms should be used to approximate pi/4?");
					x = userInput.nextInt();
					termNumber = -1;
					approx = 0;
					
					while (termNumber < x - 1) {
						termNumber++;
						termDouble = termNumber;
						approx += ((Math.pow(-1, termDouble))/(2*termDouble + 1));
					}
					System.out.println("Leibniz's approximation with " + x + " terms yields " + approx + "\n");
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
