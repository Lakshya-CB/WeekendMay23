package Lec_06;

public class inverse_ {
	public static void main(String[] args) {
		int n = 23145;
		int pos = 1;
		int ans =0;
		while (n > 0) {
			int digit = n % 10;
			System.out.println(digit + " - " + pos);
			
//			System.out.println(pos * Math.pow(10, digit-1));

			ans = ans +  pos * (int)Math.pow(10, digit-1);
			
			pos++;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
