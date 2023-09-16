package Lec_OOPs3_Stack;

public class aaStack {
	int tos;
	int[] arr;

	public aaStack() {
		tos = -1;
		arr = new int[5];
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public int size() {
		return tos + 1;
	}

	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		return arr[tos];
	}

	public int poll() {
		if(isEmpty()) {
			throw new RuntimeException("Kya nikaal rha hein?");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public boolean isFull() {
		return size()==arr.length;
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("Kya daal rha hein?");
		}
		tos++;
		arr[tos] = ali;
	}

}
