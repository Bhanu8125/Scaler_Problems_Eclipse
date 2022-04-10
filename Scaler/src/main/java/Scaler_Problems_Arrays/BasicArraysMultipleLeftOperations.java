package Scaler_Problems_Arrays;

public class BasicArraysMultipleLeftOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1, 2, 3, 4, 5};
		int B[] = new int[] {2, 3};
		int res[][] = solve(A,B);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j] +" ");
			}
			System.out.println();		
		}

	}
	 public static int[][] solve(int[] A, int[] B) {
	        int Arr[][] = new int[B.length][A.length];
	        for(int i=0,row =0;i<B.length;i++,row++)
	        {
	         int col = 0;
	         B[i] = B[i]%A.length;
	         for(int j=0;j<A.length;j++,col++)
	         {
	             Arr[row][col]=A[(B[i]+j)%A.length];
	         }
	        //  for(int j=B[i];j<A.length;j++,col++)
	        //  {
	        //      Arr[row][col] = A[j];
	        //  }
	        //  for(int j=0;j<B[i];j++,col++)
	        //  {
	        //      Arr[row][col]=A[j];
	        //  }
	        }
	        return Arr;
	    }

}
