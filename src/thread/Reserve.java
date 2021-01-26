package thread;

public class Reserve implements Runnable {

	int available = 1;
	int want;

	Reserve(int t){
		want = t;
	}

	@Override
	synchronized public void run() {
		System.out.println("available : " + available);
		if (available >= want) {
			System.out.println(want + " berth Booked for " + Thread.currentThread().getName());
			try {
				Thread.sleep(1500);
				available -=want ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Sorry no berth available");
		}
	}
}
