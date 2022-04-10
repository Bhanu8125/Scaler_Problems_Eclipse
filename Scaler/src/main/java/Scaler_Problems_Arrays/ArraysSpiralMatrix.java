package Scaler_Problems_Arrays;

public class ArraysSpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=5;
		int res[][] = generateMatrix(A);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.println(res[i][j] +" ");
			}
			System.out.println();
		}

	}
	public static int[][] generateMatrix(int A) {
        int arr[][] = new int[A][A];
        int num=0, start_row=0,start_col=0,end_row=A-1,end_col=A-1;
        while(start_row<=end_row && start_col<=end_col)
        {
            for(int j= start_col;j<=end_col;j++)
                arr[start_row][j] = ++num;

            for(int i = start_row+1;i<end_row;i++)
                arr[i][end_col] = ++num;

            if(start_row != end_row)
            {
                for(int j=end_col;j>=start_col;j--)
                     arr[end_row][j] = ++num;
            }

            for(int i = end_row-1;i>start_row;i--)
                arr[i][start_col] = ++num;

            start_row++;start_col++;end_row--;end_col--;
            
        }
        return arr;
    }
}
