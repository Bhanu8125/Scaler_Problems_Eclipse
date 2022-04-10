package Scaler_Problems_Arrays;
/*
 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.
 */

public class CarryForwardClosestMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[]{1, 3};
		System.out.println(solve(A));

	}
	public static int solve(int[] A) {
		int last_max_index =-1;
		int last_min_index = -1;
		int min_length = Integer.MAX_VALUE;
		int curr_length =0;
		int max_value = A[0];
		int min_value = A[0];
		for(int i=1;i<A.length;i++)
		{
			if(max_value < A[i])
			{
				max_value = A[i];
			}
			if(min_value > A[i])
			{
				min_value = A[i];
			}
		}
		for(int i=0;i<A.length;i++)
		{
			if(A[i] == max_value)
			{
				last_max_index = i;
			}
			if(A[i] == min_value)
			{
				last_min_index = i;
			}
			if(last_max_index !=-1 && last_min_index !=-1)
			{
				curr_length = Math.abs(last_max_index - last_min_index) + 1;
				min_length = Math.min(curr_length,min_length);
			}
		}
		return min_length;
	}

}
