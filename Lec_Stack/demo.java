package Lec_Stack;

public class demo {
	public static void main(String[] args) {
		MinStack S = new MinStack();

//1,3,40,5,60,50
//
		S.add(50);
		System.out.println(S.getMin());
		S.add(60);
		System.out.println(S.getMin());
		S.add(5);
		System.out.println(S.getMin());
		S.add(40);
		System.out.println(S.getMin());
		S.add(3);
		System.out.println(S.getMin());
		S.add(1);
		System.out.println(S.getMin());
		System.out.println("======");
		while(!S.isEmpty()) {
			System.out.println(S.getMin());
			S.pop();
				
		}
		
	}
}
