package Scaler_Problems2;

import java.util.Arrays;
import java.util.Collections;

public class SortingLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {0, 30, 34, 0, 9};
		
		SortingLargestNumber abc = new SortingLargestNumber();

		String result = abc.largestNumber(A);
		System.out.println(result);



	}
	public  String largestNumber( int A[]) {
		Integer[] input = Arrays.stream(A).boxed().toArray(Integer[]::new);
		for(Integer i:input)
		{
			System.out.println(i);
		}
		Arrays.sort(input,( x, y)-> compare((long) x,(long) y));
		//Arrays.sort(A,( x, y)-> y-x);

		StringBuilder str = new StringBuilder();

		for(int i=0;i<A.length;i++)
		{
			str.append(String.valueOf(input[i]));
		}
		return str.toString();
	}

	public  int compare (Long  arg1, Long arg2)
	{
		String A = String.valueOf(arg1);
		String B= String.valueOf(arg2);
		Long val1 = Long.valueOf(A+B);
		Long val2 = Long.valueOf(B+A);
		if(val1 > val2)
		{
			return -1;
		}
		else
		{
			return 1;
		}

	}

}





//if(A.length ==0){
//    return "";
//}
//
//String[] sa =  new String [A.length];
//
//for(int i=0;i<A.length;i++){
//    sa[i] = Integer.toString(A[i]);
//}
//
//Arrays.sort(sa,new Comparator<String>(){
//    @Override
//    public int compare(String o1, String o2) {
//        String a = o1+o2;
//        String b = o2+o1;
//        return b.compareTo(a);
//    }
//});
//
//if(sa[0].equals("0"))
// return "0";
//
//StringBuilder sb = new StringBuilder();
//for(String s:sa){
//    sb.append(s);
//}
//
//return sb.toString();
//}
