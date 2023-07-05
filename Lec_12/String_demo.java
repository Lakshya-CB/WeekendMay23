package Lec_12;

public class String_demo {
	public static void main(String[] args) {
		String str = "jaaduthetthekttepe";
		System.out.println(str.length());
		System.out.println(str.charAt(9));
		System.out.println(str.indexOf("?"));
		System.out.println(str.lastIndexOf("the"));
		System.out.println(str.startsWith("jaa"));
		System.out.println(str.endsWith("pe"));
		str= "abcd";
		System.out.println(str.substring(0,3));
		
	}
}
