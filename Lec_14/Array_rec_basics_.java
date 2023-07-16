package Lec_14;

public class Array_rec_basics_ {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		print2(arr.length-1, arr);
		print3(0,arr.length-1, arr);
	}
	public static void print(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
//		BP : print(s)
//		SP : print(s+1)
		System.out.println(arr[s]);
		print(s + 1, arr);
	}
	
	public static void print2(int e, int[] arr) {
		if(e<0) {
			return;
		}
		print2(e-1, arr);
		System.out.println(arr[e]);
	}
	public static void print3(int s, int e, int[]arr) {
		if(s>e) {
			return;
		}
		int mid = (s+e)/2;
		print3(s, mid-1, arr);
		System.out.println(arr[mid]);
		print3(mid+1, e, arr);
	}
}
