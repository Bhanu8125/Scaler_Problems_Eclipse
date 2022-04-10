package DataStructuresBasics;
import DataStructuresBasics.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		//		l1.insert_node(1, 10);
		//		l1.insert_node(2, 22);
		//		l1.insert_node(2, 23);
		//		l1.insert_node(2, 35);
		//		System.out.println("length  "+l1.length);
		//		l1.print_ll();
		//		
		//		l1.delete_node(1);
		//		System.out.println("length  "+l1.length);
		//		l1.print_ll();
		//		l1.delete_node(2);
		//		l1.print_ll();
		//		System.out.println("length  "+l1.length);
		//		
		// 		l1.print_ll();
		//		l1.delete_node(1);
		//		l1.print_ll();
		//		l1.insert_node(1, 10);
		//		l1.print_ll();
		//		l1.insert_node(2, 24);
		//		l1.print_ll();
		//		l1.insert_node(4, 32);
		//		l1.print_ll();

////
//		int[][] A=new int[][]{
//				{1, 13, -1},
//				{3, 0, -1},
//				{3, 1, -1},
//				{2, 15, 0},
//				{3, 0, -1},
//				{1, 12, -1},
//				{3, 0, -1},
//				{1, 19, -1},
//				{1, 13, -1},
//				{3, 0, -1},
//				{0, 12, -1},
//				{1, 13, -1},
//				{3, 2, -1}
//		};
		
		
		int A[][] = new int[][] {
			 {2, 18, 0},
					  {2, 5, 1},
					  {2, 8, 0},
					  {1, 7, -1},
					  {1, 5, -1}
		};
		ListNode result = l1.solve(A);
		int len=0;
		int lllen = l1.length;
		while(len<lllen)
		{
			System.out.print (result.data+" ");
			result =result.next;
			len++;
		}

	}

}
