package Scaler_Problems_Arrays;

public class BasicArraysMinimumPicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {5, 17, 100, 1};
		System.out.println(solve(A));

	}
	public static  int solve(int[] A) {
        int max_even = Integer.MIN_VALUE;
        int min_odd = Integer.MAX_VALUE;
        for(int ele : A)
        {
            if(ele%2==0 &&  max_even<ele)
            {
                max_even = ele;
            }
            if(Math.abs(ele%2)==1 && min_odd>ele)
            {
                min_odd = ele;
            }
        }
       // System.out.println(max_even + " " + min_odd);
        return max_even - min_odd;
    }

}
