package slotmachine;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 1/20/21
 * Purpose: Spin random numbers and determine if the player won slots
 */

public class SlotMachine {

	public static int spin() {
		return (int)Math.random()*9 + 1;
	}
	public static boolean three(int a, int b, int c) {
		if(a == b && b == c) {
			return true;
		}
		return false;
	}
	public static boolean two(int a, int b, int c) {
		if(a == b || a == c || b == c) {
			return true;
		}
		return false;
	}
	public static boolean countThree(int a, int b, int c) {
		int x;
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a + 2 == b + 1 && b + 1 == c) {
			return true;
		}
		return false;
	}
	public static boolean countTwo(int a, int b, int c) {
		int x;
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a + 2 == b + 1 || b + 1 == c) {
			return true;
		}
		return false;
	}
	public static double pullLever() {
		int a, b, c;
		a = spin();
		b = spin();
		c = spin();
		System.out.println("Your spin: " + a + " " + b + " " + c);
		if (three(a, b, c)) {
			System.out.println("TRIPPLE!");
			return 18.75;
		}
		if (two(a, b, c)) {
			System.out.println("DOUBLE!");
			return 5;
		}
		if (countThree(a, b, c)) {
			System.out.println("THREE IN A ROW!");
			return 3.75;
		}
		if (countTwo(a, b, c)) {
			System.out.println("TWO IN A ROW!");
			return .25;
		}
		System.out.println("Nothing.");
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		boolean play = true;
		System.out.print("Would you like to play the Slot Machine?\nIt costs $.25 to play.\nEnter 1 for yes and 0 for no: ");
		int a = userInput.nextInt();
		if (a == 1) {
			play = true;
		}else if (a == 0){
			play = false;
		}else {
			 
		}
		double x = 0;
		double y;
		while (play) {
			System.out.println("");
			x -= .25;
			y = pullLever();
			if (y != 0) {
				System.out.println("You won $" + y + "!");
			}else {
				System.out.println("You lost $.25.");
			}
			x += y;
			if (x < 0) {
				System.out.println("So far you have lost: $" + x + "!");
			}else if (x == 0) {
				System.out.println("At the moment, you have broken even!");
			}else {
				System.out.print("So far you have won: $" + x + "!");
			}
			System.out.print("Would you like to play the Slot Machine again?\nEnter 1 for yes and 0 for no: ");
			a = userInput.nextInt();
			if (a == 1) {
				play = true;
			}else if (a == 0){
				play = false;
			}else {
				
			}
		}

	}

}
