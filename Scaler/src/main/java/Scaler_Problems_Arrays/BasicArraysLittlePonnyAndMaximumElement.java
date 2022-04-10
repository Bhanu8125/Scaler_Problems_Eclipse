package Scaler_Problems_Arrays;

public class BasicArraysLittlePonnyAndMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2, 4, 3, 1, 5};
		int B = 3;
		System.out.println(solve(A,B));

	}
	 public static  int solve(int[] A, int B) {
	        int count =0;
	        boolean flag = false;
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]==B)
	            flag = true;
	            if(A[i]>B)
	            count++;
	        }
	        if(flag)
	        {
	            return count;
	        }
	        else
	        {
	            return -1;
	        }
	    }

}
