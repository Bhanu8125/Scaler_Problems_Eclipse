package Scaler_Problems_Arrays;
/*
 * Problem Description

Given an integer array A and an integer B, you have to print the same array after rotating it B times towards the right.

NOTE: You can use extra memory.



Problem Constraints

1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109



Input Format

The first line begins with an integer A denoting the length of an array, and then A integers represent the array elements.
The second line contains a single integer B



Output Format

Print an array of integers which is the Bth right rotation of input array A, on a separate line.



Example Input

Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output

Output 1:

 3 4 1 2
Output 2:

 1 2 2


Example Explanation

Explanation 1:

 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

Explanation 2:


 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
 */

import java.util.Scanner;

public class BasicArraysRotationGame {

	 static int arr[];
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        arr = new int[size];
	        for(int i=0;i<size;i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        int rot = sc.nextInt();
	        rot = rot%size;
	        reverse(0,size-1);
	        reverse(0,rot-1);
	        reverse(rot,size-1);
	        for(int ele : arr)
	        {
	            System.out.print(ele +" ");
	        }
	    }
	    public static void reverse(int i, int j){
	        while(i<j)
	        {
	         int temp = arr[i];
	         arr[i]= arr[j];
	         arr[j] = temp; 
	         i++;
	         j--;
	        }
	    }


}
