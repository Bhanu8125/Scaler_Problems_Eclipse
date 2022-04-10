package Scaler_Problems;

import java.util.HashMap;
/*
 * 
 * Problem Description

Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints

1 <= N <= 106

-107 <= A[i] <= 107



Input Format

Single argument which is an integer array A.



Output Format

Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input

A = [1,2,-2,4,-4]


Example Output

[2,-2,4,-4]


Example Explanation

[2,-2,4,-4] is the longest sequence with total sum of zero.
 */

public class HashingLargestContinuousSequenceZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1,2,-2,4,-4};
		int res[] = lszero(A);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}
		

	}
	
	public static  int[] lszero(int[] A) {
		 HashMap<Integer,Integer> prefix_Index = new HashMap<Integer,Integer>();
		 prefix_Index.put(0,-1);
		 int max_length = 0;
		 int start_index = -1;
		 int sum =0;
		 for(int i=0;i<A.length;i++)
		 {
		     sum = sum + A[i];
		     Integer prev_Index = prefix_Index.get(sum);
		     if(prev_Index != null)
		     {
		         int length = i - prefix_Index.get(sum);
		          if(max_length < length) {
		             max_length =  length; 
		             start_index = prefix_Index.get(sum) + 1;
		         }
		     }
		     else
		     {
		         prefix_Index.put(sum,i);
		     }
		 }
		 if(max_length > 0)
		 {
		     int res[] = new int[max_length];
		     int index = 0;
		     while(index<max_length)
		     {
		         res[index] = A[start_index + index];
		         index++;
		     }
		     return res;
		 }
		 else
		 {
		     int res[] = {};
		     return res;
		 }

		}


}

//public class Solution {
//public int[] lszero(int[] A) {
//HashMap<Integer,Integer> prefix_index = new HashMap<Integer,Integer>();
//	int max_length = -1;
//	int start_index = 0;
//	int end_index = 0;
//	int sum =0;
//	// if(sum==0) {
//	// 	max_length = 1;
//	// }
//	int length = -1;
	
//	//prefix_index.put(A[0],0);
//	for(int i=0;i<A.length;i++) {
//		sum = sum+A[i];
//		if(sum == 0) {
//			length = i+1;
//			max_length = i+1;
//			start_index = 0;
//			end_index = i;
//		}
//		else if(prefix_index.containsKey(sum))
//		{
//			//System.out.println(prefix_index  +"....." + start_index +"....." + end_index +"......." + max_length);
//			length = i - prefix_index.get(sum) ;
//			if(max_length<length)
//			{
//				max_length =  length;
//				start_index = prefix_index.get(sum) + 1;
//				end_index = i;
//			}
//		}
//		else
//			prefix_index.put(sum,i);
		
//	}
////	System.out.println(prefix_index  +"\n" + start_index +"....." + end_index +"\n" + max_length);

	
//	if(prefix_index.size() == A.length && !prefix_index.containsKey(0)) {
//		int res[]= {};
//		return res;
//	}
//	else
//	{
//		int res[] = new int[max_length];
//		for(int i=start_index,j=0;i<=end_index;i++,j++)
//			res[j] = A[i];
//		return res;
//	}
//}
//}








