package Lec_20_doubts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class All_subseq {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			ArrayList<String> AL = new ArrayList<>();
			
			solve(scn.next(), "", AL);
			Collections.sort(AL);
			for(String str : AL) {
				System.out.println(str);
			}
			T--;
			
		}

	}

	public static void solve(String str, String path, ArrayList<String> AL) {
		if (str.isEmpty()) {
//			System.out.println(path);
			AL.add(path);
			return;
		}
		char ch = str.charAt(0);
		solve(str.substring(1), path + ch, AL);
		solve(str.substring(1), path, AL);
	}
}
