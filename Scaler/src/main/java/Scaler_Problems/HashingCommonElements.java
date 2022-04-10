package Scaler_Problems;
/*
 * 
 * Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explanation 2:

 Elements (2, 10) appears in both the array.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class HashingCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static int[] solve(int[] A, int[] B) {
	      HashMap<Integer,Integer> map_A = freqCount(A);
	      int res[] = findCommonElements(B,map_A);
			return res;
	    }

	    public static HashMap<Integer,Integer> freqCount(int arr[])
		{
			HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
			for(int i=0;i<arr.length;i++)
			{
				if(freq.containsKey(arr[i]))
				{
					int count =  freq.get(arr[i]) + 1;
					freq.put(arr[i],count);
				}
				else
				{
					freq.put(arr[i], 1);
				}
			}
			return freq;
		}
	    public static int[]  findCommonElements(int[] arr, HashMap<Integer,Integer> map_A)
		{
			ArrayList<Integer> comm_ele = new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++)
			{
				if(map_A.containsKey(arr[i]))
				{
					comm_ele.add(arr[i]);
					map_A.put(arr[i], (map_A.get(arr[i])-1));
					if(map_A.get(arr[i])==0) {
						map_A.remove(arr[i]);
					}
				}	
			}
			int res[] = comm_ele.stream().mapToInt(Integer::intValue).toArray();
			
			return res;
		}

}
