package Scaler_Problems_Arrays;
/*
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 */

public class ArraysLengthOfLongestConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "111000";
		System.out.println(solve(A));

	}
	public static int solve(String A) {
	     int total_ones_count = 0;
	     boolean isFirstZero = false;
	     int length = 0;
	     int start_index = 0;
	     int max_len = 0;
	     for(int i=0;i<A.length();i++)
	     {
	         if(A.charAt(i) == '1')
	             total_ones_count++;
	     }

	     if(total_ones_count == A.length()) return total_ones_count;
	     int count =0;
	     for(int i =0;i<A.length();i++)
	     {
	         if(A.charAt(i) == '0')
	         {
	             if(!isFirstZero)
	             {
	                 count++;
	                 start_index = i;
	                 isFirstZero = true;
	             }
	             else
	             {
	                 count = i-start_index;
	                 start_index = i;
	             }
	         }
	         else
	         {
	             count++;
	         }
	         if(count>max_len)
	         {
	             max_len = count;
	         }
	     }
	     if(max_len>total_ones_count)
	     max_len = total_ones_count;
	     return max_len;

	 }
	
}

	// public class Solution {
//  public int solve(String A) {
//      int total_ones_count = 0;
//      boolean flag = false;
//      int left_ones_count = 0;
//      int index = 0;
//      int max_len = 0;
//      for(int i=0;i<A.length();i++)
//      {
//          if(A.charAt(i) == '1')
//              total_ones_count++;
//          else if(!flag)
//          {
//              left_ones_count = total_ones_count;
//              index = i;
//              flag = true;
//          }
//      }

//      if(total_ones_count == A.length()) return total_ones_count;
    
//      for(int i =index;i<A.length();i++)
//      {
//          int count = 0;
//          if(A.charAt(i) == '0')
//          {
//              for(int j=i+1;j<A.length();j++)
//              {
//                  if(A.charAt(j) == '1')
//                      count++;
//                  else
//                      break;
//              }
//              if(left_ones_count  + count == total_ones_count)
//              {
//                  max_len = total_ones_count;
//                  break;
//              }
//              else if(max_len < left_ones_count + count + 1)
//                  max_len = left_ones_count + count +1;
//              left_ones_count = count;
//          }
//      }
//      return max_len;

//  }
//}



 


