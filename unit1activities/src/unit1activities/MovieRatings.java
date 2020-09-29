package unit1activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 9/25/20
 * Purpose: Compute overall movie ratings based on ratings from websites, focus groups, and critics.
 */

public class MovieRatings {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int web1, web2, web3;
		double foc1, foc2;
		double critic;
		double avgWeb, avgFoc;
		
		//Website ratings
		System.out.print("Please enter three website ratings: ");
		web1 = userInput.nextInt();
		web2 = userInput.nextInt();
		web3 = userInput.nextInt();
		
		//Focus group ratings
		System.out.print("\nPlease enter two ratings from focus groups: ");
		foc1 = userInput.nextDouble();
		foc2 = userInput.nextDouble();
		
		//Critic rating
		System.out.print("\nPlease enter the average movie critic rating: ");
		critic = userInput.nextDouble();
		
		//Averaging ratings and printing
		avgWeb = (web1 + web2 + web3)/3.0;
		System.out.println("\nAverage website rating: " + avgWeb);
		avgFoc = (foc1 + foc2)/2.0;
		System.out.println("Average focus group rating: " + avgFoc);
		System.out.println("Average movie critic rating: " + critic);
		
		//weighting values and printing the overall rating
		avgWeb *= .20;
		avgFoc *= .30;
		critic *= .50;
		System.out.print("Overall movie rating: " + (avgWeb + avgFoc + critic));
		
		userInput.close();
		
	}

}
