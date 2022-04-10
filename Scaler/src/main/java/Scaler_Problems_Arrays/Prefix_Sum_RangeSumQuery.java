package Scaler_Problems_Arrays;
/*
 * Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
1 <= L <= R <= N


Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.


Output Format
Return an integer array of length M where ith element is the answer for ith query in B.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[1, 4], [2, 3]]
Input 2:

A = [2, 2, 2]
B = [[1, 1], [2, 3]]


Example Output
Output 1:
[10, 5]
Output 2:

[2, 4]


Example Explanation
Explanation 1:
The sum of all elements of A[1 ... 4] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[2 ... 3] = 2 + 3 = 5.
Explanation 2:

The sum of all elements of A[1 ... 1] = 2 = 2.
The sum of all elements of A[2 ... 3] = 2 + 2 = 4.
 */

public class Prefix_Sum_RangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1, 2, 3, 4, 5};
		int[][] B = new int[][] {{1, 4}, {2, 3}};
		long[] res = rangeSum(A,B);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}
		

	}
	 public static long[] rangeSum(int[] A, int[][] B) {
	        long prefix_sum[] = new long[A.length];
	        long res_arr[] = new long[B.length];
	        prefix_sum[0]=A[0];
	        for(int i=1;i<prefix_sum.length;i++)
	        {
	            prefix_sum[i] = prefix_sum[i-1]+(long)A[i];
	        }
	        
	        for(int i=0;i<B.length;i++)
	        {
	            long sum = 0;
	            int start = B[i][0]-1 ;
	            int end = B[i][1] - 1;
	            if(start==0)
	            {
	                sum = prefix_sum[end];
	            }
	            else
	            {
	                sum = prefix_sum[end] - prefix_sum[start -1];
	            }
	            res_arr[i] = sum;
	        }
	        return res_arr;
	    }

}
