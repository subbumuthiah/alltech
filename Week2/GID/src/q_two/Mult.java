package q_two;

public class Mult {

	public void mult(int n, int m) {
		System.out.println(Thread.currentThread().getName() + " Calulating " + n + " x " + m);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println(Thread.currentThread().getName() + " " + n + " x " + m + " = " + (n * m));
	}
}
