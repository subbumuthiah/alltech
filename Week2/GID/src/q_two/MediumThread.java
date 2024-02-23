package q_two;

public class MediumThread implements Runnable {

	private int n;
	Mult m;

	public MediumThread(int one, Mult mult) {
		// TODO Auto-generated method stub
		n = one;
		m = mult;
	}

	@Override
	public void run() {
//		synchronized(m) {
		for (int i = 1; i <= 20; i++) {
			m.mult(n, i);
//			}
		}
	}

}
