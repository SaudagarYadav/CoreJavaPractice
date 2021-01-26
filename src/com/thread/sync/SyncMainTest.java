package com.thread.sync;

public class SyncMainTest {

	static int counter = 0;

	public static void main(final String[] args) throws InterruptedException {
		process();
		System.out.println("Final :" + counter);
	}

	private static synchronized void incrementCounter() {
		counter++;
	}

	private static void process() throws InterruptedException {
		final Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread 1 : " + counter);
				incrementCounter();
			}
		});
		final Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread 2 : " + counter);
				incrementCounter();
			}
		});

		t1.start();
		t2.start();
		t1.join();

	}
}
