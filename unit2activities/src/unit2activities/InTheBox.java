package unit2activities;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 10/19/20
 * Purpose: Take inputs to determine the size of a coordinate plane, and determine if a given point falls within the generate plane.
 */

public class InTheBox {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int bottomLeftX, bottomLeftY;
		int length, height;
		int x, y;
		
		System.out.print("Enter the x coordinate of the bottom left corner of\n\tthe box: ");
		bottomLeftX = userInput.nextInt();
		System.out.print("Enter the y coordinate of the bottom left corner of\n\tthe box: ");
		bottomLeftY = userInput.nextInt();
		System.out.print("Enter the height of the box: ");
		height = userInput.nextInt();
		System.out.print("Enter the length of the box: ");
		length = userInput.nextInt();
		System.out.print("Enter the x coordinate of the point: ");
		x = userInput.nextInt();
		System.out.print("Enter the y coordinate of the point: ");
		y = userInput.nextInt();
		
		if (x <= bottomLeftX + length && x >= bottomLeftX && y <= bottomLeftY + height && y >= bottomLeftY) {
			System.out.print("The point (" + x + "," + y + ") is inside the box.");
		} else {
			System.out.print("The point (" + x + "," + y + ") is not inside the box.");
		}
		
		userInput.close();
		
	}

}
