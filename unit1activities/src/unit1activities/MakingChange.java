package unit1activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 9/25/20
 * Purpose: Accept a purchase price and amount paid. Then, output change due (total, dollars, quarters, dimes, nickels, pennies).
 */

public class MakingChange {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		double price;
		double payment;
		double change;
		int dollars, quarters, dimes, nickels, pennies;
		double cents;
		
		System.out.print("Enter purchace price:\t");
		price = userInput.nextDouble();
		System.out.print("\nEnter amount recived:\t");
		payment = userInput.nextDouble();
		change = payment - price;
		System.out.println("\nChange due:\t\t" + change);
		
		//Version without modulus
//		dollars = (int)(change);
//		System.out.println("\n\nDollars:\t" + dollars);
//		cents = (change - dollars);
//		quarters = (int)(cents/.25);
//		System.out.println("\nQuarters:\t" + quarters);
//		cents -= (quarters * .25);
//		dimes = (int)(cents/.1);
//		System.out.println("\nDimes:\t\t" + dimes);
//		cents -= (dimes * .1);
//		nickels = (int)(cents/.05);
//		System.out.println("\nNickels:\t" + nickles);
//		cents -= (nickles * .05);
//		pennies = (int)(cents/.01);
//		System.out.print("\nPennies:\t" + pennies);
		
		//Version with modulus
		dollars = (int)(change);
		System.out.println("\nDollars:\t" + dollars);
		cents = (change - dollars);
		quarters = (int)(100*(cents - (cents % .25))/25);
		System.out.println("\nQuarters:\t" + quarters);
		cents -= (quarters * .25);
		dimes = (int)(100*(cents - (cents % .1))/10);
		System.out.println("\nDimes:\t\t" + dimes);
		cents -= (dimes * .1);
		nickels = (int)(100*(cents - (cents % .05))/5);
		System.out.println("\nNickels:\t" + nickels);
		cents -= (nickels * .05);
		pennies = (int)(100*(cents - (cents % .01))/1);
		System.out.print("\nPennies:\t" + pennies);
		
		userInput.close();
		
	}

}
