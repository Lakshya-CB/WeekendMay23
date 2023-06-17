package Lec_08;

public class array_qps {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		Rev(arr);
		print(arr);
		
//		RevPrint(arr);
		
	}
	public static void print(int[] arr) {
		for(int ali : arr) {
			System.out.print(ali+ " ");
		}
		System.out.println();
	}
	
	public static void RevPrint(int[] arr) {
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			System.out.println(arr[idx]);
		}
	}

	public static int Max(int[] arr) {
//		int jeb = Integer.MIN_VALUE;
		int jeb = arr[0];
		for(int aam : arr){
			if(aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}
	public static void Rev(int[] arr) {
		int L =0;
		int R =arr.length-1;
		while(L<arr.length) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			
			L++;R--;
		}
	}
}
