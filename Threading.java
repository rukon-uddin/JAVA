public class Threading {
	public static void main(String[] args) {
		Thread one = new Thread(new A());
		Thread two = new Thread(new B());
		one.start(); // it starts the threading 
		two.start(); // it simultaniously  start both thread
		try {
			one.join(); //join() it first completes thread one and then passes to next
			two.join();
		}
		catch(InterruptedException e) // always remember this exception
		{
			;
		}
		System.out.println(C.i);
	}
}
class C{
	public static int i = 0;
	public static synchronized void increment() // synchronize doesn't  allow other thread to interrupt while running or changing a value of a variable if  
	{											//if we don't write synchronize than if someone allows to change variable at the same time the variable will be disrupted
		i++;
	}
	public static synchronized void decrement()
	{
		i--;
	}
}
class A implements Runnable{

	@Override
	public void run() {
		System.out.println("I am thrad A");
		for(int i=0; i<500; i++)
		{
			C.increment();
		}
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
		System.out.println("I am thrad B");
		for(int i=0; i<500; i++)
		{
			C.decrement();
		}
	}
	
}
