package tictactoe;

public class TicTacToe {

	private String[][] board = new String[3][3];
	private boolean first = false;
	
	public TicTacToe() {
		reset();
	}
	
	public void reset() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				board[i][j] = "_";
			}
		}
	}
	public String coinToss(int x) {
		int n = (int)(Math.random() * 1 - 0 + 1) + 0;
		if(x >= 1 && n == 1) {
			first = true;
		}else if (x <= 0 && n == 0) {
			first = true;
		}else {
			first = false;
		}
		return "";
	}
	
	public String getBoard() {
		String out = "  0 1 2";
		for(int i = 0; i < board.length; i++) {
			out += "\n" + (i + 1) + " ";
			for(int j = 0; j < board[0].length; j++) {
				out += board[i][j] + " ";
			}
		}
		return out;
	}
	
	public void humanTurn(int[] a) {
		updateBoard(a, first);
	}
	
	public void botTurn() {
		int[] a = new int[2];
		
		updateBoard(a, !first);
	}
	
	private void updateBoard(int[] a, boolean x) {
		if (x) {
			board[a[0]][a[1]] = "X";
		}else {
			board[a[0]][a[1]] = "O";
		}
	}
	
	private boolean checkWin() {
		if (checkColumns()) {
			return true;
		}else if (checkRows()) {
			return true;
		}else if (checkDiagonal()) {
			return true;
		}
		return false;
	}
	private boolean checkColumns() {
		for(int i = 0; i < board.length; i++) {
			if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
				return true;
			}
		}
		return false;
	}
	private boolean checkRows() {
		for(int i = 0; i < board.length; i++) {
			if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				return true;
			}
		}
		return false;
	}
	private boolean checkDiagonal() {
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
			return true;
		}
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
			return true;
		}
		return false;
	}
	
}
