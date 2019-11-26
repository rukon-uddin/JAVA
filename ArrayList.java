import java.util.*;
public class Demo {
	public static void main(String[] args) {
		ArrayList<String> fruits_name = new ArrayList<String>();
		ArrayList<String> fruits_name_copy = new ArrayList<String>();
		/**
		 * .add is the way you add element in a array list
		 */
		fruits_name.add("Apricot");
		fruits_name.add("Tomato");
		fruits_name.add("Avacado");
		fruits_name.add("PassionFruit");
		fruits_name.add("Rambutan");
		fruits_name_copy = fruits_name;
		for(Object var: fruits_name) {
			System.out.println(var);
		}
		System.out.println("Size = "+fruits_name.size());
		System.out.println("\n After Sorting\n");
		/**
		 * Collections is a class that has the sort function.
		 */
		Collections.sort(fruits_name_copy);
		
		for(Object var: fruits_name) {
			System.out.println(var);
		}
		System.out.println("Size = "+fruits_name_copy.size());
		System.out.println("\n\n After reverseing the sorted eements\n");
		/**
		 * Collection.reverseOrder() is the way you sort it in descending order
		 */
		Collections.sort(fruits_name_copy, Collections.reverseOrder());
		
		for(Object var: fruits_name_copy) {
			System.out.println(var);
		}
		System.out.println("Size = "+fruits_name_copy.size());
		
		Collections.sort(fruits_name);
		
		System.out.println("\n After adding Apple\n");
		
		fruits_name.add(1, "Apple");
		
		for(Object var: fruits_name) {
			System.out.println(var);
		}
		System.out.println("Size = "+fruits_name.size());
		System.out.println("\n Remove Apricot\n");
		/**
		 * .remove(index) is the way to a specific element 
		 */
		fruits_name.remove(2);
		
		for(Object var: fruits_name) {
			System.out.println(var);
		}
		System.out.println("Size = "+fruits_name.size());
	}
}
