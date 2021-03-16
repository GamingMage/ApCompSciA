package unit5activitiespt2;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 3/4/21
 * Purpose: Create a menu that executes different tasks to manipulate arrays
 */

public class Unit5Pt2Small {

	public static int singleDigits(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] / 10 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int switchFlow = 0;
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		System.out.println("Welcome!");
		while (switchFlow != 5) {
			System.out.println("Please choose which activity you want to run:\n1\t2\t3\n4\t5(exit)");
			switchFlow = userInput.nextInt();
			
			switch (switchFlow) {
				case 1:
					/*
					Take user input of a single character and provide feedback on whether the
					character is or is not a vowel. This must be done by searching for the
					character in an array of vowels. Both capital and lower-case vowels should
					be identified. If the user enters more than one character, only the first
					character should be analyzed.
					 */
					userInput.nextLine();
					System.out.print("\nActivity 1:\nPlease enter a character: ");
					char character = userInput.nextLine().toLowerCase().charAt(0);
					for (int i = 0; i < vowels.length; i++) {
						if (vowels[i] == character) {
							System.out.println(character + " is a vowel!");
							break;
						}else if (i == vowels.length - 1 && vowels[i] != character) {
							System.out.println(character + " is not a vowel!");
						}
					}
					
					System.out.println("");
					break;
				case 2: 
					/*
					Create an array of 20 random ints between 1 and 50 inclusive. Print the
					array. Pass the array as a parameter to a method that returns the number of
					single-digit values in the array. Print that number.
					 */
					System.out.println("\nActivity 2:");
					int[] array1 = new int[20];
					for (int i = 0; i < array1.length; i++) {
						array1[i] = (int)(Math.random() * (50 - 1 + 1)) + 1;
					}
					System.out.print("[");
					for (int i = 0; i < array1.length - 1; i++) {
						System.out.print("" + array1[i] + ", ");
					}
					System.out.println("" + array1[array1.length - 1] + "]");
					System.out.println("There are " + singleDigits(array1) + " single digit values in the array.");
					
					System.out.println("");
					break;
				case 3:
					/*
					Create an array of 6 Die objects. The Dies should have 4, 6, 8, 10, 12, and
					20 sides. Use an enhanced for loop to roll each die and print the results.
					 */
					System.out.println("\nActivity 3:\n");
					Die d4 = new Die(4);
					Die d6 = new Die(6);
					Die d8 = new Die(8);
					Die d10 = new Die(10);
					Die d12 = new Die(12);
					
					int[] dice = {d4.getValue(), d6.getValue(), d8.getValue(), d10.getValue(), d12.getValue()};
					
					System.out.print("The dice rolled: ");
					for (int roll: dice) {
						System.out.print(roll + " ");
					}
					
					System.out.println("\n");
					break;
				case 4:
					/*
					Take user input of 5 integer values and store them in an array. Then,
					analyze the array to identify the maximum and minimum values and the
					mean of the values. Print the results.
					 */
					System.out.println("\nActivity 4:\nYou will need to enter 5 integers.");
					int[] array2 = new int[5];
					for (int i = 0; i < array2.length; i++) {
						System.out.print("Please enter integer " + (i+1) + ": ");
						array2[i] = userInput.nextInt();
					}
					int min = array2[0];
					int max = array2[0];
					int sum = array2[0];
					for (int i = 1; i < array2.length; i++) {
						if (array2[i] > max) {
							max = array2[i];
						} else if (array2[i] < min) {
							min = array2[i];
						}
						sum += array2[i];
					}
					System.out.println("Maximum: " + max);
					System.out.println("Minimum:" + min);
					System.out.println("Mean: " + sum/5.0);
					
					System.out.println("");
					break;
				case 5:
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
