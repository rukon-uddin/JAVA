import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist {
	public static void main(String[] args)
	{
		HashTable();
	}
	public static void HashTable()
	{
		HashSet<Integer> h =new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(7);
		h.add(20);
		h.add(30);
		h.add(10);
		for(int it: h) {
			System.out.println(it);
		}
		System.out.println(h.size());
	}
	
}
