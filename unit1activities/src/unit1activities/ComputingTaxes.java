package unit1activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 9/26/20
 * Purpose: Take in hours worked and hourly rate, and compute and output gross pay, individual tax rate, and net pay.
 */

public class ComputingTaxes {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int hours;
		double rate;
		double gross, net;
		double fed, ss, state, local;
		double fedR = .18;
		double ssR = .08;
		double stateR = .032;
		double localR = .02;
		
		//Enter hours worked and rate
		System.out.print("Enter the number of hours worked this week: ");
		hours = userInput.nextInt();
		System.out.print("\nEnter the hourly rate: ");
		rate = userInput.nextDouble();
		
		System.out.println("\n\nHours worked:\t\t\t" + hours);
		System.out.printf("\nHourly rate:\t\t\t$%.2f",rate);
		
		gross = (double)hours * rate;
		System.out.printf("\n\n\nGross pay:\t\t\t$%.2f",gross);
		
		//Calculate tax deductions and print
		//Note: Make sure to escape % symbols with either %% or \% when you want to print one
		fed = gross * fedR;
		System.out.printf("\n\nFederal tax (18%%)\t\t$%.2f",fed);
		ss = gross * ssR;
		System.out.printf("\n\nSocial security tax (8%%)\t$%.2f",ss);
		state = gross * stateR;
		System.out.printf("\n\nState tax (3.2%%)\t\t$%.2f",state);
		local = gross * localR;
		System.out.printf("\n\nLocal tax (2%%)\t\t\t$%.2f",local);
		
		//Print net earnings
		net = gross - (fed + ss + state + local);
		System.out.printf("\n\n\nNet pay\t\t\t\t$%.2f",net);
		
		userInput.close();

	}

}
