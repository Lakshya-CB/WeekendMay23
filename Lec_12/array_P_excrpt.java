package Lec_12;

import java.util.Scanner;

public class array_P_excrpt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		long[] RP_arr = new long[arr.length];
		long RP = 1;
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			RP_arr[idx] = RP;
			RP = RP * arr[idx];
		}
		long LP = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				LP = LP * arr[i - 1];
			}
			System.out.print(LP * RP_arr[i] + " ");
		}
	}
	public int trap(int[] arr) {
        int L = 0;
        int LWall = arr[L];
        int R = arr.length-1;
        int RWall = arr[R];
        int ans =0;
        while(L<=R){
            if(LWall>RWall){
//                 you can fill right wali dolchi!!
                int water = RWall-arr[R];
                ans = ans +water;
                
                R--;
                if(R>=0){
                    RWall = Math.max(RWall,arr[R]);
                }
            }else{
//             left wala 
                int water = LWall-arr[L];
                ans = ans +water;
                
                L++;
                if(L<arr.length){
                  LWall = Math.max(LWall,arr[L]);
                }
            }
        }
        return ans;
        
    }
}
