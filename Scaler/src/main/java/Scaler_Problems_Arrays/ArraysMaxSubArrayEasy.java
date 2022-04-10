package Scaler_Problems_Arrays;

public class ArraysMaxSubArrayEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5,B = 12;
		int C[] = new int[] {2, 1, 3, 4, 5};
		System.out.println(maxSubarray(A,B,C));

	}
	 public static int maxSubarray(int A, int B, int[] C) {
	        int sum =0,max_sum = 0;
	        int last_point = 0;
	        for(int i=0;i<A;i++)
	        {
	            sum+=C[i];
	            if(sum > B)
	            {
	                for(int j=last_point;j<=i;j++)
	                {
	                    sum-=C[j];
	                    if(sum==B)
	                        return sum;
	                    else if(sum < B)
	                    {
	                        last_point = j+1;
	                        break;
	                    }
	                }
	            }
	            if(max_sum<sum && sum<=B)
	            {
	                max_sum = sum;
	            }

	        }
	        return max_sum;
	    }
}
