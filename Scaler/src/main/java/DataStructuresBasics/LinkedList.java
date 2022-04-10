package DataStructuresBasics;
import DataStructuresBasics.ListNode;

public class LinkedList {
	//	static Node head ;
	//	static int length = 0;
	//
	//	public static  void insert_node(int position, int value) {
	//		
	//		// @params position, integer
	//		// @params value, integer
	//		if(position > length+1)
	//			return ;
	//
	//		if(head ==null)
	//		{
	//			head = new Node();
	//			head.data = value;
	//		}
	//		else
	//		{
	//			Node new_node= new Node();
	//			new_node.data = value;
	//			Node insert_pos = head;
	//			Node prev_pos = null;
	//			int index=1;
	//			while(index<position)
	//			{
	//				prev_pos = insert_pos;
	//				insert_pos = insert_pos.next;
	//				index++;
	//			}
	//			new_node.next = insert_pos;
	//
	//			if(position==1)
	//			{
	//				head =  new_node.next;
	//			}
	//			else
	//			{
	//				prev_pos.next = new_node;
	//			}
	//		}
	//		length++;
	//	}
	//
	//	public  static  void delete_node(int position) {
	//		// @params position, integer
	//		if(head == null || position > length)
	//		{
	//			return;
	//		}
	//
	//		Node del_pos = head;
	//		
	//		Node prev_pos = null;
	//		int index = 1;
	//		while(index < position)
	//		{
	//			prev_pos= del_pos;
	//			del_pos = del_pos.next;
	//			index++;
	//			
	//		}
	//		if(position ==1)
	//		{
	//			head = head.next;
	//		}
	//		else
	//		{
	//			prev_pos.next = del_pos.next;
	//		}
	//		length--;
	//	}
	//
	//	public static  void print_ll() {
	//		// Output each element followed by a space
	//		if(head==null)
	//		{
	//			System.out.println("Empty Linkedl"
	//					+ "ist");
	//			return ;
	//		}
	//		Node temp = head;
	//		while(temp!=null)
	//		{
	//			System.out.print(temp.data +" ");
	//			temp=temp.next;
	//		}
	//		System.out.println();
	//	}


	static ListNode head = null;
	static int length = 0;

	public ListNode solve(int[][] A) {

		for(int i=0;i<A.length;i++)
		{
			int operation = A[i][0];
			if(operation == 0)
			{
				insert_node(0,A[i][1]);
				//  print_ll();
				//System.out.println("  " +i +"  "+ length);
			}
			else if(operation == 1)
			{

				if(length==0)
				{
					insert_node(0,A[i][1]);
				}
				else
				{
					insert_node(length,A[i][1]);
				}
				// System.out.println(res.data +"   "+ i +"   " + length);
				//print_ll();
				//	System.out.println("  " +i +"  "+ length);
			}
			else if(operation == 2)
			{

				if(length==0)
				{
					insert_node(0,A[i][1]);
				}
				else
				{
					insert_node(A[i][2],A[i][1]);
				}
				//System.out.println(res.data +"   "+ i +"  " + length);
				//   print_ll();
				// System.out.println("  " +i +"  " + length);
			}
			else if(operation == 3)
			{
				delete_node(A[i][1]);
				//   print_ll();
				//  	System.out.println("  " +i +"  "+ length);

			}
		}
		return head;
	}
	public static  void insert_node(int position, int value) {

		// @params position, integer
		// @params value, integer
		if((position > length) || (position<0))
			return ;
		//

		//System.out.println(position +"   insert method");

		if(head == null)
		{
			head = new ListNode(value);
			//	System.out.println(head.data +",,," + head.next);
		}
		else
		{
			ListNode new_node= new ListNode(value);
			ListNode insert_pos = head;
			ListNode prev_pos = null;
			int index=0;
			while(index<position)
			{
				prev_pos = insert_pos;
				insert_pos = insert_pos.next;
				index++;
			}
			new_node.next = insert_pos;


			if(position==0)
			{
				//System.out.println(insert_pos.data +"...." + insert_pos.next +"...." + new_node.data +"...."+ new_node.next);
				head =  new_node;
				//System.out.println(head.data +"...." + head.next +"...." + new_node.data +"...."+ new_node.next);
			}
			//else if()
			else
			{
				prev_pos.next = new_node;
			}
		}
		length++;
		//	return head;
	}

	public  static void delete_node(int position) {
		// @params position, integer
		if(head == null || position >= length)
		{
			return ;
		}
		//System.out.println(position +"indeleet method");

		ListNode del_pos = head;

		ListNode prev_pos = null;
		int index = 0;
		while(index < position)
		{
			prev_pos= del_pos;
			del_pos = del_pos.next;
			index++;

		}
		if(position ==0)
		{
			head = head.next;
		}
		else
		{
			prev_pos.next = del_pos.next;
		}
		length--;

	}
	public static  void print_ll() {
		// Output each element followed by a space
		if(head==null)
		{
			//System.out.println("Empty Linkedlist");
			return ;
		}
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
		//System.out.println();
	}

}
