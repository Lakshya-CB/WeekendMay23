package Lec_Stack;

import Lec_OOPs3_Stack.Dynamic_Stack;

public class MinStack extends Dynamic_Stack {

	int curr_min;

	@Override
	public void add(int ali) {
		if (this.isEmpty()) {
			curr_min = ali;
		}
		if (ali >= curr_min) {
			super.add(ali);
		} else {
			int prev_min = curr_min;
			curr_min = ali;
			int Magical = 2 * curr_min - prev_min;
			super.add(Magical);
		}

	}

	public int getMin() {
		return curr_min;
	}

	public int peek() {
		if (super.peek() >= curr_min) {
			return super.peek();
		} else {
			return curr_min;
		}
	}

	@Override
	public int pop() {
		int ans = super.pop();
		if(ans>=curr_min) {
			return ans;
		}else {
			int Magic = ans;
			ans = curr_min;
//			int Magical = 2 * curr_min - prev_min;
			int prev_min = 2*curr_min- Magic;
			curr_min = prev_min;
			return ans;
		}
	}

	
}
