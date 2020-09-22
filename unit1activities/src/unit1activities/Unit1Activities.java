package unit1activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 9/23/20
 * Purpose: Take in, store, manipulate, and print values
 */

public class Unit1Activities {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int one, two, three, four;
		int rad;
		double decOne;
		int truncOne;
		double decTwo;
		int hundredths;
		double userTempF;
		double convTempC;
		double userTempC;
		double convTempF;
		int threeDigits, digOne, digTwo, digThree;
		
		System.out.print("Please enter 4 integers: ");
		one = userInput.nextInt();
		two = userInput.nextInt();
		three = userInput.nextInt();
		four = userInput.nextInt();
		System.out.println("\nThe sum of your integers is " + (one + two + three + four) + ".");
		System.out.println("The mean of your integers is " + (one + two + three + four)/4.0 + ".\n");
		
		System.out.println("What is the radius of the circle?");
		rad = userInput.nextInt();
		System.out.println("Circumference: " + (2*Math.PI*rad));
		System.out.println("Area: " + (Math.PI*Math.pow(rad, 2)) + "\n");
		
		System.out.print("Please input a decimal number: ");
		decOne = userInput.nextDouble();
		truncOne = (int)decOne;
		System.out.println("Truncated result: " + truncOne + "\n");
		
		System.out.print("Please input a decimal number: ");
		decTwo = userInput.nextDouble();
		decTwo %= 1;
		decTwo *= 100;
		hundredths = (int)decTwo;
		//NOTE: this math does not like .34. It prints as 33
		System.out.println("The first two digits after the decimal point are: " + hundredths + "\n");
		
		System.out.print("Please enter a temperature in degrees Fahrenheit: ");
		userTempF = userInput.nextDouble();
		convTempC = (userTempF - 32)*(5/9);
		//NOTE: this math does not work! 10F outputs -0.0C
		System.out.println("That temperature in Celsius is " + convTempC + ".");
		System.out.print("Please enter a temperature in degrees Celsius:");
		userTempC = userInput.nextDouble();
		convTempF = (userTempC * (9/5)) + 32;
		System.out.println("That temperature in Fahrenheit is " + convTempF + ".\n");
		
		System.out.print("Please enter a 3 digit positive integer: ");
		threeDigits = userInput.nextInt();
		digOne = (threeDigits/100);
		digTwo = (threeDigits/10)%10;
		digThree = (threeDigits%10);
		System.out.println("\nThe digits are:\n" + digOne + "\n" + digTwo + "\n" + digThree + "\n");
		System.out.println(digOne + " + " + digTwo + " + " + digThree + " = " + (digOne + digTwo + digThree) + "\n");

	}

}
