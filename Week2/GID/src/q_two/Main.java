package q_two;

public class Main extends Thread {

	public synchronized static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread main = Thread.currentThread();
		Mult mu = new Mult();
		Thread m = new Thread(new MediumThread(6, mu));
		Thread f = new Thread(new FastThread(8, mu));
		Thread s = new Thread(new SlowThread(6, mu));
		s.setPriority(MIN_PRIORITY);
		s.setName("SLOW");
		m.setPriority(NORM_PRIORITY);
		m.setName("MEDIUM");
		f.setPriority(MAX_PRIORITY);
		f.setName("FAST");
		f.start();
		s.start();
		m.start();
		try {
			f.join();
			s.join();
			m.join();
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		f.interrupt();
		s.interrupt();
		m.interrupt();
		System.out.println("Done, child thread completed");
	}
}
