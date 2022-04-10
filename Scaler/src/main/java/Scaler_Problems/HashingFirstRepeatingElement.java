package Scaler_Problems;

/*\
 * Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return an integer denoting the first repeating element.



Example Input
Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:

 5
Output 2:

 -1


Example Explanation
Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1
 */

import java.util.ArrayList;
import java.util.HashMap;

public class HashingFirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {10, 5, 3, 4, 3, 5, 6};
		System.out.println(solve(A));

	}
	 public static  int solve(int[] A) {
	        HashMap<Integer,Integer> rep_ele = new HashMap<Integer,Integer>();
			int min_index = A.length;
			for(int i=0;i<A.length;i++)
			{
				if(rep_ele.containsKey(A[i]))
				{
					if(rep_ele.get(A[i]) < min_index)
					{
						min_index = rep_ele.get(A[i]);
					}
				}
				else
				{
					rep_ele.put(A[i], i);
				}
			}
			
	        if(min_index == A.length)
	            return -1;
	        else
	            return A[min_index];
		}

}
