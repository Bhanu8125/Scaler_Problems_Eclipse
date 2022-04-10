package Scaler_Problems2;
/*
 * Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47 


Example Output
Output 1:

 102030 
Output 2:

 434755 


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030 
Explanation 2:

 43 + 47 + 55 = 434755 
 */
import java.util.ArrayList;

public class ModularArithmeticConcatenatethreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  A = 55;
		int  B = 43;
		int  C = 47;
		System.out.println(solve(A,B,C));
	}
	 public static int solve(int A, int B, int C) {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        arr.add(convert(A,B,C));
	        arr.add(convert(A,C,B));
	        arr.add(convert(B,A,C));
	        arr.add(convert(B,C,A));
	        arr.add(convert(C,A,B));
	        arr.add(convert(C,B,A));
	        Integer min = arr.get(0);
	        for(Integer value : arr)
	            if(min>value)
	                min = value;
	        return (int)min;

	        
	    }
	    public static  Integer convert(int A,int B,int C){
	        return Integer.valueOf((A*10000) + (B*100) + C);
	    }

}
