package Scaler_Problems_Arrays;
/*
 * Problem Description
You are given an integer array A of length N comprising of 0's & 1's, and an integer B.

You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.

A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.



Problem Constraints
1 <= N <= 105

A[i] equals to 0 or 1.

0 <= B <= (N - 1) / 2



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer array containing indices(0-based) in sorted order. If no such index exists, return an empty integer array.



Example Input
Input 1:

 A = [1, 0, 1, 0, 1]
 B = 1 
Input 2:

 A = [0, 0, 0, 1, 1, 0, 1]
 B = 0 


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [0, 1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 Index 1 acts as a centre of alternating sequence: [A0, A1, A2]
 Index 2 acts as a centre of alternating sequence: [A1, A2, A3]
 Index 3 acts as a centre of alternating sequence: [A2, A3, A4] 
Explanation 2:

 Each index in the array acts as the center of alternating sequences of lengths 1.
 */
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ArraysAlternatingSubArraysEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[] = new int[] {0, 0, 0, 1, 1, 0, 1};
		 int B = 0;
		 int res[] = solve(A,B);
		 for(int i=0;i<A.length;i++)
		 {
			 System.out.print(A[i] +" ");
		 }
		

	}
	 public static int[] solve(int[] A, int B) {
	        int sub_Array_Length = 2*B+1;
	        List<Integer> res_Array = new ArrayList<Integer>();
	        if(sub_Array_Length == 1)
	        {
	           res_Array = IntStream.rangeClosed(0, A.length -1)
	                            .boxed().collect(Collectors.toList()); //creating an arraylist from 0 to n-1 as values.

	            
	          int res_Index_Array[] = res_Array.stream()
	                            .mapToInt(Integer::intValue)  ///converting array list int array
	                            .toArray();
	   
	            return res_Index_Array;
	        }
	        
	        int count =0;
	        int index =0;
	        for(int i=1;i<sub_Array_Length;i++)
	        {
	            if(A[i] != A[i-1])
	            {
	                count++;
	            }
	        }
	        if(count == sub_Array_Length - 1)
	        {
	            res_Array.add(sub_Array_Length/2);
	        }
	        for(int i = sub_Array_Length,j=1;i<A.length;i++,j++)
	        {
	            if(A[j] != A[j-1] && count != 0)
	            {
	                count--;
	            }
	            if(A[i] != A[i-1])
	            {
	                count++;
	            }
	            if(count == sub_Array_Length -1)
	            {
	                index = sub_Array_Length/2 + j;
	                res_Array.add(index);
	            }
	        }

	                 
	          int res_Index_Array[] = res_Array.stream()
	                            .mapToInt(Integer::intValue)
	                            .toArray();
	            return res_Index_Array;
	    }
	

}




/*
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Solution {
    public int[] solve(int[] A, int B) {
        int sub_Array_Length = 2*B+1;
        List<Integer> res_Array = new ArrayList<Integer>();
        if(sub_Array_Length == 1)
        {
             int res_Index_Array[] = new int[A.length];
            for(int i=0;i<A.length;i++)
            {
                res_Index_Array[i] = i;
            }
            return res_Index_Array;
        }
        
        int count =0;
        int index =0;
        for(int i=1;i<sub_Array_Length;i++)
        {
            if(A[i] != A[i-1])
            {
                count++;
            }
        }
        if(count == sub_Array_Length - 1)
        {
            res_Array.add(sub_Array_Length/2);
        }
        for(int i = sub_Array_Length,j=1;i<A.length;i++,j++)
        {
            if(A[j] != A[j-1] && count != 0)
            {
                count--;
            }
            if(A[i] != A[i-1])
            {
                count++;
            }
            if(count == sub_Array_Length -1)
            {
                index = sub_Array_Length/2 + j;
                res_Array.add(index);
            }
        }

         int[] res_Index_Array = new int[res_Array.size()]; 
             for(int i=0;i<res_Array.size();i++)
            {
                res_Index_Array[i] = res_Array.get(i);
              
            }
            res_Array = al.toArray(res_Index_Array); 
                 

    
        
        //int empty_Array[] = null;
        // int count = 0;
        // int index = 0;
        // for(int i=1;i<A.length;i++)
        // {
        //       if(count<0)//
              
              
        //       || (i%sub_Array_Length==0))
        //     {
        //         count = 0;
        //     }

        //     if(A[i]!=A[i-1])
        //     {
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        //     // if(count<0)
        //     // {
        //     //     count = 0;
        //     // }
        //     if(count == sub_Array_Length -1)
        //     {
        //         index = i-(sub_Array_Length/2);
        //         res_Array.add(index);
        //         count = sub_Array_Length -2;
        //     }
        // }
        //      int[] res_Index_Array = new int[res_Array.size()]; 
        //      for(int i=0;i<res_Array.size();i++)
        //     {
        //         res_Index_Array[i] = res_Array.get(i);
              
        //     }
        //     // res_Array = al.toArray(res_Index_Array); 
        //     return res_Index_Array;
    }
}
*/