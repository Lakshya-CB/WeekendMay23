package Lec_09;

public class subarray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		Subarray2(arr);
	}
	public static void Subarray(int[] arr) {
		for(int s =0;s<arr.length;s++) {
			for(int e = s;e<arr.length;e++) {
				int sum = 0;
//				System.out.println(s+" - "+e);
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i] + " ");
					sum = sum+arr[i];
				}
				System.out.println(" = > "+sum);
			}
		}
	}
	public static void Subarray2(int[] arr) {
		
		for(int s =0;s<arr.length;s++) {
			int sum = 0;
			for(int e = s;e<arr.length;e++) {
				sum = sum + arr[e];
				System.out.println(" = > "+sum);
			}
		}
	}

}
