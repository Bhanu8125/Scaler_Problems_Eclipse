package Scaler_Problems_Arrays;
/*
 * Problem Description

Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints

1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109



Input Format

First argument is an integer array A.

Second argument is an integer B.



Output Format

Return 1 if good pair exist otherwise return 0.



Example Input

Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output

Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation

Explanation 1:

 (i,j) = (3,4)
Explanation 2:

No pair has sum equal to 4.
Explanation 3:

 (i,j) = (2,3)
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BasicArraysGoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1,2,3,4};
		int B = 7;
		System.out.println(solve(A,B));

	}
	 public static  int solve(int[] A, int B) {
	        //  for(int i=0;i<A.length-1;i++)
	        // {
	        //     for(int j=i+1;j<A.length;j++)
	        //     {
	        //         if(A[i]+A[j]==B)
	        //         {
	        //             return 1;
	        //         }
	        //     }
	        // }
	        // return 0;
	        HashSet<Integer> arr =  new HashSet<Integer>();
	        for(int i=0;i<A.length;i++)
	        {
	        	int num = B - A[i];
	        	//System.out.println(num +"..." +B +"..."+ A[i]);
	            if(arr.contains(num))
	            {
	                return 1;
	            }
	            else
	            {
	            	arr.add(A[i]);
	            }
	            //System.out.println(arr);
	        }
	        return 0;
	        
	    }

}
