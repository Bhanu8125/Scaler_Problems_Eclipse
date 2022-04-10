package Scaler_Problems_Arrays;
/*
 * Problem Description

You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format

First argument is a vector of vector of integers.(2D matrix).



Output Format

Return a vector of vector after doing required operations.



Example Input

Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output

Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation

Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayRowToColumnZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int[][] {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
		int res[][] = solve(A);
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
	        int B[][] = new int[A.length][A[0].length];
	        List<Integer> index = new ArrayList<Integer>();
	        for(int i=0;i<A.length;i++)
	        {
	            for(int j=0;j<A[i].length;j++)
	            {
	                if(A[i][j] == 0)
	                {
	                    index.add(i);
	                    index.add(j);
	                }
	            }
	        }

	        for(int i=0,j=1;i<index.size();i+=2,j+=2)
	        {
	            int row = index.get(i);
	            int col = index.get(j);
	            int col_len = A[row].length;
	            int row_len = A.length;
	            for(int k=0;k<col_len;k++)
	            {
	                A[row][k] = 0;
	            }
	            for(int k=0;k<row_len;k++)
	            {
	                A[k][col] = 0;
	            }
	        }
	        return A;
	    }

}
