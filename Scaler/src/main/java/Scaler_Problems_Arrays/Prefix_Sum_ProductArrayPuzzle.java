package Scaler_Problems_Arrays;

public class Prefix_Sum_ProductArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1, 2, 3, 4, 5};
		int res[] = solve(A);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}

	}
	public static int[] solve(int[] A) {
        int total_product = 1;
        int result[] = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            total_product*=A[i];
        }
        for(int i=0;i<result.length;i++)
        {
            result[i] = total_product/A[i];
        }
        return result;
    }

}
