package unit5activitiespt2;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 3/14/21
 * Purpose: Determine and output the locations of the largest, second-largest, and third-largest values within the array.
 */

public class FindMax {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int x = 0;
		
		while (x < 3) {
			System.out.print("Please input the number of integers you would like to enter: ");
			x = userInput.nextInt();
			if (x < 3) {
				System.out.println("Please enter a number that is 3 or larger.");
			}
		}
		
		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter integer " + (i+1) + ": ");
			arr[i] = userInput.nextInt();
		}
		
		//Find largest value
		int a = arr[0];
		int b = 0;
		for (int i = 1; i < arr.length; i++) {
			b = arr[i];
			if (b > a) {
				a = b;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				System.out.println("The largest number entered was " + a + " at index " + i + ".");
			}
		}
		
		//Find second largest value
		int index = 0;
		do {
			if (index < arr.length) {
				b = arr[index];
			} else {
				break;
			}
			index++;
		} while (b == a);
		
		int c = 0;
		if (b != a) {
			for (int i = 1; i < arr.length; i++) {
				c = arr[i];
				if (c > b && c < a) {
					b = c;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == b) {
					System.out.println("The second largest number entered was " + b + " at index " + i + ".");
				}
			}
		}
		
		//Find third largest value
		index = 0;
		do {
			if (index < arr.length) {
				c = arr[index];
			} else {
				break;
			}
			index++;
		} while (c == b);
		
		int d = 0;
		for (int i = 1; i < arr.length; i++) {
			d = arr[i];
			if (d > c && d < b) {
				c = d;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				System.out.println("The third largest number entered was " + c + " at index " + i + ".");
			}
		}
		
		userInput.close();

	}

}
