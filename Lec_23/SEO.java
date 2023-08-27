package Lec_23;

import java.util.Arrays;

public class SEO {
	public static void main(String[] args) {
//		sieve of eratoesthenes
		solve(100000);
	}

	public static void solve(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		for (int div = 2; div * div <= n; div++) {
			if(isPrime[div]==false) {
				continue;
			}
			for (int table = div * div; table <= n; table = table + div) {
				isPrime[table] = false;
			}
		}
		for(int num = 2;num<=n;num++) {
			if(isPrime[num]) {
				System.out.println(num);
			}
		}
	}
}
