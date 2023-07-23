package Lec_16;

public class Climb_Stairs {
	public static void main(String[] args) {
		chal(0, 4, "");
	}

	public static void chal(int curr, int n, String path) {
		if (curr > n) { //-ve BC
			return;
		}
		if(curr==n) {
			System.out.println(path);
			return;
		}
		chal(curr + 1, n, path + 1);
		chal(curr + 2, n, path + 2);
	}
	
	
}
