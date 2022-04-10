package Scaler_Problems2;

import java.util.Arrays;

public class SortingArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {3, 5, 1};
		System.out.println(solve(A));

	}
	
	public static int solve(int[] A) {
        if(A.length == 2) return 1;
        Arrays.sort(A);
        int prev_diff = A[1] -A[0];
        for(int i=2;i<A.length;i++)
        {
            int curr_diff = A[i] - A[i-1];
            if(curr_diff != prev_diff)
                return 0;
        }
        return 1;
    
    }

}
