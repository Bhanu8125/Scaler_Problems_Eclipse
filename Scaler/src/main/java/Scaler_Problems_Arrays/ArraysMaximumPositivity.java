package Scaler_Problems_Arrays;
/*
 * Problem Description
Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument given is the integer array A.



Output Format
Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.



Example Input
Input 1:

 A = [5, 6, -1, 7, 8]
Input 2:

 A = [1, 2, 3, 4, 5, 6]


Example Output
Output 1:

 [5, 6]
Output 2:

 [1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]
Explanation 2:

 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]
 */
import java.util.ArrayList;


public class ArraysMaximumPositivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1, 2, 3, 4, 5, 6};
		int res[] = solve(A);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] +" ");
		}

	}
	 public static int[] solve(int[] A) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int start_index = 0;
	        int end_index = -1;
	        int start_point = 0;
	        int len = 0,max_len = 0;
	        for(int i=0;i<A.length;i++)
	        {
	           if(A[i]<0)
	           {
	               len = i - start_point;
	           }
	           if(max_len < len)
	           {
	               max_len = len;
	              start_index = start_point;
	                end_index = i;
	           }
	            if(A[i] < 0)
	           {
	               start_point =i+ 1;
	           }
	        }
	        if(max_len < A.length - start_point)
	        {
	          start_index = start_point;
	           end_index = A.length; 
	        }
	         int arr [] = new int[end_index - start_index];
	        for(int i=start_index,j=0;i<end_index;i++,j++)
	            arr[j] =  A[i];
	        return arr;   
	    }

}




   








// import java.util.Collections;
// public class Solution {
//     public int[] solve(int[] A) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         int start_index = -1;
//         int end_index   = -1;
//         int count = 0;
//         for(int i = 0;i<A.length;i++)
//         {
//             if(A[i] < 0)
//             {
//                 list.add(i);
//             }
//         }
//         if(list.size() == 0)
//             return A;
//         int max_len = -1;
//         for(int i=0;i<list.size();i++)
//         {
//             int len = 0;
//             if(i==0 && list.size() == 1 && list.get(i) == 0)
//             {
//                 start_index = 1;
//                 end_index = A.length - 1;
//                 break;
//             }
//             else if(i==0)
//             {
//                 len = list.get(i);
//             }
//             else
//             {
//                 len = list.get(i) - list.get(i-1) - 1;
//             }
//             if(max_len<len)
//             {
//                 max_len = len;
//                 if(i==0)
//                     start_index = 0;
//                 else
//                     start_index = list.get(i-1) + 1;
//                 end_index =  list.get(i) - 1;
//             }
//         }
//         if(max_len < A.length -1 - (list.get(list.size() - 1)))
//         {
//             start_index = list.get(list.size() - 1) + 1;
//             end_index = A.length - 1;
//         }
//         int arr [] = new int[end_index - start_index +1];
//         for(int i=start_index,j=0;i<=end_index;i++,j++)
//             arr[j] =  A[i];
//         return arr;
//     }
//