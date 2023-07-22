package Lec_15;

public class Rec_Multi_basics_1 {
	public static void main(String[] args) {
//		CT(2, "");
		Subseq("ab","");
	}

	public static void CT(int n, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		CT(n - 1, str + "H");
		CT(n - 1, str + "T");

	}

	public static void Subseq(String str, String team) {
		if(str.isEmpty()) {
			System.out.println(team);
			return;
		}
//		BP : str = "abcd" , ""
//		SP : str = "bcd"
		char ch = str.charAt(0);//a
		String remain = str.substring(1); //bcd
		Subseq(remain, team+ch);
		Subseq(remain, team);
		
	}
}
