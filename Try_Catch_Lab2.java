import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab2 {
	public static void main(String[] args)
	{
		try {
			f1();
		}
		catch(Y e)
		{
			
		}
		
	}
	public static void f2()throws NullPointerException, ArithmeticException, IOException  
	{
		
	}
	public static void f1() throws Y
	{
		try {
			f2();
		}
		catch(NullPointerException e){
			
		}
		catch(ArithmeticException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		
		
	}
}
class Y extends Exception{
	
}
