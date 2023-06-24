package Lec_10;

public class array_2D_demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr.length); // rows
		System.out.println(arr[0].length); // cols
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int count = 1;
		for(int r =0;r<arr.length;r++) {
			
			for(int c = 0;c<arr[r].length;c++) {
				arr[r][c] = count;
				count++;
			}
		}
//		for(int[] kuchor : arr) {
//			for(int alio : kuchor) {
//				System.out.print(alio + " " );
//			}
//			System.out.println();
//		}
		System.out.println("============");
		for(int r =0;r<arr.length;r++) {
			System.out.print("[");
			for(int c = 0;c<arr[r].length;c++) {
				System.out.print(arr[r][c]);
				if(c<=arr[r].length-2) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		
//		arr[1][0] = 5;
//		arr[1][1] = 6;
//		arr[1][2] = 7;
//		arr[1][3] = 8;
//		
//		arr[2][0] = 9;
//		arr[2][1] = 10;
//		arr[2][2] = 11;
//		arr[2][3] = 12;
//		
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[0][3]);
//		
//		for(int[]  ali: arr) {
//			System.out.println(ali.length);
//		}
	}
}
