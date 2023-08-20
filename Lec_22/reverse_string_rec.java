package Lec_22;

import java.util.Scanner;

public class reverse_string_rec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solve(str,str.length()-1 ,"");
	}

	public static void solve(String str,int idx, String path) {
		if(idx<0) {
			System.out.println(path);
			return;
		}
		solve(str, idx-1, path+str.charAt(idx));
	}
}
