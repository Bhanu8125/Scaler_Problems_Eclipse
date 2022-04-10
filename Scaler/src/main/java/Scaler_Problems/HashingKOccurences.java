package Scaler_Problems;
/*
 * 
 * Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency K.

He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).

But the sum he ended up getting was huge so he prints it modulo 10^9+7.

In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:

1.   1<=N<=100000
2.   1<=K<=N
3.   0<=H[i]<=10^9
Input: Integers N and K and array of size A

Output: Sum of all numbers in the array that occur exactly K times.

Example:

Input:

N=5 ,K=2 ,A=[1 2 2 3 3]
Output:

5
Explanation:

There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
 */

import java.util.HashMap;
import java.util.Map;

public class HashingKOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A =5;
		int B =2;
		int C[] = new int[] {1 ,2, 2 ,3 ,3};
		System.out.println(getSum(A,B,C));
		

	}
	
	public static  int getSum(int A, int B, int[] C) {
		 HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
		 long sum = 0;
		 for(int i=0;i<A;i++)
		 {
		     if(freq.containsKey(C[i]))
		     {
		             freq.put(C[i], (freq.get(C[i]) + 1));
		     }
		     else
		     {
		         freq.put(C[i] , 1);
		     }
		 }
		boolean isVisited = false;
			for(Map.Entry<Integer, Integer> valueCount : freq.entrySet())
			{
				if(valueCount.getValue() == B){
					sum += valueCount.getKey();
					isVisited = true;
		     }
			}
			if(!isVisited) 
		     return -1;
			else 
		     return (int)sum%((int)Math.pow(10,9)+7) ;
		}


}


//public class Solution {
//public int getSum(int A, int B, int[] C) {
//  HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
//  long sum = 0;
//  for(int i=0;i<A;i++)
//  {
//      if(freq.containsKey(C[i]))
//      {
//              freq.put(C[i], (freq.get(C[i]) + 1));
//      }
//      else
//      {
//          freq.put(C[i] , 1);
//      }
//      if(freq.get(C[i]) == B)
//              sum+=C[i];
     
//  }
//  if(freq.size()==A && B!=1)
//      return -1;
//  else if(freq.containsKey(0) && freq.get(0) == A)
//      return -1;
//  else
//      return (int)sum%(10^9+7);
//}
//}



