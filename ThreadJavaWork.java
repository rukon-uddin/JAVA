public class Threadd {
	public static void main(String[] args) {
		Thread one = new Thread(new A());
		Thread two = new Thread(new B());

		one.start();
		two.start();
		try {
			one.join();
			two.join();
		} catch (InterruptedException e) {
			;
		}
	}
}

class Resources {
	public static int i;

	public synchronized void increment() {
		i += 100;
	}

	public synchronized void decrement() {
		i /= 2;
	}
}

class A implements Runnable {

	Resources r = new Resources();

	@Override
	public void run() {
		while (true) {

			r.increment();
			System.out.println("A: " + r.i);

		}

	}

}

class B implements Runnable {
	Resources r = new Resources();

	@Override
	public void run() {
		while (true) {

			r.decrement();
			System.out.println("B: " + r.i);
		}

	}

}
