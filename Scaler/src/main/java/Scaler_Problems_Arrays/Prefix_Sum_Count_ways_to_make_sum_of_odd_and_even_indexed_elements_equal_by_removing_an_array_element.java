package Scaler_Problems_Arrays;

/*
 * Problem Description

Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints

1 <= n <= 105
-105 <= A[i] <= 105


Input Format

First argument contains an array A of integers of size N


Output Format

Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input

Input 1:
A=[2, 1, 6, 4]
Input 2:

A=[1, 1, 1]


Example Output

Output 1:
1
Output 2:

3


Example Explanation

Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.
 */
public class Prefix_Sum_Count_ways_to_make_sum_of_odd_and_even_indexed_elements_equal_by_removing_an_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2, 1, 6, 4};
		System.out.println(solve(A));


	}
	public static  int solve(int[] A) {
		long even_sum[] =  new long[A.length];
		long odd_sum[]  =  new long[A.length];
		long rev_even_sum[] =  new long[A.length];
		long rev_odd_sum[]  =  new long[A.length];
		int count = 0;
		even_sum[0] = A[0];
		for(int i=1;i<A.length;i++)
		{
			if(i%2==0)
			{
				even_sum[i] = even_sum[i-1]+A[i];
				odd_sum[i] = odd_sum[i-1];
			}
			else
			{
				even_sum[i] = even_sum[i-1];
				odd_sum[i] = odd_sum[i-1] + A[i];
			}

		}
		if((A.length-1)%2==0)
		{
			rev_even_sum[A.length-1] = A[A.length-1];
		}
		else
		{
			rev_odd_sum[A.length - 1] = A[A.length - 1];
		}
		for(int i=A.length-2;i>=0;i--)
		{
			if(i%2==0)
			{
				rev_even_sum[i] = rev_even_sum[i+1]+A[i];
				rev_odd_sum[i] = rev_odd_sum[i+1];
			}
			else
			{
				rev_even_sum[i] = rev_even_sum[i+1];
				rev_odd_sum[i] = rev_odd_sum[i+1] + A[i];
			}  
		}
		for(int i=0;i<A.length;i++)
		{
			if(i==0)
			{
				if(rev_odd_sum[i+1] == rev_even_sum[i+1])
				{
					count++;
				}
			}
			else if(i==A.length-1)
			{
				if(even_sum[i-1]==odd_sum[i-1])
				{
					count++;
				}
			}
			else
			{
				if(even_sum[i-1]+rev_odd_sum[i+1] == odd_sum[i-1]+rev_even_sum[i+1])
				{
					count++;
				}

			}
		}

		return count; 




		//     int count = 0;
		//     for(int i=0;i<A.length;i++)
		//     {
		//         int evensum=0;
		//         int oddsum =0;
		//         int index=0;
		//         for(int j=0;j<A.length;j++)
		//         {
		//             if(i==j)
		//                 continue;
		//             if(index%2==0)
		//                 evensum+=A[j];
		//             else
		//                 oddsum+=A[j];
		//             index++;
		//         }
		//          if(evensum == oddsum)
		//         {
		//         count++;
		//         }
		//     }
		//    return count;
	}

}
