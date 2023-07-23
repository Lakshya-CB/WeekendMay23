package Lec_16;

public class LKC {
	public static void main(String[] args) {
		solve("35", "");
	}

		public static void solve(String buttons, String path) {
			if(buttons.isEmpty()) {
				System.out.println(path);
				return;
			}
	//	buttons => 538
			String remain = buttons.substring(1);
			String ops = Options(buttons.charAt(0));  //jkl
			for(int i =0;i<ops.length();i++) {
				solve(remain, path+ops.charAt(i));
			}
	
		}
	
	public static String Options(char ch) {
		String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[ch-'0'];
	}
}
