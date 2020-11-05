package unit2activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/19/20
 * Purpose: Take inputs of strings and doubles to compute how much a service station visit will cost
 */

public class ServiceStation {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String fuelType;
		double gallons, perGal;
		String carWash;
		double washCost;
		final double r = 3.599, s = 3.699, p = 3.799, n = 0;
		double total;
		
		//Prompt the user for gas type, gallons of gas, and ask if they got a car wash
		System.out.print("Enter gas type (R, S, P, or N): ");
		fuelType = userInput.nextLine();
		System.out.print("\nEnter number of gallons: ");
		gallons = userInput.nextDouble();
		System.out.print("\nEnter Y or N for car wash: ");
		userInput.nextLine();
		carWash = userInput.nextLine();
		
		//Output number of gallons and price of gas purchased
		System.out.printf("\n\nAmount of gasoline purchased:\t%.2f gallons", gallons);
		if (fuelType.equals("R")) {
			System.out.println("\n\nPrice per gallon:\t\t$" + r);
			perGal = r;
		} else if (fuelType.equals("S")) {
			System.out.println("\n\nPrice per gallon:\t\t$" + s);
			perGal = s;
		} else if (fuelType.equals("P")) {
			System.out.println("\n\nPrice per gallon:\t\t$" + p);
			perGal = p;
		} else {
			System.out.println("\n\nPrice per gallon:\t\t$" + n);
			perGal = n;
		}
		//Determine their total cost
		if (carWash.equals("Y") && (gallons * perGal) >= 10) {
			washCost = 3;
		} else if (carWash.equals("Y") && (gallons * perGal) < 10) {
			washCost = 5;
		} else {
			washCost = 0;
		}
		//Output cost of individual expenses and the total cost
		System.out.printf("\nTotal gasoline cost:\t\t$%.2f", (gallons * perGal));
		System.out.printf("\n\nCar wash cost:\t\t\t$%.2f", washCost);
		total = (gallons * perGal) + washCost;
		System.out.printf("\n\nTotal due:\t\t\t$%.2f", total);
		System.out.print("\n\n\nTHANK YOU FOR COMING!");

		userInput.close();
		
	}

}
