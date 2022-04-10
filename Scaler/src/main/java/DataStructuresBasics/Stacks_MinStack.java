package DataStructuresBasics;

import java.util.ArrayList;
import java.util.Stack;

public class Stacks_MinStack {

	Stack<Integer> values = new Stack<Integer>();
	Stack<Integer> min_stack = new Stack<Integer>();
	//ArrayList<Integer> min = new ArrayList<Integer>();

	public  void push(int x)
	{
		if(min_stack.isEmpty())
		{
			min_stack.push(x);	
		}
		else
		{
			int curr_min = min_stack.peek();
			min_stack.push(Math.min(x, curr_min));
		}
		values.push(x);
	}
	public void pop() {
		if(!values.isEmpty()) {
			values.pop();
			min_stack.pop();
		}
		
	}

	public int top() {
		if(!values.isEmpty())
			return values.peek();
		return -1;
	}

	public int getMin() {
		if(!min_stack.isEmpty())
			return min_stack.peek();
		return -1;
	}

}
