package Lec_OOPs3_Stack;

public class Dynamic_Stack extends aaStack {
	@Override
	public void add(int ali) {
		if (isFull()) {
			int[] bigg = new int[this.arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				bigg[i] = arr[i];
			}
			this.arr = bigg;
		}
		super.add(ali);
	}
	

}
