import java.util.Scanner;

abstract class Shape
{
	public int a;
	public abstract double getArea();
	public void getLength(int l)
	{
		this.a = l;
	}
}
class Circle extends Shape
{
	public Circle(int r)
	{
		this.a = r;
	}

	@Override
	public double getArea() {
		return 3.14*this.a*this.a;
	}
}
class Square extends Shape
{
	public Square(int l)
	{
		this.a = l;
	}
	@Override
	public double getArea() {
		return this.a*this.a*this.a;
	}
	
}
public class abstractlesson {
	public static void main(String[] args)
	{
		//Circle obj = new Circle(2);
		//System.out.println(obj.getArea());
		//Shape s = new Circle(2);
		Shape s = null;
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		switch(choose) {
		case 0:
			s = new Circle(5);
			System.out.println(s.getArea());
			break;
		case 1:
			s = new Square(5);
			s.getLength(7);
			System.out.println(s.getArea());
			break;
		default:
			System.out.println("Number 0 1 is acceptable");
		}
	}
}
