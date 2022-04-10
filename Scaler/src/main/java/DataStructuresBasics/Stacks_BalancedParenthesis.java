package DataStructuresBasics;

import java.util.Stack;

public class Stacks_BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "(()())";
		 Stack<Character> par_stack = new Stack<Character>();
	        if(A.length()==1) 
			{
				System.out.println(0);
			}
			if(A.isEmpty()) System.out.println(1);;
			for(int i=0;i<A.length();i++)
			{
				if(A.charAt(i)=='(') {
					par_stack.push('(');
				}
				else if(A.charAt(i)==')')
				{
					if(par_stack.isEmpty())
					{
						System.out.println(1);
						break;
	                }
	                else
	                {
						par_stack.pop();
	                }
				}
					
			}
			if(par_stack.isEmpty())
				System.out.println(1);
			else
				System.out.println(0);
			
	
		
	}

}
