package Scaler_Problems;
/*
 * 
 * Problem Description

You are given an array of N integers, A1, A2 ,…, AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



Input Format

First argument is an integer array A
Second argument is an integer B.



Output Format

Return an integer array.



Example Input

Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output

Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation

Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].
 */

import java.util.HashMap;

public class HashingDistinctNumbersInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] =  new int[] {1, 2, 1, 3, 4, 3};
		int B = 3;
		int res[] = dNums(A,B);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}

	}
	
	 public static int[] dNums(int[] A, int B) {
	        int res_length = A.length-B+1;
			 int res[] = new int[res_length];
			 int count = 0;
			 HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
			 for(int i=0;i<B;i++) {
				 if(freq.containsKey(A[i])) {
					 count = freq.get(A[i])+1;
					 freq.put(A[i],count);
				 }
				 else
					 freq.put(A[i], 1);
			 }
			 res[0] = freq.size();
			 for(int i=1;i<=A.length-B;i++)
			 {
				 int index = i+B-1;
				 if(freq.containsKey(A[index]))
				 {
					 count = freq.get(A[index])+1;
					 freq.put(A[index],count);
				 }
				 else
				 {
					 freq.put(A[index], 1);
				 }
				count = freq.get(A[i-1])-1; 
				freq.put(A[i-1],count);
				if(freq.get(A[i-1])==0)
					freq.remove(A[i-1]);
				res[i]= freq.size();
			 }
			 return res;
	    }

}
