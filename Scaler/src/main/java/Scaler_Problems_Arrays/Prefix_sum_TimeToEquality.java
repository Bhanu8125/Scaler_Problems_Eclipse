package Scaler_Problems_Arrays;
/*
 * Problem Description

Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints

1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format

First argument is an integer array A.


Output Format

Return an integer denoting the minimum time to make all elements equal.


Example Input

A = [2, 4, 1, 3, 2]


Example Output

8


Example Explanation

We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prefix_sum_TimeToEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2, 4, 1, 3, 2};
		System.out.println(solve(A));

	}
	public static int solve(int[] A) {
        int max = A[0];
        int sum =0;
    
         for(int i=1;i<A.length;i++){
             if(A[i]> max)
             {
                 max = A[i];
             }
         }
        for(int i=0;i<A.length;i++)
        {
            sum = sum + (max - A[i]);
        }
    return sum;
    }

}
//public class Solution {
//    public int solve(int[] A) {
//        int max=A[0];
//        int sum=A[0];
//        for(int i=1;i<A.length;i++)
//        {
//            if(A[i]>max)
//            {
//                max=A[i];
//            }
//            sum+=A[i];
//        }
//        return A.length*max-sum;
//        
//    }
//}
