package Lec_08;

public class Rotat_tion {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		rotate(arr, 7);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void rotate(int[] arr, int rot) {
		for (int r = 1; r <= rot % arr.length; r++) {
			int banda = arr[arr.length - 1];
			for (int j = arr.length - 1; j >= 1; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = banda;
		}
	}
}
