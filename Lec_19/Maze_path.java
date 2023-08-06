package Lec_19;

public class Maze_path {
	public static void main(String[] args) {
		int[][] board = {
				{0,1,0,0},
			    {0,0,0,0},
			    {0,1,0,0},
			    {0,0,1,0}};
		chal(0, 0, "", board, new boolean[board.length][board[0].length]);
	}

	public static void chal(int r, int c, String path, int[][] board,boolean[][] Visited) {
		if (r < 0 || c < 0 || r == board.length || c == board[0].length 
				|| board[r][c] == 1||Visited[r][c]) {
			return;
		}
		if(r==board.length-1 && c==board[0].length-1) {
			System.out.println(path);
			return;
		}
		Visited[r][c]= true;
		chal(r - 1, c, path + "U", board,Visited);
		chal(r + 1, c, path + "D", board,Visited);
		chal(r, c - 1, path + "L", board,Visited);
		chal(r, c + 1, path + "R", board,Visited);
		Visited[r][c]= false;

	}
}
