package Scaler_Problems;
/*
 * 
 * Problem Description
Given an integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.


Problem Constraints
1 <= N <= 105

1 <= A[i], B <= 107



Input Format
The first argument is an integer array A.

The second argument is an integer B.



Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



Example Input
Input 1:

 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:

 A = [3, 6, 8, 10, 15, 50]
 B = 5


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 (10 ^ 15) = 5
Explanation 2:

 (3 ^ 6) = 5 and (10 ^ 15) = 5
 */

import java.util.HashMap;

public class HashingPairsWithGivenXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {5, 4, 10, 15, 7, 6};
		int B= 5;
		System.out.println(solve(A,B));

	}
	 public static int solve(int[] A, int B) {

	        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
			 int pair_count = 0;
			 for(int i=0;i<A.length;i++)
			 {
				 if(freq.containsKey(A[i]))
				 {
					 int count = freq.get(A[i]) + 1;
					 freq.put(A[i], count);
				 }
				 else
				 {
					 freq.put(A[i], 1);
				 }
			 }
			 
			 for(int i=0;i<A.length;i++)
			 {
				 int num = B^A[i];
				 if(freq.containsKey(num))
				 {
					 int a_count = freq.get(num);
					 int b_count = freq.get(A[i]);
					 pair_count = pair_count + (a_count * b_count);
					 freq.remove(A[i]);
					 freq.remove(num);
				 }
				 
			 }
			 return pair_count;
	    }

}
