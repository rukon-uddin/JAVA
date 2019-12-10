import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabProj {
	public static void main(String[] args) throws NullPointerException, FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int j;
		try {
			try {
				 throw new ArrayIndexOutOfBoundsException();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bound exception found");
				throw new NullPointerException();
			}
			finally {
				int y = sc.nextInt();
				int x = sc.nextInt();
				try {
					System.out.println(checkZero(y, x));
				}
				catch(X e){
					e.printInfo();
				}
				
			}
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception Found");
		}
				
	}
	public static int checkZero(int y, int x) throws X
	{
		if(x==0)
		{
			throw new X("Zero Found in dinomenator");
		}
		return y/x;
	}		
	
}
class X extends ArithmeticException{
	String info;
	public X(String info)
	{
		this.info = info;
	}
	public void printInfo()
	{
		System.out.println(info);
	}
}
