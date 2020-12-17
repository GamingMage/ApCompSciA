package unit3activities;

import java.util.Scanner;
import java.lang.Math;

/*
 * Name: Joseph Liang
 * Date: 12/17/20
 * Purpose: Play the marble game Nim against a bot
 */

public class GameOfNim {
	
	static int pileSize = 0;
	static int firstTurn = 0;
	static int botIQ = 0;

	/**
	 * This method runs the initialization for the game.
	 */
	public static void startGame() {
		pileStart();
		firstTurn();
		botIQ();
	}
	public static void pileStart() {
		pileSize = (int)(Math.random() * ((100 - 10) + 1) + 10);
		System.out.println("The inital size of the pile is " + pileSize + " marbles.");
	}
	public static void firstTurn() {
		firstTurn = (int)Math.round(Math.random());
		if (firstTurn == 0) {
			System.out.println("Your opponent wil go first.");
		} else {
			System.out.println("You will go first.");
		}
	}
	public static void botIQ() {
		botIQ = (int)Math.round(Math.random());
		if (botIQ == 0) {
			System.out.println("Your oppenent is in STUPID mode.");
		} else {
			System.out.println("Your opponent is in SMART mode.");
		}
	}
	/**
	 * This method runs a bot's turn in SMART mode.
	 */
	public static void smartTurn() {
		int n = 0;
		int x = 0;
		for(int i = 0; x < pileSize; i++) {
			n = i;
			x = (int) (Math.pow(2, i) - 1);
			if (pileSize == x) {
				n = (int)(Math.random() * ((pileSize/2 - 1) + 1) + 1);
				pileSize -= n;
				System.out.println("Your opponent took " + n + " marbles from the pile.\n" + pileSize + " marbles remain.\n");
				return;
			}
		}
		x = (int)(Math.pow(2, n - 1) - 1);
		x = pileSize - x;
		pileSize -= x;
		System.out.println("Your opponent took " + x + " marbles from the pile.\n" + pileSize + " marbles remain.\n");
	}
	/**
	 * This method runs a bot's turn in STUPID mode.
	 */
	public static void stupidTurn() {
		int n;
		n = (int)(Math.random() * ((pileSize/2 - 1) + 1) + 1);
		pileSize -= n;
		System.out.println("Your opponent took " + n + " marbles from the pile.\n" + pileSize + " marbles remain.\n");
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int turn, x;
		
		System.out.println("Welcome to Nim!\n\nWhen you are ready to start, press enter.");
		userInput.nextLine();
		startGame();
		System.out.println("\nPress enter again to begin.");
		userInput.nextLine();
		turn = firstTurn + 1;
		
		//The game is run from here. The player's turn occurs when the integer turn is odd.
		while (pileSize > 0) {
			turn ++;
			if (turn % 2 == 0) {
				if (botIQ == 0) {
					stupidTurn();
				} else {
					smartTurn();
				}
			} else {
				System.out.print("How many marbles will you take? ");
				x = userInput.nextInt();
				if (x > pileSize/2 && pileSize != 1) {
					x = pileSize/2;
					System.out.println("The number you enter was too large, so it has been set to the max value.");
				}
				pileSize -= x;
				System.out.println("You took " + x + " marbles from pile.\n" + pileSize + " marbles remain.\n");
			}
		}
		if (turn % 2 == 0) {
			System.out.print("YOU WIN!!");
		} else {
			System.out.print("YOU LOST.");
		}
		
		userInput.close();

	}

}
