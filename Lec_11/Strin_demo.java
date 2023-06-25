package Lec_11;

public class Strin_demo {
	public static void main(String[] args) {
		String str = "heelobcdlololo";
//		size!!
		System.out.println(str.length());
//		indexing!!
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.indexOf("lo"));
		
		System.out.println(str.lastIndexOf("ololi"));
		
		System.out.println(str.startsWith("Hee"));
		
		System.out.println(str.endsWith("oli"));
		
		
	}
}
