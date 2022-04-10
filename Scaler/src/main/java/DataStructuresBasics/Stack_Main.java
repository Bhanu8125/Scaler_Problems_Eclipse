package DataStructuresBasics;
import DataStructuresBasics.Stacks_MinStack;

public class Stack_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks_MinStack stack = new Stacks_MinStack();
		stack.push(1);
		stack.push(2);
		stack.push(-2);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		System.out.println(stack.top());
		
		

	}

}
