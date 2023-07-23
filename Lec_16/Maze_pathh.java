package Lec_16;

public class Maze_pathh {
	public static void main(String[] args) {
		solve(0, 0, 2, 2, "");
	}
	public static void solve(int r, int c, int destR, int destC, String path) {
		if(r>destR ||c>destC) {
			return;
		}
		if(destR==r && destC==c) {
			System.out.println(path);
			return;
		}
		solve(r, c+1, destR, destC, path+"R");
		solve(r+1, c, destR, destC, path+"D");
		
	}
}
