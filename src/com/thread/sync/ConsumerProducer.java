package com.thread.sync;

public class ConsumerProducer {

	public static void main(final String[] args) {
		final ConsumerProducer cp = new ConsumerProducer();
		final Thread t1 = new Thread(() -> {
			try {
				cp.consumer();
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		});

		final Thread t2 = new Thread(() -> {
			try {
				cp.producer();
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

	public void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producing is using the lock ......");
			wait();
			System.out.println("Again Producing is using the lock ......");
		}
	}

	public void consumer() throws InterruptedException {
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Consumer is using the lock ......");
			notify();
		}
	}

}
