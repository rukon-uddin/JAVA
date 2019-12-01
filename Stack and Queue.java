import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Arraylist {
	public static void main(String[] args)
	{
		LL();
	}
	public static void LL()
	{
		LinkedList<Integer> ll =new LinkedList<Integer>();
		//STACK
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		System.out.println(ll.pop());
		//QUEUE
		ll.clear();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		System.out.println(ll.removeLast());
	
	}
}
