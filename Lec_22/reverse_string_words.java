package Lec_22;

import java.util.Scanner;

public class reverse_string_words {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solve(str, "");
	}

	public static void solve(String str, String path) {
		int f = str.lastIndexOf(" ");
		if(f==-1) {
			System.out.println(path+str);
			return;
		}
		String word = str.substring(f+1);
		String remain = str.substring(0,f);
		solve(remain, path+word+" ");
		
	}
}
