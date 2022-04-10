package Scaler_Problems_Arrays;

public class ArraysRotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int[][] {{1,2},{3,4}};
		int res[][] =solve(A);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j] +" ");
			}
			System.out.println();
		}



	}
	    public static  int[][] solve(int[][] A) {
	        for(int i=0;i<A.length-1;i++)
	        {
	            for(int j=i+1; j<A[i].length;j++)
	            {
	                int temp = A[i][j];
	                A[i][j] = A[j][i];
	                A[j][i] = temp;
	            }
	        }
	        for(int i=0;i<A.length;i++)
	        {
	            for(int j=0,k=A[i].length-1;j<A[i].length/2;j++,k--)
	            {
	                int temp = A[i][j];
	                A[i][j] = A[i][k];
	                A[i][k] = temp;
	            }
	        }
	        // for(int i=0;i<A.length;i++)
	        // {
	        //     for(int j=0;j<A[i].length;j++)
	        //     {
	        //         System.out.print(A[i][j] +" ");
	        //     }
	        //     System.out.println();
	        // }
	        return A;
	    }
}
