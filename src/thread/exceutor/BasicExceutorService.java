package thread.exceutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BasicExceutorService implements Runnable {

	private final int id;

	public BasicExceutorService(final int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Thread id : " + Thread.currentThread().getId());
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		singleThread();
		// fixedThread();
	}

	private static void singleThread() {
		System.out.println("****Single Thread Start***");
		final ExecutorService service = Executors.newSingleThreadExecutor();
		for (int j = 0; j < 5; j++) {
			service.submit(new BasicExceutorService(j));
		}
		System.out.println("****Single Thread End***");
	}

	private static void fixedThread() {
		System.out.println("****Fixed Thread End***");
		final ExecutorService service = Executors.newFixedThreadPool(5);
		for (int j = 0; j < 20; j++) {
			service.execute(new BasicExceutorService(j));
		}
		System.out.println("****Fixed Thread Start***");
	}

}
