package tictactoe;

public class TicTacToeGame {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		int[] input = new int[2];
		
		input[0] = 0;
		input[1] = 0;
		System.out.println(game.getBoard());
		game.humanTurn(input);
		System.out.println(game.getBoard());
	}

}
