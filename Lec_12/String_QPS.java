package Lec_12;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
//		String str = "nittin";
//		printAllPalinSS(str);
		Scanner scn = new Scanner(System.in);
//		String sec = scn.nextLine(); //
		String sec = scn.next();
		word_extract(sec);
	}
	public static void word_extract(String str) {
		while(true) {
			int f= str.lastIndexOf(" ");
			String word = str.substring(f+1);
			System.out.println(word);
			if(f<0) {
				return;
			}
			str= str.substring(0,f);
		}
	}
	public static boolean isAnagram(String str1, String str2) {
		int[] batua = new int[26];
		for(int idx =0;idx<str1.length();idx++) {
			batua[str1.charAt(idx)-'a']++;
		}
		for(int idx =0;idx<str2.length();idx++) {
			batua[str2.charAt(idx)-'a']--;
		}
		for(int freq: batua) {
			if(freq!=0) {
				return false;
			}
		}
		return true;
	}
	public static void printAllPalinSS(String str) {
		for(int c=0;c<str.length();c++) {
			grow(str,c,c); // odd
			grow(str,c,c+1);// even
			
		}
	}
	
	private static void grow(String str, int L, int R) {
		while(L>=0 && R<str.length()) {
			if(str.charAt(L)!=str.charAt(R)) {
				return;
			}
			System.out.println(str.substring(L,R+1));
			L--;R++;
		}
		
	}
	public static void printAllSs(String str) {

		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String sss =  str.substring(s,e);
				if(isPalin(sss)) {
				System.out.println(sss);
				}
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
