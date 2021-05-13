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
		int n = (int)(Math.random() * (1 - 0 + 1)) + 0;
		if(x >= 1 && n == 1) {
			first = true;
			return "You guessed correct! You take the first turn!";
		}else if (x <= 0 && n == 0) {
			first = true;
			return "You guessed correct! You take the first turn!";
		}else {
			first = false;
			return "You guessed incorrect. The computer will go first.";
		}
	}
	
	public String getBoard() {
		String out = "  0 1 2";
		for(int i = 0; i < board.length; i++) {
			out += "\n" + (i) + " ";
			for(int j = 0; j < board[0].length; j++) {
				out += board[i][j] + " ";
			}
		}
		out += "\n";
		return out;
	}
	public boolean getFirst() {
		return first;
	}
	
	public void playerTurn(int[] a) {
		updateBoard(a, first);
	}
	
	public void botTurn() {
		int[] a = checkBoard();
		if (a[0] != -1 && a[1] != -1) {
			updateBoard(a, !first);
		}else if (a[0] == -1){
			int[] b = checkCorners();
			if (b[0] != -1 && b[1] != -1) {
				updateBoard(b, !first);
			}
		}else {
			int[] c = findEmpty();
			updateBoard(c, !first);
		}
	}
	
	private void updateBoard(int[] a, boolean x) {
		if (x) {
			board[a[0]][a[1]] = "X";
		}else {
			board[a[0]][a[1]] = "O";
		}
	}
	
	private int[] checkBoard() {
		int[] a = {-1,-1};
		//check columns for 2 of the same
		for(int i = 0; i < board.length; i++) {
			if (board[0][i].equals(board[1][i]) && board[2][i].equals("_")) {
				a[0] = 2;
				a[1] = i;
			}else if (board[1][i].equals(board[2][i]) && board[0][i].equals("_")) {
				a[0] = 0;
				a[1] = i;
			}else if (board[0][i].equals(board[2][i]) && board[1][i].equals("_")) {
				a[0] = 1;
				a[1] = i;
			}
		}
		//check rows for two in a row
		for(int i = 0; i < board.length; i++) {
			if (board[i][0].equals(board[i][1]) && board[i][2].equals("_")) {
				a[0] = i;
				a[1] = 2;
			}else if (board[i][1].equals(board[i][2]) && board[i][0].equals("_")) {
				a[0] = i;
				a[1] = 0;
			}else if (board[i][0].equals(board[i][2]) && board[i][1].equals("_")) {
				a[0] = i;
				a[1] = 1;
			}
		}
		//check diagonals for two in a row
		if (board[0][0].equals(board[1][1]) && board[2][2].equals("_")) {
			a[0] = 2;
			a[1] = 2;
		}else if (board[1][1].equals(board[2][2]) && board[0][0].equals("_")) {
			a[0] = 0;
			a[1] = 0;
		}else if (board[0][2].equals(board[1][1]) && board[2][0].equals("_")) {
			a[0] = 2;
			a[1] = 0;
		}else if (board[1][1].equals(board[2][0]) && board[0][2].equals("_")) {
			a[0] = 0;
			a[1] = 2;
		}else if (board[0][0].equals(board[2][2]) && board[1][1].equals("_")) {
			a[0] = 1;
			a[1] = 1;
		}else if (board[0][2].equals(board[2][0]) && board[1][1].equals("_")) {
			a[0] = 1;
			a[1] = 1;
		}
		return a;
	}
	private int[] checkCorners() {
		int[] a = {-1,-1};
		if (board[0][0].equals("_")) {
			a[0] = 0;
			a[1] = 0;
		}else if (board[0][2].equals("_")) {
			a[0] = 0;
			a[1] = 2;
		}else if (board[2][0].equals("_")) {
			a[0] = 2;
			a[1] = 0;
		}else if (board[2][2].equals("_")) {
			a[0] = 2;
			a[1] = 2;
		}
		return a;
	}
	private int[] findEmpty() {
		int[] a = {-1, -1};
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if (board[i][j].equals("_")) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}
	
	public boolean checkDraw() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if (board[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}
	public boolean checkWin() {
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
			if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("_")) {
				return true;
			}
		}
		return false;
	}
	private boolean checkRows() {
		for(int i = 0; i < board.length; i++) {
			if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("_")) {
				return true;
			}
		}
		return false;
	}
	private boolean checkDiagonal() {
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("_")) {
			return true;
		}
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("_")) {
			return true;
		}
		return false;
	}
	
}
