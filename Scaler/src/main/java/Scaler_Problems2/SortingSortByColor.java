package Scaler_Problems2;

public class SortingSortByColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int A[] = new int[] {0, 1, 2, 0, 1, 2};
		int res[] = sortColors(A);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}
	}
	 public static int[] sortColors(int[] A) {
	        // for(int i=0;i<A.length;i++)
	        // {
	        //     int minpos = i;
	        //     for(int j=i;j<A.length;j++)
	        //     {
	        //         if(A[j] < A[minpos])
	        //             minpos = j;
	        //     }
	        //     int temp = A[i];
	        //     A[i] = A[minpos];
	        //     A[minpos] = temp;
	        // }
	        // return A;
	        int left =0,right=A.length-1,curr=0;
	        while(curr<=right)
	        {
	            if(A[curr]==0)
	            {
	                swap(A,curr++,left++);
	            }
	            else if(A[curr] ==2)
	            {
	                swap(A,curr,right--);
	            }
	            else
	            {
	                curr++;
	            }
	        }
	        return A;
	    }
	    public static void swap(int[] A, int index1,int index2)
	    {
	        int temp = A[index1];
	        A[index1] = A[index2];
	        A[index2] = temp;
	    }

}
