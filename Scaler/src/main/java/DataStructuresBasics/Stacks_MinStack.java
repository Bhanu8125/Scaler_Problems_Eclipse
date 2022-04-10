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


//Min Stack Implementation using ArrayList
//class Solution {
//  List<Integer> value_stack = new ArrayList<Integer>();
//  List<Integer> min_stack = new ArrayList<Integer>();
//  int top = -1;
//  public void push(int x) {
//      if(min_stack.size()==0)
//      {
//          min_stack.add(x);
//      }
//      else
//      {
//          int curr_min = min_stack.get(top);
//          min_stack.add(Math.min(x,curr_min));
//      }  
//      value_stack.add(x);
//      top++; 
//  }

//  public void pop() {
//      if(top!=-1){
//          min_stack.remove(top);
//          value_stack.remove(top);
//          top--;
//      }
//  }
//  public int top() {
//      if(top!=-1)
//      {
//          return value_stack.get(top);
//      }
//      return -1;
//  }

//  public int getMin() {
//       if(top!=-1)
//      {
//          return min_stack.get(top);
//      }
//      return -1;
//  }
//}


//Min Stack Implementation using LinkedList
//class Node{
// int val;
// Node next;
// public Node(int x){
//     this.val = x;
// }
//}
//
//class Solution {
//Node head;
//Node min_head;
// public void push(int x) {
//     if(min_head == null)
//     {
//         min_head = new Node(x);
//         head = new Node(x);
//     }
//     else
//     {
//         int curr_min = min_head.val;
//         int sel_min = Math.min(x,curr_min);
//         Node new_min_node = new Node(sel_min);
//
//         new_min_node.next = min_head;
//         min_head = new_min_node;
//
//         Node new_node = new Node(x);
//         new_node.next=head;
//         head = new_node;
//     }
// }
//
// public void pop() {
//     if(head != null){
//         head = head.next;
//         min_head = min_head.next;
//     }
// }
// public int top() {
//     if(head!=null)
//          return head.val;
//         
//     return -1;
// }
//
// public int getMin() {
//     if(min_head!=null)
//         return min_head.val;
//     
//     return -1;
// }
//}

