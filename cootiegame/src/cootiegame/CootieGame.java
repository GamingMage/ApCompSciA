package cootiegame;

import java.util.ArrayList;
import java.util.Scanner;

public class CootieGame {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Cootie> players = new ArrayList<Cootie>();
		int numPlayers = 0;
		boolean win = false;
		int first = 0;
		
		System.out.println("Welcome to the game Cootie!\n***************************");
		
		while (numPlayers < 2 || numPlayers > 4) {
			System.out.println("How many players are there? (Please enter a number between 2 and 4)");
			numPlayers = userInput.nextInt();
			if (numPlayers < 2 || numPlayers > 4) {
				System.out.println("Please enter a valid number of players./n");
			}else {
				System.out.println("\nWe will play a " + numPlayers + " player game of Cootie!");
				for (int i = 0; i < numPlayers; i++) {
					players.add(new Cootie());
					break;
				}
			}
		}
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).roll() > first) {
				first = i + 1;
			}
		}
		while (!win) {
			
		}
		
		userInput.close();

	}

}
