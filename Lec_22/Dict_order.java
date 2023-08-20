package Lec_22;

import java.util.Scanner;

public class Dict_order {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		String str = scn.next();
		int[] batua = new int[26];
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			batua[ch-'a']++;
		}
		solve(batua, "",str);
	}
	public static void solve(int[] batua,String path,String org) {
		if(path.compareTo(org)>0) {
			return;
		}
		boolean isEmpty = true;
		for(char ch = 'a';ch<='z';ch++) {
			if(batua[ch-'a']>0) {
				isEmpty = false;
				batua[ch-'a']--;
				solve(batua, path+ch,org);
				batua[ch-'a']++;
			}
		}
		if(isEmpty) {
			System.out.println(path);
		}
	}
}
