import java.util.Scanner;

interface Shape
{
	public int getArea();
}

public class ShapeTest {
	public static void main(String[] args) {
		Shape s= null;
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 0: 
			s= new Circle(5);
			break;
		case 1:
			s = new Square(5);
			break;
		}
		System.out.println(s.getArea());
	}
}
class Circle implements Shape{

	public int r = 0;
	public Circle(int r) {
		this.r = r;
	}
	@Override
	public int getArea() {
		return (int) (this.r*this.r*3.149);
	}
	
	
}
class Square implements Shape{

	public int l = 0;
	public Square(int l) {
		this.l = l;
	}
	@Override
	public int getArea() {
		return this.l*this.l;
	}
	
}

