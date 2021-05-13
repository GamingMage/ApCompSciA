package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		int[] input = new int[2];
		boolean playing = true;
		boolean win = false;
		boolean draw = false;
		boolean playerTurn = false;
		int x = 0;
		
		System.out.println("Shall we play a game?\nPress enter to begin.");
		userInput.nextLine();
		while (playing) {
			System.out.print("The first turn shall be decided with a coin toss.\nPlease enter 0 for tails and 1 for heads: ");
			System.out.println(game.coinToss(userInput.nextInt()));
			playerTurn = game.getFirst();
			System.out.println(game.getBoard());
			System.out.println("Please enter your space choice in the form 'row number' 'column number' with a space in between.\n");
			userInput.nextLine();
			while (!win && !draw) {
				if (playerTurn) {
					System.out.print("Choose your space: ");
					input[0] = userInput.nextInt();
					input[1] = userInput.nextInt();
					game.playerTurn(input);
					System.out.println(game.getBoard());
					playerTurn = false;
				}else if (!playerTurn) {
					game.botTurn();
					System.out.println(game.getBoard());
					playerTurn = true;
				}
				win = game.checkWin();
				draw = game.checkDraw();
			}
			if (!playerTurn && win) {
				System.out.println("Congratulations! You win!");
			}else if (playerTurn && win) {
				System.out.println("Darn you lost.");
			}else {
				System.out.println("Draw.");
			}
			System.out.println("Would you like to play again?\nIf so, input a number greater than 0.");
			x = userInput.nextInt();
			if (x > 0) {
				game.reset();
			}else {
				playing = false;
			}
		}
		
		System.out.println("Thanks for playing!");
		
		userInput.close();
		
	}

}
