package backtracking;

public class NQueens {
	private static final int N = 4;

	public static void main(String[] args) {

		int board[][] = new int[N][N];

		NQueens queens = new NQueens();

		boolean value = queens.findNQueens(board, 0);
		System.out.println(value);
		// queens.printBoard(board);
	}

	private boolean findNQueens(int[][] board, int row) {

		if (row >= N) {

			this.printBoard(board);
			return true;
		}

		for (int col = 0; col < N; col++) {

			if (this.isSafe(board, row, col)) {

				board[row][col] = 1;

				if (findNQueens(board, row + 1))
					return true;

				board[row][col] = 0;
			}

		}
		return false;

	}

	private void printBoard(int[][] board) {
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++)
				System.out.print(board[i][j] + " ");

			System.out.println("");

		}

	}

	private boolean isSafe(int[][] board, int row, int col) {
		// check for row and col for potential 1
		for (int i = 0; i <= col; i++) {
			if (board[row][i] == 1)
				return false;
		}
		for (int i = 0; i <= row; i++) {
			if (board[i][col] == 1)
				return false;

		}
		// check for left diagonal
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		// check for right diagonal
		for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1)
				return false;
		}

		return true;
	}

}
