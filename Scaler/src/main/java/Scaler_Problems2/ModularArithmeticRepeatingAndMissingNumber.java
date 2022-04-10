package Scaler_Problems2;

public class ModularArithmeticRepeatingAndMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {3,1,2,5,3};
		int res[] = repeatedNumber(A);
		System.out.println(res[0] +"  "+res[1]);

	}
	 // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(final int[] A) {
        int n = A.length;
        int actual_sum = 0;
        int actual_sum_squares = 0;
        int sum_of_n = (n*(n+1))/2;
        int squares_of_n = (n*(n+1)*((2*n) +1))/6;
       for(int i=0;i<A.length;i++)
        {
            actual_sum+=(long)A[i];
            actual_sum_squares += ((long)A[i]*A[i]);
        }
        int sum_A_B = actual_sum_squares - squares_of_n;
        int diff_A_B = actual_sum - sum_of_n;
        sum_A_B = sum_A_B/diff_A_B;
        int rep_ele = (sum_A_B + diff_A_B)/2;
        int miss_ele = sum_A_B - rep_ele;
      //  System.out.println(n +" " + actual_sum +" "+ sum_of_n +" "+squares_of_n +" " + actual_sum_squares +"  "+sum_A_B + " " +diff_A_B);

        return new int[]{rep_ele,miss_ele};

    }

}
