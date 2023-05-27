package Lec_02;

public class isPrimt {
	public static void main(String[] args) {
			int n = 130;
			int div = 1;
			int numFac = 0;
			while (div <= n) {
				int rem = n % div;
				if (rem == 0) {
					numFac = numFac + 1;
				}
				System.out.println(div + " - " + rem);
				div = div + 1;
			}
			System.out.println(numFac);
			if(numFac==2) {
				System.out.println("n is Prime");
			}else {
				System.out.println("n is not Prime");	
			}
	}
}
