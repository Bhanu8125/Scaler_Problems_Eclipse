package Scaler_Problems;
/*
 * 
 * Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
 */

import java.util.HashSet;

public class HashingSubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1, 2, 3, 4, 5};
		System.out.println(solve(A));

	}
	 public static int solve(int[] A) {
	       long sum = (long)A[0];
			HashSet<Long>  sub_sum = new HashSet<Long>();
			if(sum==0)
				return 1;
			else
				sub_sum.add(sum);
			
			for(int i=1;i<A.length;i++)
			{
				sum = sum + A[i];
				if(sum==0 || sub_sum.contains(sum)) {
					return 1;
				}
				sub_sum.add(sum);	
			}
			return 0;
	    }

}
