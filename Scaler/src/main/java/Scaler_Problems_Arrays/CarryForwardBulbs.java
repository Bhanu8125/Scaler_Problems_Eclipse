package Scaler_Problems_Arrays;

public class CarryForwardBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {0, 1, 0, 1};
		System.out.println(bulbs(A));

	}
	public static  int bulbs(int[] A) {
		if(A.length ==0)
			return 0;
		int prev_switch = A[0];
		// int curr_switch = A[0];
		int count=0;
		if(A[0]==0)
		{
			count=1;
		}
		for(int i=1;i<A.length;i++)
		{
			if(prev_switch!=A[i])
			{
				count++;
				prev_switch = A[i];
			}
		}
		return count;
	}

}
