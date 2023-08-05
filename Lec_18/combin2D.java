package Lec_18;

public class combin2D {
	public static void main(String[] args) {
		int n = 5;
		solveSeat(0, 0, n, "", n, n, new boolean[n][n]);
	}

	public static void print(boolean[][] board) {
		for (boolean[] arr : board) {
			for (boolean b : arr) {
				if (b) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}

			System.out.println();
		}
		System.out.println("============");
	}

//	wrt Seat
	public static void solveSeat(int r, int c, int QTP, String path, int total_R, int total_C, boolean[][] board) {
		if (QTP == 0) {
			System.out.println(path);
			print(board);
			return;
		}
		if (c == total_C) {
			c = 0;
			r++;
		}
		if (r == total_R) {
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			solveSeat(r, c + 1, QTP - 1, path + "Q{" + r + "," + c + "}", total_R, total_C, board);
			board[r][c] = false;
		}
		solveSeat(r, c + 1, QTP, path, total_R, total_C, board);

	}

	private static boolean isSafe(boolean[][] board, int R, int C) {
		// TODO Auto-generated method stub
		for (int r = 0; r <= R; r++) {
			if (board[r][C]) {
				return false;
			}
		}
		for (int c = 0; c <= C; c++) {
			if (board[R][c]) {
				return false;
			}
		}
		int R1 = R;
		int C1 = C;
		while(R1>=0 && C1>=0) {
			if(board[R1][C1]) {
				return false;
			}
			R1--;C1--;
		}
		int R2 = R;
		int C2 = C;
		while(R2>=0 && C2<board[0].length) {
			if(board[R2][C2]) {
				return false;
			}
			R2--;C2++;
		}
		return true;
	}
}
