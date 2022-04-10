package Scaler_Problems_Arrays;

public class BasicarraysArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1,2,3,2,1};
		int res[] =  solve(A);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}

	}
	public static int[] solve(final int[] A) {
		int i=0, j=A.length-1 ;
		while(i<j)
		{
			int temp = A[i];
			A[i]= A[j];
			A[j] = temp; 
			i++;
			j--;
		}
		return A;
	}

}
