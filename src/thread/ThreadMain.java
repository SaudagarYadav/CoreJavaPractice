package thread;

public class ThreadMain {

	public static void main(String[] args) {

		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r, "Sauadgar");
		Thread t2 = new Thread(r, "Amit");
		t1.start();
		t2.start();
	}

}
