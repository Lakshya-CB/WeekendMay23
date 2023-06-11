package Lec_07;

public class array_demo_3 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int[] arr2 = arr;
		arr2[1] = 99;
		
		System.out.println(arr[1]);
	}
}
