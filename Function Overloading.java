import java.util.Scanner;

public class Overloading_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int num = input.nextInt();
		double double_num = input.nextDouble();
		Overloading_Class obj = new Overloading_Class();		
		System.out.println(obj.square_str(str));
		System.out.println(obj.square_str(num));
		System.out.println(obj.square_str(double_num));
		obj.reverse_print(2, 5.5);
		obj.reverse_print(5.5, 2);
	}
	
	public int square_str(String str) {
		int k = Integer.parseInt(str);
		return k*k;
	}
	public int square_str(int k) {
		return k*k;
	}
	public double square_str(double k) {
		return k*k;
	}
	
	
	public void reverse_print(int x, double y) {
		System.out.println("X: "+ x + "    Y: "+ y);
	}
	public void reverse_print(double y, int x) {
		System.out.println("Y: "+ y + "  X: "+ x);
	}
	
	
}
