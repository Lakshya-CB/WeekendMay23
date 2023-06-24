package Lec_10;

import java.util.Arrays;

public class sooooortin {
	public static void main(String[] args) {
//		int[] arr = { 50, 20, 30, 40, 25 };
//		int[] arr = { 10, 20, 30, 40, 50, 23 };
		int[] arr = { 50, 40, 30, 20, 10 };

		System.out.println(Arrays.toString(arr));
//		bubbleSort(arr);
//		SelectionSort(arr);
		Insertion(arr);
//		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 1 - count; s++) {
//			s and s+1
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}

	}

	public static void SelectionSort(int[] arr) {
		for (int last = arr.length - 1; last >= 0; last--) {
			int max_idx = 0;
			for (int s = 0; s <= last; s++) {
				if (arr[max_idx] < arr[s]) {
					max_idx = s;
				}
			}
			int temp = arr[last];
			arr[last] = arr[max_idx];
			arr[max_idx] = temp;

		}
	}

	public static void Insertion(int[] arr) {
//		for(i)
//		{10,20,30,30,40,50}
//		int[] arr = {50,40,30,20,10};

		for (int toIns = 1; toIns < arr.length; toIns++) {
			int baackup = arr[toIns];
			int idx = toIns - 1;
			while (idx >= 0 && arr[idx] > baackup) {
				arr[idx + 1] = arr[idx];
				idx--;
			}

			System.out.println(Arrays.toString(arr));
			arr[idx + 1] = baackup;

			System.out.println(Arrays.toString(arr));
			System.out.println("===============");

		}

	}
}
