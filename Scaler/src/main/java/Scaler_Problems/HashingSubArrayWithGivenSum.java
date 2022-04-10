package Scaler_Problems;
/*
Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output

Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation

Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
 */

import java.util.HashMap;

public class HashingSubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] =  new int[] {5, 10, 20, 100, 105};
		int B= 110;
		int res[]= solve(A,B);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}

	}
	
	 public static int[] solve(int[] A, int B) {
	        HashMap<Long,Integer> sub_Array_sum = new HashMap<Long,Integer>();
			//int prefix_sum[] = new int[A.length];
			 long sum = 0;
			int start_index =0;
			int end_index = -1;
			for(int i=0;i<A.length;i++)
			{
				sum = sum+A[i];
				long num = sum - B;
				if(num==0)
				{
					end_index = i;
	                break;
				}
				if(sub_Array_sum.containsKey(num))
				{
					start_index = sub_Array_sum.get(num) + 1;
					end_index = i;
					break;
				}
				else
				{
					sub_Array_sum.put(sum, i);
				}
			}
			if (end_index == -1)
				return new int[]{-1};
			
			int length = end_index - start_index + 1;
			int res[] = new int[length];
			for(int j=0;j<length;j++)
			{
				res[j] = A[j+start_index]; 
			}
				return res;
	    }

}
