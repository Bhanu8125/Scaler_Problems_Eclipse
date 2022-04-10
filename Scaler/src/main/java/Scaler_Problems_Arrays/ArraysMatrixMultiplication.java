package Scaler_Problems_Arrays;

public class ArraysMatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  A[][] = new int[][] {{1, 2},{3,4}};          
		int B[][]  = new int[][] {{5, 6},{7,8}};
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
	 public static int[][] solve(int[][] A, int[][] B) {
	        int sum = 0;
	        int C[][] = new int[A.length][B[0].length];
	        for(int i=0;i<A.length;i++)
	        {
	            for(int j=0;j<B[0].length;j++)
	            {
	                sum = 0;
	                for(int k=0;k<B.length;k++)
	                {
	                        sum+=(A[i][k] * B[k][j]);
	                }
	                C[i][j] = sum;
	            }
	        }
	        return C;
	    }

}
