package unit5activitiespt1;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 2/25/21
 * Purpose: Take inputs of and manipulate Strings
 */

public class Unit5Small {

	/**
	 * Take user input of a String and print it with one letter per line.
	 * @param s
	 */
	public static void printVertical(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
	}
	/**
	 * Take user input of a String and print it with one letter per line diagonally.
	 * Each new line should have an additional tab.
	 * @param s
	 */
	public static void printDiagonal(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("\t");
			}
			System.out.println(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int selector = 0;
		
		System.out.println("Welcome!");
		while(selector != 3) {
			System.out.println("Please choose which activity you want to run:\n1\t2\t3(exit)");
			selector = userInput.nextInt();
			
			switch(selector) {
				case 1:
					System.out.print("\nActivity 1:\nPlease enter a String to print vertically: ");
					userInput.nextLine();
					printVertical(userInput.nextLine());
					break;
				case 2:
					System.out.print("\nActivity 2:\nPlease enter a String to print diagonally: ");
					userInput.nextLine();
					printDiagonal(userInput.nextLine());
					break;
				case 3:	
					//Exit case
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
