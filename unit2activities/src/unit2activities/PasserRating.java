package unit2activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/30/20
 * Purpose: Take inputs of completions, attempts, passing yards, touchdowns, and interceptions, and calculate NFL passer rating
 * Source for formula: https://medium.com/@gzil/how-to-calculate-nfl-passer-rating-using-a-formula-in-excel-or-google-sheets-54eb07246d1e
 */

public class PasserRating {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double completions, attempts, passingYards, touchdowns, interceptions;
		double r1, r2, r3, r4, rFinal;
		
		System.out.println("Please enter the following values for your player: ");
		System.out.print("\nCompletions: ");
		completions = userInput.nextDouble();
		System.out.print("Attempts: ");
		attempts = userInput.nextDouble();
		System.out.print("Passing Yards: ");
		passingYards = userInput.nextDouble();
		System.out.print("Touchdowns: ");
		touchdowns = userInput.nextDouble();
		System.out.print("Interceptions: ");
		interceptions = userInput.nextDouble();
		
		r1 = ((completions/attempts) - .3)*5;
		r2 = ((passingYards/attempts) - 3)*.25;
		r3 = (touchdowns/attempts)*20;
		r4 = 2.375 - ((interceptions/attempts)*25);
		rFinal = ((r1 + r2 + r3 + r4)/6)*100;
		
		System.out.printf("\nThe NFL Passer Rating for your player is: %.1f.", rFinal);
		
		userInput.close();
		
	}

}
