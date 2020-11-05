package unit2activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/30/20
 * Purpose: Take inputs of completions, attempts, passing yards, touchdowns, and interceptions, and calculate NFL passer rating
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
		
		if (r1 > 2.375) {
			r1 = 2.375;
		}else if (r1 < 0) {
			r1 = 0;
		}
		if (r2 > 2.375) {
			r2 = 2.375;
		}else if (r2 < 0) {
			r2 = 0;
		}
		if (r3 > 2.375) {
			r3 = 2.375;
		}else if (r3 < 0) {
			r3 = 0;
		}
		if (r4 > 2.375) {
			r4 = 2.375;
		}else if (r4 < 0) {
			r4 = 0;
		}
		
		rFinal = ((r1 + r2 + r3 + r4)/6)*100;
		
		//Scale from 0 to 158.3
		System.out.printf("\nThe NFL Passer Rating for your player is: %.1f.", rFinal);
		
		userInput.close();
		
	}

}
