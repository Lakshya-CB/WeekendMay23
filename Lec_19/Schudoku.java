package Lec_19;

public class Schudoku {
	
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		print(board);
		solve(board, 0, 0);
		print(board);
	}

	public static void solve(char[][] board, int r, int c) {

		if (c == 9) {
			c = 0;
			r++;
		}
		if (r == 9) {
			print(board);
			return;
		}
		if (board[r][c] != '.') {
			solve(board, r, c + 1);
		} else {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(board, r, c, ch)) {
					board[r][c] = ch;
					solve(board, r, c + 1);
				}
			}
			board[r][c] = '.';
		}

	}

	private static boolean isSafe(char[][] board, int r, int c, char ch) {

		for (int R = 0; R < 9; R++) {
			if (board[R][c] == ch) {
				return false;
			}
		}
		for (int C = 0; C < 9; C++) {
			if (board[r][C] == ch) {
				return false;
			}
		}
		int boxR = r / 3;
		int boxC = c / 3;
		for (int R = boxR * 3; R < boxR * 3 + 3; R++) {
			for(int C = boxC*3; C <boxC*3+3;C++) {
				if(board[R][C]==ch) {
					return false;
				}
			}
		}
		return true;
	}

	private static void print(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("==============");

	}
}
