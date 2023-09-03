package Lec_OOPs_2;

public class client_inherti {
	public static void main(String[] args) {
//		c1!!!
		Parent p = new Parent();
		
//		p.
		
//		////////
		
		Parent p1 = new Child();
		System.out.println(p1.data);
		System.out.println(p1.dataP);
		System.out.println(((Child)p1).data);
		System.out.println(((Child)p1).dataC);
		
		
		p1.funP();
		p1.fun();
		((Child)p1).fun();
		
		System.out.println("=====================");
		/////////////
		Child c = new Child();
		
		System.out.println(c.dataC);
		System.out.println(c.dataP);
		
		System.out.println(c.data);
		System.out.println(((Parent)c).data);
		c.fun();
		((Parent)p1).fun();
		System.out.println("=====================");
//		Child c2 = new Parent();
		
		

	}
}
