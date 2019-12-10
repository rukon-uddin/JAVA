import java.util.Scanner;

public class CustopException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			System.out.println(getValue(x, y));
		}
		catch(NeagtiveException e)
		{
			e.printinfo();
		}
		
	}
	public static int getValue(int x, int y) throws NeagtiveException
	{
		if(x<0 || y<0)
		{
			throw new NeagtiveException("Negetive Exception Found Values: "+ x +", " + y);
		}
		return x+y;
	}
}
class NeagtiveException extends Exception{
	public String info;
	public NeagtiveException(String info) {
		this.info = info;
	}
	public void printinfo()
	{
		System.out.println(info);
	}
}
