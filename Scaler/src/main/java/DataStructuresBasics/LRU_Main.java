package DataStructuresBasics;
import DataStructuresBasics.LRU_Mentor;

public class LRU_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU_Mentor obj = new LRU_Mentor(3);
		obj.set(1, 5);
		obj.set(5, 4);
		obj.set(7, 5);
		
		obj.set(8, 5);
		obj.set(7, 10);
		obj.set(5, 22);
		
		obj.set(11, 40);
		

	}

}
