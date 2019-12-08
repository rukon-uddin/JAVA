import java.util.Scanner;

public class ExceptionHndling {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print an integer: ");
		int i = sc.nextInt();
		try {
			System.out.println(5/i);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("End of Program");
		
	}
}
