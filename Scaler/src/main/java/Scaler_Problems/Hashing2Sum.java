package Scaler_Problems;
/*
 * Problem Description

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2
 */

import java.util.HashMap;

public class Hashing2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] =  new int[] {2, 7, 11, 15};
		int B = 9;
		int res[] = twoSum(A,B);
		System.out.println(res[0] +" "+ res[1]);

	}
	
	 public static  int[] twoSum(final int[] A, int B) {

         HashMap<Integer,Integer> index = new HashMap<Integer,Integer>();
		  int index1 = -1;
		  int index2 = -1;
		  for(int i=0;i<A.length;i++)
		  {
			  int num = B-A[i];
			  if(index.containsKey(num))
			  {
				  index1 = index.get(num);
				  index2 = i;
				  break;
			  }
			  else if(!index.containsKey(A[i])){
				  index.put(A[i], i);
			  }
		  }
		  
          if(index1 == -1)
          {
              return new int[]{};
          }
		  return new int[] {index1+1,index2+1};
    }

}
