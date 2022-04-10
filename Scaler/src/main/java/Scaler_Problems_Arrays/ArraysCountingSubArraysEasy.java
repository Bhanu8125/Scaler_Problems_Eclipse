package Scaler_Problems_Arrays;

public class ArraysCountingSubArraysEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2, 5, 6};
		int B = 10;
		System.out.println(solve(A,B));
	}
	public static int solve(int[] A, int B) {
	     int sum =0;
	     int count=0;
	     for(int i=0;i<A.length;i++)
	     {
	         sum = 0;
	        for(int j=i;j<A.length;j++)
	        {
	            sum +=A[j];
	            if(sum < B)
	                 count++;
	            else
	                 break;
	        }
	        
	     
	     }
	     return count;
	 }
}
	// public class Solution {
//  public int solve(int[] A, int B) {
//      int sum =0;
//      int count=0,total_count=0;
//      for(int i=0;i<A.length;i++)
//      {
//          sum = sum + A[i];
//          if(sum<B)
//          {
//              count++;
//          }
//          else 
//          {
//             total_count = total_count + (count*(count+1))/2;
//             sum = 0;
//             count = 0;
//             if(A[i] < B){
//                  total_count++;
//             }
//          }
//      }
//      if(total_count == 0)
//      {
//          return(A.length*(A.length+1))/2;
//      }
//      return total_count;
//  }
//}

////5,5,4,3,11
////10

//// 1 12 14  17 32
////i=0 ,j=i+1;
////pre[j] - pre[i] +A[i];




//5,5,4,3,11
//10

//1 12 14  17 32
//i=0 ,j=i+1;
//pre[j] - pre[i] +A


