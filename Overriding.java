class getcube
{
	public int cube(int n) {
		return n*n*n;
	}
}
public class Overriding {
	public static void main(String[] args) {
		take obj = new take();
		System.out.println(obj.cube(3));
		take2 objj = new take2();
		System.out.println(objj.cube(3));
	}
	
}
class take extends getcube{
	
	 @Override
	 public int cube(int n) {
		return n*n*n*2;
	}
	
}
class take2 extends getcube{
	public int cube(int n) {
		return 2*super.cube(n);
	}
}
