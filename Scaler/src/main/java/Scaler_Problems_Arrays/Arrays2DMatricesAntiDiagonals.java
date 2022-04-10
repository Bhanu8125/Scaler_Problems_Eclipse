package Scaler_Problems_Arrays;
/*
 * Problem Description

Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints

1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format

First argument is an integer N, denoting the size of square 2D matrix.
Second argument is a 2D array A of size N * N.


Output Format

Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input

Input 1:
3
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output

Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation

For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 */
public class Arrays2DMatricesAntiDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][] = new int[][] {{1, 2, 3},{ 4, 5, 6}, {7, 8, 9}};
		int res[][] = diagonal(A);
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.println(res[i][j] +" ");
			}
			System.out.println();
		}

	}
	 public static int[][] diagonal(int[][] A) {
	        int row = A.length + A[0].length -1;
	        int col = A[0].length;
	        int B[][] = new int[row][col];

	        row = 0;
	        for(int j=0;j<A[0].length;j++,row++)
	        {
	            int  I = 0;
	            int  J = j;
	            col = 0;
	            while(I<A.length && J>=0)
	            {
	                B[row][col] = A[I][J];
	                col++;
	                I++;J--;
	            }
	        }
	        for(int i=1;i<A.length;i++,row++)
	        {
	            int  I = i;
	            int  J = A[0].length -1;
	            col=0;
	            while(I<A.length && J>=0)
	            {
	                B[row][col] = A[I][J];
	                col++;
	                I++;J--;
	            }
	        }
	        return B;
	    }

}
