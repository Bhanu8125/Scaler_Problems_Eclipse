package Scaler_Problems_Arrays;

public class ArraysGoodSubArraysEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		int B = 65;
		System.out.println(solve(A,B));
	}
	public static int solve(int[] A, int B) {
	    int sum =0;
	    int count = 0;
	    for(int i=0;i<A.length;i++)
	    {
	        sum = 0;
	        for(int j=i;j<A.length;j++)
	        {
	            sum=sum+A[j];
	            if((i + j)%2 == 0 && sum > B)
	                count++;
	            else if((i+j)%2 == 1 && sum < B)
	                count++;            
	        }
	    }
	    return count;
	    }

}
