package Scaler_Problems;

import java.util.Scanner;

public class RecursionStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printReverse(str,str.length()-1);
	}
	
	public static void printReverse(String str,int index)
	{
		if (index == -1)
		{
			return ;
		}
		System.out.print(str.charAt(index));
		printReverse(str,index -1);
	}

}
