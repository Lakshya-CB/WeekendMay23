package Lec_Q_LL;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);

		LL.add(60);
		LL.add(70);
		LL.add(80);
		LL.add(90);
		
		LL.print();
		LL.KRev(3);
		LL.print();
		
	}
}
