package Lec_22;

public class K_swaps_max {
	public static void main(String[] args) {
		String str = "356794398";
//		String str = "123";

		char[] arr = str.toCharArray();

		solve(arr, 3,"");
		System.out.println(global);
//		System.out.println(path);
	}

	static long global = 0;
	static String path = "";

	public static void solve(char[] arr, int k, String path) {

		long curr = toLong(arr);
//		global = Math.max(global, curr);
		if (global < curr) {
			global = curr;
			K_swaps_max.path = path;
		}
//		System.out.println(curr);
		if (k == 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(arr, i, j);
				solve(arr, k - 1, path + "{" + i + "," + j + "}");
				swap(arr, i, j);
			}
		}

	}

	private static void swap(char[] arr, int i, int j) {
		char ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;

	}

	public static Long toLong(char[] arr) {
		String str = "";
		for (char ch : arr) {
			str = str + ch;
		}
		return Long.parseLong(str);
	}
}
